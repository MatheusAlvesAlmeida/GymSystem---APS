package com.aluno.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AlunoController {
    @Autowired AlunoRegister alunoRegister;

    public void createNewAluno(Aluno aluno) {
        alunoRegister.insert(aluno);
    }

    public void deleteAluno(String cpf) {
        alunoRegister.delete(cpf);
    }

    public void updateAluno(String cpf, Aluno aluno) {
        alunoRegister.update(cpf, aluno);
    }

    public Iterable<Aluno> getAllAlunos() {
        return alunoRegister.getAll();
    }

    public Aluno getAlunoByCpf(String cpf) {
        return alunoRegister.getAlunoByCpf(cpf);
    }

    // @Override
    // public void onTreinoUpdated(Treino treino) {
    //     List<Aluno> alunos = treino.getAlunos();
    //     for (Aluno aluno : alunos) {
    //         aluno.setTreino(treino);
    //         alunoRegister.update(aluno.getCpf(), aluno);
    //     }
    //     // Enviar email
    // }
}
