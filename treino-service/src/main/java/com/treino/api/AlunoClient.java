package com.treino.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class AlunoClient {
    @Autowired RestTemplate restTemplate;

    public void notifyAluno(String alunoId) {
        restTemplate.postForEntity("http://aluno-service/api/alunos/" + alunoId + "/notify", null, Void.class);
    }
}
