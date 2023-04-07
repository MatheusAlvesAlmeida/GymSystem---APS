package com.treino;

import org.springframework.beans.factory.annotation.Autowired;

public class TreinoController {
    private TreinoObservable treinoObservable;
    @Autowired private TreinoRegister treinoRegister;

    public TreinoController(TreinoObservable treinoObservable) {
        this.treinoObservable = treinoObservable;
    }

    public void createNewTreino(Treino treino) {
        treinoRegister.insert(treino);
        treinoObservable.notifyObservers(treino);
    }

    public void deleteTreino(int id) {
        treinoObservable.notifyObservers(treinoRegister.getTreinoById(id));
        treinoRegister.delete(id);
    }

    public void updateTreino(int id, Treino treino) {
        treinoRegister.update(id, treino);
        treinoObservable.notifyObservers(treino);
    }

    public Iterable<Treino> getAllTreinos() {
        return treinoRegister.getAll();
    }

    public Treino getTreinoById(int id) {
        return treinoRegister.getTreinoById(id);
    }
    
}
