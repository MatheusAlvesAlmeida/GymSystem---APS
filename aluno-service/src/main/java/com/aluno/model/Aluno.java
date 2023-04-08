package com.aluno.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "alunos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Aluno {
    
    @Id private String cpf;
    private String senha;
    private String nome;
    private String telefone;
    private String dataNascimento;
    private String email;
    private String plano;
    private String dataInicio;
    private String treinoID;
}
