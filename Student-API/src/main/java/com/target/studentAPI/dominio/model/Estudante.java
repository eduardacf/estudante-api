package com.target.studentAPI.dominio.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="estudante")
public class Estudante {
    private String nome;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private Integer matricula;

    private Integer idade;

    private Integer turma;

    @ManyToMany(mappedBy = "entidade_materia",targetEntity = Materia.class )
    private List<Materia> materia;

    public Estudante(String nome, Integer matricula, Integer idade, Integer turma) {
        this.nome = nome;
        this.id = id;
        this.matricula = matricula;
        this.idade = idade;
        this.turma = turma;
    }

    public List<Materia> getMateria() {
        return materia;
    }

    public void setMateria(List<Materia> materia) {
        this.materia = materia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getTurma() {
        return turma;
    }

    public void setTurma(Integer turma) {
        this.turma = turma;
    }
}
