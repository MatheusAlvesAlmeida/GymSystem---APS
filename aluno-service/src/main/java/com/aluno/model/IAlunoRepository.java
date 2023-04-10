package com.aluno.model;

public interface IAlunoRepository{
    void insert(Aluno aluno);

    void delete(String cpf);

    Iterable<Aluno> getAll();

    Aluno getAlunoByCpf(String cpf);

    void update(String cpf, Aluno aluno);

    void notifyUpdate();
}
