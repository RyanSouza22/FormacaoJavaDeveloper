package edu.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        //Fila

        Queue<Carro> filaCarros = new LinkedList<>();

        filaCarros.add(new Carro("Ford"));
        filaCarros.add(new Carro("Chevrolet"));
        filaCarros.add(new Carro("Fiat"));

        //add retorna um erro caso nao consiga adicionar
        System.out.println("\n"+filaCarros.add(new Carro("Fusca")));
        System.out.println(filaCarros);

        //offer retorna falso caso ele nao consiga adicionar
        System.out.println("\n"+filaCarros.offer(new Carro("Renault")));
        System.out.println(filaCarros);

        System.out.println("\n"+filaCarros.peek());
        System.out.println(filaCarros);

        System.out.println("\n"+filaCarros.poll());
        System.out.println(filaCarros);

        System.out.println("\n"+filaCarros.isEmpty());


    }
}
