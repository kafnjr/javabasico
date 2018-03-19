package com.tivit.teleaula4.bloco3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoLeitura {
	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("C:/Users/carlos/Documents/javabasico/TivitProject/src/com/tivit/teleaula4/bloco3/teste.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String linha = "";
			while((linha = br.readLine()) != null){
				System.out.println(linha);
			}
		}catch(IOException e){
			System.out.println("Erro");
		}
	}
}
