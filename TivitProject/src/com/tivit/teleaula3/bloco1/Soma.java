package com.tivit.teleaula3.bloco1;

public class Soma {
	public void takeTwo(int a, int b){
		int r = a + b;
		System.out.println("Resultado �: "+r);
	}
	
	// ser� criado o m�todo givesecret apenas para agilizar a execu��o e evitar criar classe espec�fica para ela
	
	public int giveSecret(){
		return 42;
	}
	
	
	public static void main(String[] args) {
		Soma s = new Soma();
		/*
		int y = 58;
		int x = 9;
		s.takeTwo(x, y);
		s.takeTwo(12, 34); segunda forma de passar os argumentos, nesse caso n�o h� necessidade de criar vari�veis
		*/
		System.out.println(s.giveSecret());
	}
}
