package com.tivit.teleaula2.bloco2;

public class Gato {
	private String nome;
	private String raca;
	private int idade;
	private int peso;
	
	void falaNome() {
		System.out.println("Nome: "+nome);
		System.out.println("Peso: "+peso);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		if (peso > 0 && peso < 20){
		this.peso = peso;
		}else{
			this.peso = 5;
		}
	}
	
	
}
