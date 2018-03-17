package com.tivit.teleaula3.bloco1;

public class Gato {
	private int idade;
	private int numAniversario;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public int aniversario(){
		idade = idade + 1;
		return idade;
		}
	
	public static void main(String[] args) {
		Gato g = new Gato();
		for(int i = 0; i<6; i++){
		int idade = g.aniversario();
		System.out.println(idade);
		}
	}
}
