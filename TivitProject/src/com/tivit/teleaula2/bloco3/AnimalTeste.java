package com.tivit.teleaula2.bloco3;

public class AnimalTeste {
	public static void main(String[] args) {
		Cavalo cavalo1 = new Cavalo();
		
		cavalo1.setHabitoAlimentar("capim");
		cavalo1.setPesoMedio(200);
		cavalo1.setReproducao("sim");
		cavalo1.setCorPelagem("marrom");
		cavalo1.setRaca("mustang");
		cavalo1.detalhaAnimal();
		
		
		Peixe peixe1 = new Peixe();
		
		peixe1.setHabitoAlimentar("algas");
		peixe1.setPesoMedio(200);
		peixe1.setReproducao("sim");
		peixe1.detalhaAnimal();
		
		
		Aguia aguia1 = new Aguia();
		aguia1.setHabitoAlimentar("Cobra");
		aguia1.setPesoMedio(15);
		aguia1.setReproducao("sim");
		aguia1.detalhaAnimal();
	}
}
