package com.aluno.model;

import lombok.Data;

@Data
public class AlunoDTO {
    private String cpf;
    private String senha;
    private String nome;
    private String telefone;
    private String dataNascimento;
    private String email;
    private String plano;
    private String dataInicio;
    private String treinoID;

    public Aluno toEntity(){
        return Aluno.builder()
                .cpf(cpf)
                .senha(senha)
                .nome(nome)
                .telefone(telefone)
                .dataNascimento(dataNascimento)
                .email(email)
                .plano(plano)
                .dataInicio(dataInicio)
                .treinoID(treinoID)
                .build();
    }
}
