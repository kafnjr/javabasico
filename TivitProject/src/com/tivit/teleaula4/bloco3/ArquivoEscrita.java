package com.tivit.teleaula4.bloco3;

import java.io.FileWriter;
import java.io.IOException;

public class ArquivoEscrita {
	public static void main(String[] args){
		try{
		FileWriter fw = new FileWriter("C:/Users/carlos/Documents/javabasico/TivitProject/src/com/tivit/teleaula4/bloco3/teste.txt");
		fw.write("Hello World!");
		fw.close();
		}catch (IOException e){
			System.out.println("Erro");
		}
	}
}
