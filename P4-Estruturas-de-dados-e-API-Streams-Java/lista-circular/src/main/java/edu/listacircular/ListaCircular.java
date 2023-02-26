package edu.listacircular;

public class ListaCircular<T>{
    private No<T> cabeça;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeça = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.tamanhoLista == 0){
            this.cabeça = novoNo;
            this.cauda = this.cabeça;
            this.cabeça.setProximoNo(this.cauda);
        }else {
            novoNo.setProximoNo(this.cauda);
            this.cabeça.setProximoNo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    public void remove(int index){
        if (index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O indice é maior que a lista");

        No<T> noAuxiliar = cauda;
        if (index == 0){
            this.cauda = this.cauda.getProximoNo();
            this.cabeça.setProximoNo(this.cauda);
        } else if (index == 1) {
            this.cauda.setProximoNo(this.cauda.getProximoNo().getProximoNo());
        }else {
            for (int i= 0; i < index-1; i++){
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            noAuxiliar.setProximoNo(noAuxiliar.getProximoNo().getProximoNo());
        }
        this.tamanhoLista--;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        if (isEmpty())
            throw new IndexOutOfBoundsException("A lista esta vazia");

        if (index == 0){
            return this.cauda;
        }
        No<T> noAuxiliar = this.cauda;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String str = "";

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < this.size(); i++){
            str += "No[{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        str += this.size() != 0 ? "(Retorna a cauda)" : "[]";
        return str;
    }
}
