package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Funcionario;
import com.repositories.FuncionarioRepository;

import jakarta.servlet.http.HttpSession;

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

    @PostMapping("/login")
    public String login(@RequestParam("cpf") String cpf,
            @RequestParam("password") String password,
            HttpSession session) {
        Funcionario funcionario = funcionarioRepository.findFuncionarioByCpf(cpf);
        if (funcionario != null && funcionario.getPassword().equals(password)) {
            session.setAttribute("funcionario", funcionario);
            return "redirect:/funcionario/home";
        } else {
            return "redirect:/funcionario/login?error";
        }
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "funcionario-login";
    }

}
