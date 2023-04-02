package com.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.aluno.Aluno;
import com.aluno.IAlunoRepository;

public class LoginAlunoService implements UserDetailsService {

    @Autowired
    private IAlunoRepository alunoRepository;

    @Override
    public UserDetails loadUserByUsername(String cpf) throws UsernameNotFoundException {
        Aluno aluno = alunoRepository.findAlunoByCpf(cpf);
        if (aluno == null) {
            throw new UsernameNotFoundException("Aluno not found");
        }
        return new org.springframework.security.core.userdetails.User(aluno.getCpf(),
                aluno.getPassword(),
                new ArrayList<>());
    }
}
