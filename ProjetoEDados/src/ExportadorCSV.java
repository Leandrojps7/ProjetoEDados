package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Exporta listas de alunos para arquivos CSV.
 */
public class ExportadorCSV {
    public static void exportar(String nomeArquivo, List<Aluno> alunos) {
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            writer.write("Nome,Matricula,Data de Nascimento\n");
            for (Aluno aluno : alunos) {
                writer.write(String.format("%s,%s,%s\n",
                        aluno.getNome(),
                        aluno.getMatricula(),
                        aluno.getDataNascimento()));
            }
        } catch (IOException e) {
            System.out.println("Erro ao exportar arquivo: " + nomeArquivo);
            e.printStackTrace();
        }
    }
}
