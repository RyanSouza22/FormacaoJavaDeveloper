package edu.ryan.pilarespoo.appmensagem.telegram;

import edu.ryan.pilarespoo.appmensagem.classepai.ServicoMensagemInstantanea;

public class Telegram extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo Telegram");
	}

	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando Historico de mensagens no banco do Telegram");
	}
	
}
