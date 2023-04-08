package com.aluno;

import com.treino.Treino;
import com.usuario.Usuario;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos")

public class Aluno extends Usuario {
    @Column(name = "plano")
    private String plano;
    @Column(name = "dataInicio")
    private String dataInicio;
    @OneToOne
    @JoinColumn(name = "treino_id")
    private String treinoID;

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

    public String getTreinoID() {
        return treinoID;
    }

    public void setTreinoID(String treinoID) {
        this.treinoID = treinoID;
    }
}
