package com.entities;

import java.util.ArrayList;
import java.util.List;

import com.services.Observer;

import jakarta.persistence.*;

@Table(name = "alunos")

public class Aluno extends Usuario {
    @Column(name = "plano")
    private String plano;
    @Column(name = "dataInicio")
    private String dataInicio;
    @Column(name = "treino")
    private String treino;
    @Transient
    private List<Observer> observers = new ArrayList<>();


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

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
