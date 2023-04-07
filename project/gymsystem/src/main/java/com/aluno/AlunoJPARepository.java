package com.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AlunoJPARepository implements IAlunoRepository{
    @Autowired AlunoDAO alunoDAO;

    @Override
    public void insert(Aluno aluno) {
        alunoDAO.save(aluno);
    }

    @Override
    public void delete(String cpf) {
        alunoDAO.deleteById(cpf);
    }

    @Override
    public Iterable<Aluno> getAll() {
        return alunoDAO.findAll();
    }

    @Override
    public Aluno getAlunoByCpf(String cpf) {
        return alunoDAO.findById(cpf).get();
    }

    @Override
    public void update(String cpf, Aluno aluno) {
        alunoDAO.deleteById(cpf);
        alunoDAO.save(aluno);
    }
    
}
