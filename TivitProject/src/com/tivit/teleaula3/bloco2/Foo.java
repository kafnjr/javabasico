package com.tivit.teleaula3.bloco2;

public class Foo {

	public static void main(String[] args) {
		Foo a = new Foo();
		Foo b = new Foo();
		Foo c = a;
		
		if(a == b){
			System.out.println("a == b");
		}
		if (a==c){
			System.out.println("a == c");
		}
		if(b==c){
			System.out.println("b == c");
		}
	}

}
