package com.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioJPARepository implements IUsuarioRepository{

    @Autowired UsuarioDAO usuarioDAO;

    @Override
    public Usuario findUsuarioByCpf(String cpf) {
        return usuarioDAO.findById(cpf).get();
    }
    
}
