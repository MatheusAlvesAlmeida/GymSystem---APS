package com.funcionario;

import org.springframework.beans.factory.annotation.Autowired;

public class FuncionarioController {
    @Autowired FuncionarioRegister funcionarioRegister;

    public void createNewFuncionario(Funcionario funcionario) {
        funcionarioRegister.insert(funcionario);
    }

    public void deleteFuncionario(String cpf) {
        funcionarioRegister.delete(cpf);
    }

    public void updateFuncionario(String cpf, Funcionario funcionario) {
        funcionarioRegister.update(cpf, funcionario);
    }

    public Iterable<Funcionario> getAllFuncionarios() {
        return funcionarioRegister.getAll();
    }

    public Funcionario getFuncionarioByCpf(String cpf) {
        return funcionarioRegister.getFuncionarioByCpf(cpf);
    }
}
