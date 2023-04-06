package com.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aluno.Aluno;
import com.facade.Facade;
import com.funcionario.Funcionario;
import com.usuario.Usuario;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginAPI {
    @Autowired
    Facade facade;

    @PostMapping
    public String login(@RequestParam("cpf") String cpf,
            @RequestParam("password") String password,
            HttpSession session) {
        Usuario user = facade.loginUser(cpf, password);
        if (user instanceof Funcionario) {
            return "redirect:/funcionario";
        } else if (user instanceof Aluno) {
            return "redirect:/aluno";
        } else {
            return "redirect:/login?error";
        }
    }
}
