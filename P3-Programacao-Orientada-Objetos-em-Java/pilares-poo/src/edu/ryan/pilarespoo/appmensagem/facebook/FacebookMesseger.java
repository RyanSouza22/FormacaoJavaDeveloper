package edu.ryan.pilarespoo.appmensagem.facebook;

import edu.ryan.pilarespoo.appmensagem.classepai.ServicoMensagemInstantanea;

public class FacebookMesseger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem pelo Facebook");
		salvarHistoricoMensagem();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo Facebook");
	}


	private void salvarHistoricoMensagem() {
		System.out.println("Salvando Historico de mensagens no banco do Facebook");
	}

}
