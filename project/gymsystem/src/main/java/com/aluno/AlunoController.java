package com.aluno;

import org.springframework.beans.factory.annotation.Autowired;

import com.treino.Treino;
import com.treino.TreinoObservable;

public class AlunoController implements AlunoObserver{
    @Autowired AlunoRegister alunoRegister;
    private TreinoObservable treinoObservable;

    public AlunoController(TreinoObservable treinoObservable) {
        this.treinoObservable = treinoObservable;
        this.treinoObservable.addObserver(this);
    }

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

    @Override
    public void onTreinoUpdated(Treino treino) {
        Aluno aluno = alunoRegister.getAlunoByCpf(treino.getAluno().getCpf());
        aluno.setTreino(treino);
        alunoRegister.update(aluno.getCpf(), aluno);
        // Enviar email
    }
}
