package com.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aluno.Aluno;
import com.aluno.AlunoController;
import com.funcionario.Funcionario;
import com.funcionario.FuncionarioController;

@Service
public class Facade implements IFacade{

    @Autowired private FuncionarioController funcionarioController;
    @Autowired private AlunoController alunoController;

    @Override
    public void createNewFuncionario(Funcionario funcionario) {
        funcionarioController.createNewFuncionario(funcionario);
    }

    @Override
    public Iterable<Funcionario> getAllFuncionarios() {
        return funcionarioController.getAllFuncionarios();
    }

    @Override
    public Funcionario getFuncionarioByCpf(String cpf) {
        return funcionarioController.getFuncionarioByCpf(cpf);
    }

    @Override
    public void deleteFuncionario(String cpf) {
        funcionarioController.deleteFuncionario(cpf);
    }

    @Override
    public void updateFuncionario(String cpf, Funcionario funcionario) {
        funcionarioController.updateFuncionario(cpf, funcionario);
    }

    @Override
    public void deleteAluno(String cpf) {
        alunoController.deleteAluno(cpf);
    }

    @Override
    public Iterable<Aluno> getAllAlunos() {
        return alunoController.getAllAlunos();
    }

    @Override
    public Aluno getAlunoByCpf(String cpf) {
        return alunoController.getAlunoByCpf(cpf);
    }
    
    @Override
    public void createNewAluno(Aluno aluno) {
        alunoController.createNewAluno(aluno);
    }

    @Override
    public void updateAluno(String cpf, Aluno aluno) {
        alunoController.updateAluno(cpf, aluno);
    }
}
