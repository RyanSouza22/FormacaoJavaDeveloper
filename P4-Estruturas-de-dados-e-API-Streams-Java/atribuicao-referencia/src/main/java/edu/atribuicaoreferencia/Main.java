package edu.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        /* Tipo Primitivo o java copia o exatamente o valor**/
        System.out.println("Int A = " + intA + " Int B = " + intB);
        intA = 2;
        System.out.println("Int A = " + intA + " Int B = " + intB);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        /* Ja Objeto o java copia a referencia de memoria **/
        System.out.println("\nObj A = " + objA + " Obj B = " + objB);
        objA.setNum(2);
        System.out.println("Obj A = " + objA + " Obj B = " + objB);

    }
}