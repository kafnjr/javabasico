package com.tivit.teleaula3.bloco3;

public class Animal {
	private String figura;
	private String comida;
	private boolean fome;
	private String localizacao;
	
	
	public void fazBarulho(){
		System.out.println("Animal fazendo barulho....");
	}
	
	public void comer(){
		System.out.println("Animal Comendo...");
	}
	
	public void dormir(){
		System.out.println("Animal dormindo...");
	}

	
	
	public String getFigura() {
		return figura;
	}

	public void setFigura(String figura) {
		this.figura = figura;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

	public boolean isFome() {
		return fome;
	}

	public void setFome(boolean fome) {
		this.fome = fome;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	
}
