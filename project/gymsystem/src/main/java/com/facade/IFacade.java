package com.facade;

import java.util.List;

import com.aluno.Aluno;
import com.funcionario.Funcionario;

public interface IFacade {
    void createNewFuncionario(Funcionario funcionario);
    void createNewAluno(Aluno aluno);

    Iterable<Funcionario> getAllFuncionarios();
    List<Aluno> getAllAlunos();

    Funcionario getFuncionarioByCpf(String cpf);
    Aluno getAlunoByCpf(String cpf);

    void deleteFuncionario(String cpf);
    void deleteAluno(String cpf);

    void updateFuncionario(String cpf, Funcionario funcionario);
    void updateAluno(String cpf, Aluno aluno);
}
