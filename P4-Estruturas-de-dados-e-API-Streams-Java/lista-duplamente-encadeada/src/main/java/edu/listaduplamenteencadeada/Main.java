package edu.listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> listaEncadeadaDupla = new ListaDuplamenteEncadeada<>();

        listaEncadeadaDupla.add("c1");
        listaEncadeadaDupla.add("c2");
        listaEncadeadaDupla.add("c3");
        listaEncadeadaDupla.add("c4");

        System.out.println(listaEncadeadaDupla+"\n");

        listaEncadeadaDupla.remove(2);
        System.out.println(listaEncadeadaDupla+"\n");

        listaEncadeadaDupla.add(2, "99");
        System.out.println(listaEncadeadaDupla +"\n");

        listaEncadeadaDupla.remove(3);
        System.out.println(listaEncadeadaDupla);

        listaEncadeadaDupla.add(5, "50");
        System.out.println("\n" + listaEncadeadaDupla);

    }
}
