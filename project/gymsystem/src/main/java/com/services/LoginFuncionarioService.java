package com.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.entities.Funcionario;
import com.repositories.FuncionarioRepository;

public class LoginFuncionarioService implements UserDetailsService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public UserDetails loadUserByUsername(String cpf) throws UsernameNotFoundException {
        Funcionario funcionario = funcionarioRepository.findFuncionarioByCpf(cpf);
        if (funcionario == null) {
            throw new UsernameNotFoundException("Funcionário not found");
        }
        return new org.springframework.security.core.userdetails.User(funcionario.getCpf(),
                funcionario.getPassword(),
                new ArrayList<>());
    }
}
