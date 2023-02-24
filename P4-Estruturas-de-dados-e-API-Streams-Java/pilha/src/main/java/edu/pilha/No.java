package edu.pilha;

public class No {
    private int dado;
    private No referenciaMemoria = null;

    public No(int dado) {
        this.dado = dado;
    }
    public int getDado() {
        return dado;
    }
    public void setDado(int dado) {
        this.dado = dado;
    }
    public No getReferenciaMemoria() {
        return referenciaMemoria;
    }
    public void setReferenciaMemoria(No referenciaMemoria) {
        this.referenciaMemoria = referenciaMemoria;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
