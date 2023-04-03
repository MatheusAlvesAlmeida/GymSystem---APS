package com.treino;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "treinos")
public class Treino {

    @Column(name = "id")
    private int id;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "tipo")
    private String tipo;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
