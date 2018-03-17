package com.tivit.teleaula3.bloco1;

public class MusicaTeste {
	public static void main(String[] args) {
		Musica m1 = new Musica();
		m1.setTitulo("Paradise");
		m1.setArtista("Coldplay");
		m1.tocar();
		
		Musica m2 = new Musica();
		m2.setTitulo("O girasol");
		m2.setArtista("Ira");
		m2.tocar();
	}
}
