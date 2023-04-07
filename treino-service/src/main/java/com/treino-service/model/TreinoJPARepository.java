package com.treino;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TreinoJPARepository implements ITreinoRepository{
    @Autowired TreinoDAO treinoDAO;

    @Override
    public void insert(Treino treino) {
        treinoDAO.save(treino);
    }

    @Override
    public void delete(int id) {
        treinoDAO.deleteById(id);
    }

    @Override
    public Iterable<Treino> getAll() {
        return treinoDAO.findAll();
    }

    @Override
    public Treino getTreinoById(int id) {
        return treinoDAO.findById(id).get();
    }

    @Override
    public void update(int id, Treino treino) {
        treinoDAO.deleteById(id);
        treinoDAO.save(treino);
    }
}
