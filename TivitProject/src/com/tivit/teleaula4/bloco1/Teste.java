package com.tivit.teleaula4.bloco1;

public class Teste {

	public static void main(String[] args) {
		Veiculo[] carro = new Veiculo[2];
		carro[0] = new Gol();
		carro[0].setModelo("Gol");
		carro[0].setVelocidade(20);
		carro[1] = new Sandero();
		carro[1].setVelocidade(40);
		
		for (int i = 0; i < carro.length; i++) {
			carro[i].ligar();
			carro[i].acelerar();
		}
	}

}
