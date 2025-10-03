package com.example;

import java.time.LocalDate;

/**
 * Classe que representa um aluno com nome, matrícula e data de nascimento.
 */
public class Aluno implements Comparable<Aluno> {
    private String nome;
    private String matricula;
    private LocalDate dataNascimento;

    public Aluno(String nome, String matricula, LocalDate dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public int compareTo(Aluno outro) {
        return this.nome.compareTo(outro.nome);
    }
}