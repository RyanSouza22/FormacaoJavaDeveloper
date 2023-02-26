package edu.listacircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> listaCircular = new ListaCircular<>();

        listaCircular.add("c0");
        System.out.println(listaCircular);

        listaCircular.remove(0);
        System.out.println("\n"+listaCircular);

        listaCircular.add("c1");
        System.out.println("\n"+listaCircular);

        listaCircular.add("c2");
        listaCircular.add("c3");
        System.out.println("\n" + listaCircular);

        System.out.println("\n" + listaCircular.get(0));
        System.out.println("\n" + listaCircular.get(1));
        System.out.println("\n" + listaCircular.get(2));
        System.out.println("\n" + listaCircular.get(3));

    }
}
