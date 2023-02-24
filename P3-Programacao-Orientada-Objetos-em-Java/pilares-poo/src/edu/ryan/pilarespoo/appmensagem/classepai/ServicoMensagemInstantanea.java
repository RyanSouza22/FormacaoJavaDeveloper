package edu.ryan.pilarespoo.appmensagem.classepai;

//a classe MSNMessenger é ou representa
public abstract class ServicoMensagemInstantanea {
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//métodos privadas, visíveis somente na classe
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
}