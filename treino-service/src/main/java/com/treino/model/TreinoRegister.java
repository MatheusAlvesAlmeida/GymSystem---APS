package com.treino.model;

import org.springframework.stereotype.Component;

@Component
public class TreinoRegister{
    private ITreinoRepository TreinoRepository;

    public TreinoRegister(ITreinoRepository TreinoRepository){
        this.TreinoRepository = TreinoRepository;
    }

    public void insert(Treino treino){
        TreinoRepository.insert(treino);
    }

    public void delete(int id){
        TreinoRepository.delete(id);
    }

    public Iterable<Treino> getAll(){
        return TreinoRepository.getAll();
    }

    public Treino getTreinoById(int id){
        return TreinoRepository.getTreinoById(id);
    }

    public void update(int id, Treino treino){
        TreinoRepository.update(id, treino);
    }
}
