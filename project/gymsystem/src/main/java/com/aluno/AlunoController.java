package com.aluno;

import com.email.EmailSender;
import com.treino.Treino;
import com.treino.TreinoObservable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AlunoController implements AlunoObserver {
    @Autowired
    AlunoRegister alunoRegister;
    private TreinoObservable treinoObservable;

    @Autowired
    private EmailSender emailService;

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

    public void onTreinoUpdated(Treino treino) {
        List<Aluno> alunos = treino.getAlunos();
        if (alunos != null) {
            for (Aluno aluno : alunos) {
                aluno.setTreino(treino);
                alunoRegister.update(aluno.getCpf(), aluno);

                String to = aluno.getEmail();
                String subject = "Treino Atualizado";
                String text = "Querido " + aluno.getNome()
                        + ",\n\nSeu treino foi atualizado, confira em nosso site.\n\nAtenciosamente,\n\nGymSystem";

                try {
                    emailService.sendSimpleMail(to, subject, text);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}