package com.treino.model;

public interface ITreinoRepository {
    void insert(Treino treino);

    void delete(int id);

    Iterable<Treino> getAll();

    Treino getTreinoById(int id);

    void update(int id, Treino treino);
}
