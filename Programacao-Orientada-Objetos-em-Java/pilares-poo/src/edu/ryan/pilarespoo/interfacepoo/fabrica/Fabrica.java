package edu.ryan.pilarespoo.interfacepoo.fabrica;

import edu.ryan.pilarespoo.interfacepoo.equipamentos.copiadora.Copiadora;
import edu.ryan.pilarespoo.interfacepoo.equipamentos.digitalizadora.Digitalizadora;
import edu.ryan.pilarespoo.interfacepoo.equipamentos.impressora.Impressora;
import edu.ryan.pilarespoo.interfacepoo.equipamentos.multifuncional.EquipamentoMuiltifuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMuiltifuncional em = new EquipamentoMuiltifuncional();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.Imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
		em.copiar();
		em.digitalizar();
		em.Imprimir();
	}
}
