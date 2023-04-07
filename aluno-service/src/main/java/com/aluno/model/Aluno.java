package com.aluno.model;

@Entity
@Table(name = "alunos")

public class Aluno extends Usuario {
    @Column(name = "plano")
    private String plano;
    @Column(name = "dataInicio")
    private String dataInicio;
    @ManyToOne
    @JoinColumn(name = "treino_id")
    private String treinoID;

    // Getters and Setters
    public String getPlano() {
        return plano;
    }
    public void setPlano(String plano) {
        this.plano = plano;
    }
    public String getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    public String getTreinoID() {
        return treinoID;        
    }
    public void setTreinoID(String treino) {
        this.treinoID = treino;
    }
}
