package edu.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));

        System.out.println("\n"+ listCarros.add(new Carro("Fusca")));

        System.out.println("\n"+ listCarros.get(2));

        System.out.println("\n"+ listCarros.indexOf(new Carro("Fusca")));
        System.out.println(listCarros.indexOf(new Carro("Fusca2"))); //return -1 caso n encontre

        System.out.println("\n"+listCarros.remove(2));
        System.out.println(listCarros);

    }
}
