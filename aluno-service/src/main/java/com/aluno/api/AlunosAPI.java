package com.aluno.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.aluno.model.Aluno;
import com.aluno.model.AlunoController;


@RestController
@RequestMapping("/api/alunos")
@CrossOrigin(origins = "http://localhost:4200")
public class AlunosAPI {
    @Autowired AlunoController controller;

    @RequestMapping
    public ResponseEntity<Iterable<Aluno>> getAlunos() {
        Iterable<Aluno> alunos = controller.getAllAlunos();
        return ResponseEntity.ok(alunos);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<Object> postAluno(@RequestBody Aluno aluno) {
        controller.createNewAluno(aluno);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public ResponseEntity<Object> deleteAluno(@RequestBody String cpf) {
        controller.deleteAluno(cpf);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<Object> putAluno(@RequestBody String cpf, Aluno aluno) {
        controller.updateAluno(cpf, aluno);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/notify")
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<Object> notifyAluno(@RequestBody String cpf) {
        controller.notifyUpdate(cpf);
        return ResponseEntity.ok().build();
    }
}
