package com.usuario;

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
}
