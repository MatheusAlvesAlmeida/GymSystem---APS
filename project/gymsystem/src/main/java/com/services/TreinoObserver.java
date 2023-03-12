package com.services;

import com.entities.Aluno;

public class TreinoObserver implements AlunoObserver {
    private String observerState;
    private MailService mailService;

    @Override
    public void update(Aluno aluno) {
        observerState =  aluno.getEmail();
        mailService.sendTextEmail(observerState);
    }
}