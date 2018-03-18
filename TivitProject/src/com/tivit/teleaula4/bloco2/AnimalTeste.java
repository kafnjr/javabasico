package com.tivit.teleaula4.bloco2;

public class AnimalTeste {
	public static void main(String[] args) {
		Dog a = new Dog();
		a.fazerBarulho();
		a.play();
		a.beFriendly();
		System.out.println(a+"\n\n");
		
		Lion l = new Lion();
		l.fazerBarulho();
		System.out.println(a+"\n\n");
		
		Cat c = new Cat();
		c.fazerBarulho();
		c.play();
		c.beFriendly();
		System.out.println(a);
	}
}
