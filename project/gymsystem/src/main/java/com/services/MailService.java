package com.services;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;

@Service
public class MailService {
	private static final Logger logger = LoggerFactory.getLogger(MailService.class);
	
	public String sendTextEmail(String _to) {
		// the sender email should be the same as we used to Create a Single Sender Verification
		    Email from = new Email("pmssm@cin.ufpe.br");
		    String subject = "Atualização.";
		    Email to = new Email(_to);
		    Content content = new Content("text/plain", "Seu treinador atualizou seu treino, verifique e mantenha-se no foco!");
		    Mail mail = new Mail(from, subject, to, content);
		
		    SendGrid sg = new SendGrid("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");
		    Request request = new Request();
		    try {
		      request.setMethod(Method.POST);
		      request.setEndpoint("mail/send");
		      request.setBody(mail.build());
		      Response response = sg.api(request);
		      logger.info(response.getBody());
		      return response.getBody();	     
		    } catch (Exception e) {
		      // handle exception
			  return "";
		    }	   
	}
}