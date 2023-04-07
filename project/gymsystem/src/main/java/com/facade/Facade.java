package com.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aluno.Aluno;
import com.aluno.AlunoController;
import com.funcionario.Funcionario;
import com.funcionario.FuncionarioController;
import com.treino.Treino;
import com.treino.TreinoController;
import com.usuario.Usuario;
import com.usuario.UsuarioController;

@Service
public class Facade {

    @Autowired private FuncionarioController funcionarioController;
    @Autowired private AlunoController alunoController;
    @Autowired private UsuarioController usuarioController;
    @Autowired private TreinoController treinoController;

    public Usuario loginUser(String cpf, String password) {
        return usuarioController.loginUser(cpf, password);
    }

    public void createNewFuncionario(Funcionario funcionario) {
        funcionarioController.createNewFuncionario(funcionario);
    }

    
    public Iterable<Funcionario> getAllFuncionarios() {
        return funcionarioController.getAllFuncionarios();
    }

    
    public Funcionario getFuncionarioByCpf(String cpf) {
        return funcionarioController.getFuncionarioByCpf(cpf);
    }

    
    public void deleteFuncionario(String cpf) {
        funcionarioController.deleteFuncionario(cpf);
    }

    
    public void updateFuncionario(String cpf, Funcionario funcionario) {
        funcionarioController.updateFuncionario(cpf, funcionario);
    }

    
    public void deleteAluno(String cpf) {
        alunoController.deleteAluno(cpf);
    }

    
    public Iterable<Aluno> getAllAlunos() {
        return alunoController.getAllAlunos();
    }

    
    public Aluno getAlunoByCpf(String cpf) {
        return alunoController.getAlunoByCpf(cpf);
    }
    
    
    public void createNewAluno(Aluno aluno) {
        alunoController.createNewAluno(aluno);
    }

    
    public void updateAluno(String cpf, Aluno aluno) {
        alunoController.updateAluno(cpf, aluno);
    }

    public void deleteTreino(int id) {
        treinoController.deleteTreino(id);
    }

    public void updateTreino(int id, Treino treino) {
        treinoController.updateTreino(id, treino);
    }

    public void createNewTreino(Treino treino) {
        treinoController.createNewTreino(treino);
    }

    public Iterable<Treino> getAllTreinos() {
        return treinoController.getAllTreinos();
    }
}
