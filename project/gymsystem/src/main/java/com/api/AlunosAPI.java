package com.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.aluno.Aluno;
import com.aluno.AlunoRegister;
import com.facade.Facade;

@RestController
@RequestMapping("/api/alunos")
public class AlunosAPI {}
