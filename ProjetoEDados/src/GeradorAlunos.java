package com.example;

import java.time.LocalDate;
import java.util.Random;

/**
 * Classe utilitária para gerar alunos aleatórios.
 */
public class GeradorAlunos {
    private static final String[] nomes = {"Ana", "João", "Carlos", "Maria", "Pedro", "Juliana", "Lucas", "Fernanda"};
    private static final String[] sobrenomes = {"Silva", "Souza", "Oliveira", "Costa", "Pereira", "Rodrigues", "Almeida", "Ferreira"};
    private static final Random rand = new Random();

    public static Aluno gerarAluno() {
        String nomeCompleto = nomes[rand.nextInt(nomes.length)] + " " + sobrenomes[rand.nextInt(sobrenomes.length)];
        String matricula = String.format("%05d", rand.nextInt(100000)); // 5 dígitos
        LocalDate dataNascimento = gerarDataAleatoria();

        return new Aluno(nomeCompleto, matricula, dataNascimento);
    }

    private static LocalDate gerarDataAleatoria() {
        int ano = 1990 + rand.nextInt(10); // 1990 - 1999
        int mes = 1 + rand.nextInt(12);
        int dia = 1 + rand.nextInt(28); // Evita problemas com dias inválidos

        return LocalDate.of(ano, mes, dia);
    }
}