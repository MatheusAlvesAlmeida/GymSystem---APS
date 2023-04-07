package com.account.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
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

    public void registerUser(Usuario user) {
        usuarioRegister.save(user);
    }

    public Usuario findUserByCpf(String cpf) {
        return usuarioRegister.findUsuarioByCpf(cpf);
    }

    public Iterable<Usuario> getAll(){
        return usuarioRegister.findAll();
    }
}
