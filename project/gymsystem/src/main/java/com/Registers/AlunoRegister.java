package com.Registers;

import org.springframework.stereotype.Service;

import com.entities.Aluno;
import com.repositories.AlunoRepository;

@Service
public class AlunoRegister{

    private AlunoRepository AlunoRepository;

    public Iterable<Aluno> getAlunos() {
        try {
            return AlunoRepository.findAll();  
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

    public Aluno saveAluno(Aluno Aluno) {
        try {
            return AlunoRepository.save(Aluno);         
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;        
    }
    // Other methods as needed...
}