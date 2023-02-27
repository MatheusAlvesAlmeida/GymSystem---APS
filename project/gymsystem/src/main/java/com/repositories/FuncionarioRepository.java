package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, String> {}