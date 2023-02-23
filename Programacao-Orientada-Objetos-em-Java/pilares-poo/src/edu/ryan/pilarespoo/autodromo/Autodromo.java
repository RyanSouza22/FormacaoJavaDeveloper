package edu.ryan.pilarespoo.autodromo;

public class Autodromo {
	public static void main(String[] args) {

		Carro jeep = new Carro();
		jeep.setChassi("13215");
		//jeep.ligar();
		
		Moto bis = new Moto();
		bis.setChassi("89419");
		//bis.ligar();
		
		
		//Polimorfismo
		Veiculo coringa = bis;
		coringa.ligar();
	}		
}
