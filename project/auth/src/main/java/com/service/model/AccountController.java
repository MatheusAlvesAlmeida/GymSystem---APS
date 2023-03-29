package main.java.com.service.model;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountController {

    @Autowired
    private AccountCollection accountCollection;

    public Account get(String cpf, String password) {
        return accountCollection.get(cpf, password);
    }
}