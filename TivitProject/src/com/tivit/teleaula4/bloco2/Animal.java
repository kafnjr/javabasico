package com.tivit.teleaula4.bloco2;

public abstract class Animal {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
//trabalhando com métodos abstratos
	public abstract void fazerBarulho();
//	public void fazerBarulho(){
//		System.out.println("Animal Fazendo Barulho!");
//	}
}
