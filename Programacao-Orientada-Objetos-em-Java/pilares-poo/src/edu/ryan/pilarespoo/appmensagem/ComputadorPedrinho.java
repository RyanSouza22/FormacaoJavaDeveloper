package edu.ryan.pilarespoo.appmensagem;

import edu.ryan.pilarespoo.appmensagem.classepai.ServicoMensagemInstantanea;
import edu.ryan.pilarespoo.appmensagem.facebook.FacebookMesseger;
import edu.ryan.pilarespoo.appmensagem.msn.MSNMessenger;
import edu.ryan.pilarespoo.appmensagem.telegram.Telegram;

/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="fbm"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMesseger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();

	}
}