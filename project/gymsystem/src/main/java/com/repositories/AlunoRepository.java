package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, String> {

    Aluno findAlunoByCpf(String cpf);
}
