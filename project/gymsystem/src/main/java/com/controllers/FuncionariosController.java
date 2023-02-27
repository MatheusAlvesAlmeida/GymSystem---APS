package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repositories.FuncionarioRepository;

@RestController
@RequestMapping("/api/funcionarios")
class FuncionariosController {
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    
}
