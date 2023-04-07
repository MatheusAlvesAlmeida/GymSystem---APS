package com.account.model;

import java.util.List;

public interface IUsuarioRepository {
    Usuario findUsuarioByCpf(String cpf);

    void save(Usuario user);

    Iterable<Usuario> findAll();
}
