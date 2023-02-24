package edu.pilha;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila() {
        refNoEntradaFila = null;
    }

    public void enqueue(T object){
        No novoNo = new No(object);
        novoNo.setReferenciaNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }
    public T dequeue(){
        if (!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getReferenciaNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaNo();
                } else{
                    noAuxiliar.setReferenciaNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }
    public T first(){
        if (!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if (primeiroNo.getReferenciaNo() != null){
                    primeiroNo = primeiroNo.getReferenciaNo();
                }else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }
    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{objeto = " + noAuxiliar.getObject() + "}] --->";
                if (noAuxiliar.getReferenciaNo() != null){
                    noAuxiliar = noAuxiliar.getReferenciaNo();
                }else {
                    stringRetorno += "null";
                    break;
                }
            }
        }else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
