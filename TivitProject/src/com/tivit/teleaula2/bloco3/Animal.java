package com.tivit.teleaula2.bloco3;

public class Animal {
	private String habitoAlimentar;
	private String reproducao;
	private int pesoMedio;
	
	
	
	
	public String getHabitoAlimentar() {
		return habitoAlimentar;
	}
	public void setHabitoAlimentar(String habitoAlimentar) {
		this.habitoAlimentar = habitoAlimentar;
	}
	public String getReproducao() {
		return reproducao;
	}
	public void setReproducao(String reproducao) {
		this.reproducao = reproducao;
	}
	public int getPesoMedio() {
		return pesoMedio;
	}
	public void setPesoMedio(int pesoMedio) {
		this.pesoMedio = pesoMedio;
	}
	
	
	public void detalhaAnimal(){
		System.out.println(habitoAlimentar);
		System.out.println(reproducao);
		System.out.println(pesoMedio+" mg");
		System.out.println("\n\n\n");
	}
	
}
