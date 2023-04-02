package com.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aluno.Aluno;
import com.funcionario.Funcionario;
import com.funcionario.FuncionarioController;

@Service
public class Facade implements IFacade{

    @Autowired private FuncionarioController funcionarioController;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAluno'");
    }

    @Override
    public void updateAluno(String cpf, Aluno aluno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAluno'");
    }

    @Override
    public Aluno getAlunoByCpf(String cpf) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAlunoByCpf'");
    }

    @Override
    public List<Aluno> getAllAlunos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAlunos'");
    }
    
    @Override
    public void createNewAluno(Aluno aluno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createNewAluno'");
    }
}
