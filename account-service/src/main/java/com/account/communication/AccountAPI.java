package com.account.communication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.account.model.Usuario;
import com.account.model.UsuarioController;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/account")
@Slf4j
public class AccountAPI {
    @Autowired UsuarioController usuarioController;

    @GetMapping("")
    public Iterable<Usuario> getAll(Model model) {
        log.info("AccountAPI.getAll()");
        return usuarioController.getAll();
    }

    @PostMapping("/register")
    public Usuario registerUser(Usuario user) {
        log.info("AccountAPI.registerUser()");
        usuarioController.registerUser(user);
        return user;
    }
    
    @PostMapping("/login")
    public Usuario loginUser(String cpf, String password) {
        log.info("AccountAPI.loginUser()");
        return usuarioController.loginUser(cpf, password);
    }
}