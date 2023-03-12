package com.entities;

import java.util.ArrayList;
import java.util.List;

import com.services.AlunoObserver;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos")

public class Aluno extends Usuario {
    private List<AlunoObserver> observers = new ArrayList<>();
    
    @Column(name = "plano")
    private String plano;
    @Column(name = "dataInicio")
    private String dataInicio;
    @Column(name = "treino")
    private String treino;

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

    public String getTreino() {
        return treino;
    }

    public void setTreino(String treino) {
        this.treino = treino;
        notifyObservers();
    }

    public void addObserver(AlunoObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(AlunoObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (AlunoObserver observer : observers) {
            observer.update(this);
        }
    }
}
