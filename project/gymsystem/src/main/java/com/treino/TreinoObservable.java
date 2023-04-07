package com.treino;

import java.util.ArrayList;
import java.util.List;

import com.aluno.AlunoObserver;

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
