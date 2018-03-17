package com.tivit.teleaula3.bloco1;

public class Soma {
	public void takeTwo(int a, int b){
		int r = a + b;
		System.out.println("Resultado é: "+r);
	}
	
	// será criado o método givesecret apenas para agilizar a execução e evitar criar classe específica para ela
	
	public int giveSecret(){
		return 42;
	}
	
	
	public static void main(String[] args) {
		Soma s = new Soma();
		/*
		int y = 58;
		int x = 9;
		s.takeTwo(x, y);
		s.takeTwo(12, 34); segunda forma de passar os argumentos, nesse caso não há necessidade de criar variáveis
		*/
		System.out.println(s.giveSecret());
	}
}
