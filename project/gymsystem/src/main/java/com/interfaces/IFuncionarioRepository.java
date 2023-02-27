package com.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Funcionario;


public interface IFuncionarioRepository extends JpaRepository<Funcionario, String> { }