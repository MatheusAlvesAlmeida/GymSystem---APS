package com.usuario;

import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioController {
    @Autowired UsuarioRegister usuarioRegister;
    
    public Usuario loginUser(String cpf, String password) {
        Usuario user = usuarioRegister.findUsuarioByCpf(cpf);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }else {
            return null;
        }
    }
}
