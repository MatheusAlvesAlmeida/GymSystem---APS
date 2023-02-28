package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, String> {

    Funcionario findFuncionarioByCpf(String cpf);
}