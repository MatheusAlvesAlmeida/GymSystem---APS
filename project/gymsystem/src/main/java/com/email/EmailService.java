package com.email;

public interface EmailService {

    String sendSimpleMail(String to, String subject, String text);
}