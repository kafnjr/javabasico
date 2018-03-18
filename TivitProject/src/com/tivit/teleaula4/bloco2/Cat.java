package com.tivit.teleaula4.bloco2;

public class Cat extends Animal implements Pet{

@Override
public void fazerBarulho(){
	System.out.println("Miau!");
	}

@Override
public void beFriendly() {
	System.out.println("Sou um gato e seu amigo");
	
}

@Override
public void play() {
	System.out.println("Cat Playing");
}
}
