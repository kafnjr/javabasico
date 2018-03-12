package com.tivit.teleaula2.bloco2;

public class GatoTest {
	public static void main(String[] args) {
		Gato gato = new Gato();
		gato.idade = 24;
		gato.nome = "Vanderlei";
		gato.peso = 10;
		gato.raca = "vira lata";
		
		gato.falaNome();
		
		Gato gato2 = new Gato();
		gato2.idade = 18;
		gato2.nome = "Fabio";
		gato2.peso = 65;
		gato2.raca = "Siames";
		
		gato2.falaNome();
	}
}
