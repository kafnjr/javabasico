package com.tivit.teleaula3.bloco2;

public class GoodDog {
	private int size;
	private boolean valid;
	

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size>0){
		this.size = size;
		valid = true;
		}else{
			System.out.println("Digite um número válido!");
			valid = false;
		}
	}
	
	public void bark(){
		if(valid==true && size > 60){
			System.out.println("au au!");
		}else if(valid==true && size <= 60){
			System.out.println("oi oi!");
		}
	}
}
