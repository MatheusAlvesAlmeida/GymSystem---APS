package com.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos")

public class Aluno extends Usuario{
    @Column(name = "plano")
    private String plano;
    @Column(name = "dataInicio")
    private String dataInicio;
    @Column(name = "treino")
    private Treino treino;

    // Getters and Setters
    public String getPlano() {
        return plano;
    }
    public void setPlano(String plano) {
        this.plano = plano;
    }
    public String getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    public Treino getTreino() {
        return treino;
    }
    public void setTreino(Treino treino) {
        this.treino = treino;
    }
}
