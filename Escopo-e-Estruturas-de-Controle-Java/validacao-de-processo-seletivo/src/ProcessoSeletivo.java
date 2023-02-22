import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato : candidatos) {           
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativas++;
            }else{
                System.out.println("Contato Realizado!");
            }
        }while(continuarTentando && tentativas <= 3);

        if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + (tentativas-1) + " REALIZADA");

    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        for (String candidatoAtual : candidatos) {
            System.out.println(candidatoAtual + " foi selecionado.");
        }
    }

    static void selecionarCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        
        int candidatosSelecionados = 0;
        int candidatoContador = 0;
        double salarioPretendido;

        while(candidatosSelecionados < 5 && candidatoContador < candidatos.length){
            String candidato = candidatos[candidatoContador];
            salarioPretendido = valorPretendido();

            if(salarioPretendido <= 2000.0){
                System.out.println("O candidato " + candidato + "foi selecionado.");
                candidatosSelecionados++;
            }
            candidatoContador++;
        }
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioPretendido < salarioBase){
            System.out.println("LIGAR PARA CANDIDATO!");
        } else if (salarioPretendido == salarioBase){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA!");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }

    static boolean atender() {
		return new Random().nextInt(3)==1;	
	}

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
