package com.funcionario;

public interface IFuncionarioRepository {

    void insert(Funcionario funcionario);

    void delete(String cpf);

    Iterable<Funcionario> getAll();

    Funcionario getFuncionarioByCpf(String cpf);

    void update(String cpf, Funcionario funcionario);
}