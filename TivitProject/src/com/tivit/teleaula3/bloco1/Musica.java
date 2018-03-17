package com.tivit.teleaula3.bloco1;

public class Musica {
	private String titulo;
	private String artista;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public void tocar(){
		System.out.println("Tocando a música: "+titulo+"\n"+artista);
	}
	
	
}
