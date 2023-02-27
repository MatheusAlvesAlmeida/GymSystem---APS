package com.entities;

import javax.persistence.Entity;

@Entity
public class Funcionario extends Usuario {
    private double salario;

    public Funcionario(String nome, String cpf, String telefone, String email, String senha, String endereco,
            String tipoDeUsuario, double salario) {
        super();
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}