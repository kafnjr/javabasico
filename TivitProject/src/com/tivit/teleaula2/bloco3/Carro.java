package com.tivit.teleaula2.bloco3;

public class Carro {
	String marca;
	String modelo;
	String cor;
	int potencia;
	int velocidade;
	
	void acelerar(){
		if (potencia > 100){
			velocidade = 40;
		}else{
			velocidade = 20;
		}
		System.out.println(velocidade);
	}
}
