package com.Registers;

import org.springframework.stereotype.Service;

import com.entities.Funcionario;
import com.repositories.FuncionarioRepository;

@Service
public class FuncionarioRegister{

    private FuncionarioRepository funcionarioRepository;

    public Funcionario getFuncionario(String cpf) {
        try {
            return funcionarioRepository.findFuncionarioByCpf(cpf);            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

    public Funcionario saveFuncionario(Funcionario funcionario) {
        try {
            return funcionarioRepository.save(funcionario);         
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;        
    }
    // Other methods as needed...
}