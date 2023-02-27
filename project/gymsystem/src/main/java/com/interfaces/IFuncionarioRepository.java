package com.interfaces;

import java.util.List;

import com.entities.Funcionario;

public interface IFuncionarioRepository {
    public List<Funcionario> getAllUsuarios();
    public Funcionario getUsuario(String cpf);
    public void addUsuario(Funcionario usuario);
    public void updateUsuario(String cpf, Funcionario usuario);
    public void deleteUsuario(String cpf);
}
