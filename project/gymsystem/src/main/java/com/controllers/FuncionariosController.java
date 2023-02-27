package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Funcionario;
import com.repositories.FuncionarioRepository;

@RestController
@RequestMapping("/api/funcionarios")
class FuncionariosController {
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    
    @RequestMapping
    public Iterable<Funcionario> getFuncionarios() {
        return funcionarioRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Funcionario postFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
    
}
