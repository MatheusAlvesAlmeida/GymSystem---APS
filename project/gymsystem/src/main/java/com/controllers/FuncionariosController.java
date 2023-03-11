package com.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
@CrossOrigin(origins = "http://localhost:4200")
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
        System.out.println(funcionario);
        return funcionarioRepository.save(funcionario);
    }

    @PutMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Funcionario putFuncionario(@RequestBody Funcionario funcionario) {
        funcionarioRepository.delete(funcionario);
        return funcionarioRepository.save(funcionario);
    }

    @DeleteMapping
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteFuncionario(@RequestBody Funcionario funcionario) {
        funcionarioRepository.delete(funcionario);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> body) {
        String cpf = body.get("cpf");
        String password = body.get("password");
        Funcionario funcionario = funcionarioRepository.findFuncionarioByCpf(cpf);
        if (funcionario != null && funcionario.getPassword().equals(password)) {
            // session.setAttribute("funcionario", funcionario);
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid login credentials");
        }
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "funcionario-login";
    }

}
