package com.treino;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "treinos")
public class Treino {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "alunos")
    @OneToOne(mappedBy = "treino")
    private String alunoID;
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

    public String getAlunoID() {
        return alunoID;
    }

    public void setAlunoID(String alunoID) {
        this.alunoID = alunoID;
    }
}
