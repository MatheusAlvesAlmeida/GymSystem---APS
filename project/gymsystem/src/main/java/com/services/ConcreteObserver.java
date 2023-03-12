package com.services;

import java.io.IOException;

import com.entities.Aluno;
import com.services.MailService;

public class ConcreteObserver implements Observer {
    private String observerState;
    private MailService mailService;

    public void update(Aluno aluno) {
        observerState =  aluno.getEmail();
        mailService.sendTextEmail(observerState);
    }
}