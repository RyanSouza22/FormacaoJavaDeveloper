package edu.pilha;

public class Pilha {
    private No referenciaTopo;

    public Pilha() {
        referenciaTopo = null;
    }

    public void push(No novoNo){
        No referenciaAuxiliar = referenciaTopo;
        referenciaTopo = novoNo;
        referenciaTopo.setReferenciaMemoria(referenciaAuxiliar);
    }
    public No pop(){
        if (!isEmpty()){
            No noRetirado = referenciaTopo;
            referenciaTopo = noRetirado.getReferenciaMemoria();
            return noRetirado;
        }else return null;
    }
    public No top(){
        return referenciaTopo;
    }
    public boolean isEmpty(){
        return referenciaTopo == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "---------------\n";
        stringRetorno += "  Pilha\n";
        stringRetorno += "---------------\n";

        No noAuxiliar = referenciaTopo;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += "[No {dado = " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReferenciaMemoria();
            }else {
                break;
            }
        }
        stringRetorno += "===============";
        return stringRetorno;
    }
}
