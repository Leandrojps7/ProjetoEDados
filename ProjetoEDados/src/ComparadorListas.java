package com.example;

import java.util.*;

/**
 * Classe principal que realiza o cadastro, ordenação, exportação e medição de tempo.
 */
public class ComparadorListas {
    private static final int TOTAL_ALUNOS = 350000;

    public static void main(String[] args) {
        List<Aluno> arrayList = new ArrayList<>();
        List<Aluno> linkedList = new LinkedList<>();
        List<Aluno> vector = new Vector<>();

        // Cadastro
        long tempoInicio, tempoFim;

        tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < TOTAL_ALUNOS; i++) arrayList.add(GeradorAlunos.gerarAluno());
        tempoFim = System.currentTimeMillis();
        long cadastroArrayList = tempoFim - tempoInicio;

        tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < TOTAL_ALUNOS; i++) linkedList.add(GeradorAlunos.gerarAluno());
        tempoFim = System.currentTimeMillis();
        long cadastroLinkedList = tempoFim - tempoInicio;

        tempoInicio = System.currentTimeMillis();
        for (int i = 0; i < TOTAL_ALUNOS; i++) vector.add(GeradorAlunos.gerarAluno());
        tempoFim = System.currentTimeMillis();
        long cadastroVector = tempoFim - tempoInicio;

        // Ordenação
        tempoInicio = System.currentTimeMillis();
        Collections.sort(arrayList);
        tempoFim = System.currentTimeMillis();
        long ordenacaoArrayList = tempoFim - tempoInicio;

        tempoInicio = System.currentTimeMillis();
        Collections.sort(linkedList);
        tempoFim = System.currentTimeMillis();
        long ordenacaoLinkedList = tempoFim - tempoInicio;

        tempoInicio = System.currentTimeMillis();
        Collections.sort(vector);
        tempoFim = System.currentTimeMillis();
        long ordenacaoVector = tempoFim - tempoInicio;

        // Exportação
        tempoInicio = System.currentTimeMillis();
        ExportadorCSV.exportar("alunos_arraylist.csv", arrayList);
        tempoFim = System.currentTimeMillis();
        long exportacaoArrayList = tempoFim - tempoInicio;

        tempoInicio = System.currentTimeMillis();
        ExportadorCSV.exportar("alunos_linkedlist.csv", linkedList);
        tempoFim = System.currentTimeMillis();
        long exportacaoLinkedList = tempoFim - tempoInicio;

        tempoInicio = System.currentTimeMillis();
        ExportadorCSV.exportar("alunos_vector.csv", vector);
        tempoFim = System.currentTimeMillis();
        long exportacaoVector = tempoFim - tempoInicio;

        // Exibir resultados
        System.out.println("Operação\tArrayList (ms)\tLinkedList (ms)\tVector (ms)");
        System.out.printf("Cadastro\t%d\t\t%d\t\t%d\n", cadastroArrayList, cadastroLinkedList, cadastroVector);
        System.out.printf("Ordenação\t%d\t\t%d\t\t%d\n", ordenacaoArrayList, ordenacaoLinkedList, ordenacaoVector);
        System.out.printf("Exportação\t%d\t\t%d\t\t%d\n", exportacaoArrayList, exportacaoLinkedList, exportacaoVector);
    }
}
