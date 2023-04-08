package com.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UsuarioController {
    @Autowired
    UsuarioRegister usuarioRegister;

    public Usuario loginUser(String cpf, String senha) {
        Usuario user = usuarioRegister.findUsuarioByCpf(cpf);
        if (user != null && user.getSenha().equals(senha)) {
            return user;
        } else {
            return null;
        }
    }
}
