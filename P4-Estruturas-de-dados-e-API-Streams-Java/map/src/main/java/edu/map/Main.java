package edu.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Joao");
        aluno.put("Idade", "15");
        aluno.put("Media", "8.2");
        aluno.put("Turma", "3a");

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "17");
        aluno2.put("Media", "9.0");
        aluno2.put("Turma", "3b");

        System.out.println("\n"+aluno);

        System.out.println("\n"+aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);
        listaAlunos.add(aluno2);
        System.out.println("\n"+listaAlunos);

        System.out.println("\n"+aluno.containsKey("Nome"));
    }
}
