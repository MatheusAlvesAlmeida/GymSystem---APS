package com.funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FuncionarioRegister{
    @Autowired private IFuncionarioRepository funcionarioRepository;

    public void insert(Funcionario funcionario) {
        funcionarioRepository.insert(funcionario);
    }

    public void delete(String cpf) {
        funcionarioRepository.delete(cpf);
    }

    public Iterable<Funcionario> getAll() {
        return funcionarioRepository.getAll();
    }

    public Funcionario getFuncionarioByCpf(String cpf) {
        return funcionarioRepository.getFuncionarioByCpf(cpf);
    }

    public void update(String cpf, Funcionario funcionario) {
        funcionarioRepository.update(cpf, funcionario);
    }
}