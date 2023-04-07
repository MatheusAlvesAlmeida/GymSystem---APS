package com.account.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UsuarioRegister {
    private IUsuarioRepository UsuarioRepository;

    public UsuarioRegister(IUsuarioRepository UsuarioRepository) {
        this.UsuarioRepository = UsuarioRepository;
    }

    public Usuario findUsuarioByCpf(String cpf) {
        return UsuarioRepository.findUsuarioByCpf(cpf);
    }

    public void save(Usuario user) {
        UsuarioRepository.save(user);
    }

    public Iterable<Usuario> findAll() {
        return UsuarioRepository.findAll();
    }
}
