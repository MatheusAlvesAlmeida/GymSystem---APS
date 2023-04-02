package com.funcionario;

import com.entities.Usuario;

import jakarta.persistence.*;

@Entity
@Table(name = "funcionarios")

public class Funcionario extends Usuario {
    @Column(name = "cargo")
    private String cargo;
    @Column(name = "salario")
    private double salario;
    @Column(name = "dataAdmissao")
    private String dataAdmissao;

    // Getters and Setters
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getDataAdmissao(){
        return this.dataAdmissao;
    }
    public void setDataAdmissao(String dataAdmissao){
        this.dataAdmissao = dataAdmissao;
    } 

}