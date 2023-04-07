package com.account.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioJPARepository implements IUsuarioRepository{

    @Autowired UsuarioDAO usuarioDAO;

    @Override
    public Usuario findUsuarioByCpf(String cpf) {
        return usuarioDAO.findById(cpf).get();
    }

    @Override
    public void save(Usuario user) {
        usuarioDAO.save(user);
    }

    @Override
    public Iterable<Usuario> findAll() {
        return usuarioDAO.findAll();
    }
    
}
