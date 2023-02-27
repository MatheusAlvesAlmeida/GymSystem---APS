package com.registers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Funcionario;
import com.repositories.FuncionarioRepository;

@Service
public class FuncionarioRegister{
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    public FuncionarioRegister(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> getAllUsuarios() {
        List<Funcionario> usuarios = new ArrayList<Funcionario>();
        funcionarioRepository.findAll().forEach(usuarios::add);
        return usuarios;
    }

    public Funcionario getUsuario(String cpf) {
        return funcionarioRepository.findById(cpf).get();
    }

    public void addUsuario(Funcionario usuario) {
        funcionarioRepository.save(usuario);
    }

    public void updateUsuario(String cpf, Funcionario usuario) {
        funcionarioRepository.save(usuario);
    }

    public void deleteUsuario(String cpf) {
        funcionarioRepository.deleteById(cpf);
    }
}
