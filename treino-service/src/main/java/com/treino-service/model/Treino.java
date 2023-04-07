package com.treino;

import java.util.List;

import com.aluno.Aluno;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "treinos")
public class Treino {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "alunos")
    @OneToOne(mappedBy = "treino")
    private String id_aluno;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "tipo")
    private String tipo;
    
    public String getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(String id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Aluno> getAlunos(){
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
