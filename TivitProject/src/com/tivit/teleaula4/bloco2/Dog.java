package com.tivit.teleaula4.bloco2;

public class Dog extends Animal implements Pet, Canine {//Demonstra��o de implementa��o de duas interfaces
@Override
public void fazerBarulho(){
	System.out.println("Au! Au!");
}

@Override
public void play(){
	System.out.println("Dog playing");
}
@Override
public void beFriendly(){
	System.out.println("Dog be Friendly");
}
}
