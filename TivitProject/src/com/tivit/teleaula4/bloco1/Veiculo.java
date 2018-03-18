package com.tivit.teleaula4.bloco1;

public class Veiculo {
	private int velMaxima;
	private int velocidade;
	private String fabricante;
	private String modelo;
	
	public void ligar(){
		System.out.println("Ligando o "+modelo+"!! Vruuuummm!!");
	}
	public void acelerar(){
		System.out.println(velocidade+20);
	}
	
	
	public int getVelMaxima() {
		return velMaxima;
	}
	public void setVelMaxima(int velMaxima) {
		this.velMaxima = velMaxima;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
