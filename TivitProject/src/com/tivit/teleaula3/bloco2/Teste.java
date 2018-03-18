package com.tivit.teleaula3.bloco2;
import com.tivit.teleaula3.bloco1.Musica;

public class Teste {

	public static void main(String[] args) {
		Musica m1 = new Musica();
		m1.setTitulo("Paradise");
		m1.setArtista("Coldplay");
		//m1.tocar();
		
		Musica m2 = new Musica();
		m2.setTitulo("Paradise");
		m2.setArtista("Coldplay");
		//m2.tocar();
		
		Musica m3 = m1;
		
		if(m1 == m2){
			System.out.println("m1 == m2");
		}
		
		if(m1 == m3){
			System.out.println("m1 == m3");
		}
		
		if(m2 == m3){
			System.out.println("m2 == m3");
		}
		
		if(m1.equals(m3)){
			System.out.println("m1 == m3");
		}
	}

}
