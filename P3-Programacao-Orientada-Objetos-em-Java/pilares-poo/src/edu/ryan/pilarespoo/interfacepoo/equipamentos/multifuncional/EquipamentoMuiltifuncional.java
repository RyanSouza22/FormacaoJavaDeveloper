package edu.ryan.pilarespoo.interfacepoo.equipamentos.multifuncional;

import edu.ryan.pilarespoo.interfacepoo.equipamentos.copiadora.Copiadora;
import edu.ryan.pilarespoo.interfacepoo.equipamentos.digitalizadora.Digitalizadora;
import edu.ryan.pilarespoo.interfacepoo.equipamentos.impressora.Impressora;

public class EquipamentoMuiltifuncional implements Copiadora, Digitalizadora, Impressora{
	
	@Override
	public void copiar() {
		System.out.println("Copiando via Equipamento Multifuncional");
	}
	@Override
	public void digitalizar() {
		System.out.println("Digitalizando via Equipamento Multifuncional");
	}
	@Override
	public void Imprimir() {
		System.out.println("Imprimindo via Equipamento Multifuncional");
	}

}