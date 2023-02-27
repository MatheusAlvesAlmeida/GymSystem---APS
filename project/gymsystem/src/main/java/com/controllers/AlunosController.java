package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Aluno;
import com.repositories.AlunoRepository;

@RestController
@RequestMapping("/api/alunos")
public class AlunosController {
    @Autowired
    private AlunoRepository alunoRepository;

    @RequestMapping
    public Iterable<Aluno> getAlunos() {
        return alunoRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Aluno postAluno(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }
}
