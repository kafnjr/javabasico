package com.tivit.teleaula4.bloco1;

public class PetOwner {
	public Animal start(int i){
		if (i == 24){
			return new Vand();
		}else{
			return new Dog();
		}
	}
}
