package com.aluno;

import org.springframework.stereotype.Component;

@Component
public class AlunoRegister{

    private IAlunoRepository AlunoRepository;

    public AlunoRegister(IAlunoRepository AlunoRepository){
        this.AlunoRepository = AlunoRepository;
    }

    public void insert(Aluno aluno){
        AlunoRepository.insert(aluno);
    }

    public void delete(String cpf){
        AlunoRepository.delete(cpf);
    }

    public Iterable<Aluno> getAll(){
        return AlunoRepository.getAll();
    }

    public Aluno getAlunoByCpf(String cpf){
        return AlunoRepository.getAlunoByCpf(cpf);
    }

    public void update(String cpf, Aluno aluno){
        AlunoRepository.update(cpf, aluno);
    }
}