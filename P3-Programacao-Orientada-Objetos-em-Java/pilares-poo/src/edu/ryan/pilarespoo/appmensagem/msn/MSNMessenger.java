package edu.ryan.pilarespoo.appmensagem.msn;

import edu.ryan.pilarespoo.appmensagem.classepai.ServicoMensagemInstantanea;

public class MSNMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem pelo MSN");
		salvarHistoricoMensagem();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo MSN");
	}


	private void salvarHistoricoMensagem() {
		System.out.println("Salvando Historico de mensagens no banco do MSN");
	}

}