package edu.set;

import java.util.Objects;

public class Carro implements Comparable<Carro> {

    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //testa se "this" objeto é igual a "Object o" pela referencia de memoria
        if (o == null || getClass() != o.getClass()) return false; //comparando a classe dos objetos
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca); //utiliza o metodo hascode da classe Object
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

    @Override
    public int compareTo(Carro o) {
        return this.getMarca().compareTo(o.getMarca());
    }

    /*@Override
    public int compareTo(Carro o) {
        if (this.marca.length() < o.marca.length()) {
            return -1;
        } else if (this.marca.length() > o.marca.length()) {
            return 1;
        }
        return 0;
    }*/


}