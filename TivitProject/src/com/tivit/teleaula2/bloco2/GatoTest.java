package com.tivit.teleaula2.bloco2;

public class GatoTest {
	public static void main(String[] args) {
		Gato gato = new Gato();
		gato.setIdade(24);
		gato.setNome("Vanderlei");
		gato.setPeso(10);
		gato.setRaca("vira lata");
		
		gato.falaNome();
		
		Gato gato2 = new Gato();
		gato2.setIdade(18);
		gato2.setNome("Fabio");
		gato2.setPeso(65);
		gato2.setRaca("siames");
		
		gato2.falaNome();
	}
}
