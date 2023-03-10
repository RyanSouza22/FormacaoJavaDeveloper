package edu.listaencadeada;

public class No<T> {
    private T conteudo;
    private No proximoNo;

    //Construtor
    public No() {
        this.proximoNo = null;
    }
    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }
    public No(T conteudo, No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    //Get and Setters
    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    //Funcoes
    @Override
    public String toString() {
        return "edu.listaencadeada.No{" +
                "conteudo=" + conteudo +
                '}';
    }
    public String toStringEncadeado() {
        String str =  "edu.listaencadeada.No{" +
                "conteudo=" + conteudo +
                '}';

        if (proximoNo != null){
            str += "--->" + proximoNo.toString();
        }else {
            str += "--> null";
        }
        return str;
    }
}
