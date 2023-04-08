package com.treino.model;

import lombok.Data;

@Data
public class TreinoDTO {
    private String alunoID;
    private String descricao;
    private String tipo;

    public Treino toEntity(){
        return Treino.builder()
                .alunoID(alunoID)
                .descricao(descricao)
                .tipo(tipo)
                .build();
    }
}
