package com.treino;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.aluno.AlunoObserver;

@Component
public class TreinoObservable {
    private List<AlunoObserver> observers = new ArrayList<>();

    public void addObserver(AlunoObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(AlunoObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Treino treino) {
        for (AlunoObserver observer : observers) {
            observer.onTreinoUpdated(treino);
        }
    }
}
