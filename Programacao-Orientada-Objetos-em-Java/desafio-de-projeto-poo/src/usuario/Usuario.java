package usuario;

import celular.Iphone;

public class Usuario {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		System.out.println("\nUTILIZANDO O IPOD");
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.pausar();
		
		System.out.println("\nUTILIZANDO O PHONE");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		iphone.ligar();
		
		System.out.println("\nUTILIZANDO A INTERNET");
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
	}
}
