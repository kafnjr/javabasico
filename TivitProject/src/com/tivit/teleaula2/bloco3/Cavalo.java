package com.tivit.teleaula2.bloco3;

public class Cavalo extends Animal{
	private String corPelagem;
	private String raca;
	
	
	public String getCorPelagem() {
		return corPelagem;
	}
	public void setCorPelagem(String corPelagem) {
		this.corPelagem = corPelagem;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public void detalhaAnimal(){
		/*System.out.println(getHabitoAlimentar());
		System.out.println(getReproducao());
		System.out.println(getPesoMedio());
		System.out.println(corPelagem);
		System.out.println(raca);
		System.out.println("\n\n\n");
		*/
		System.out.println("Eu galopo");
	}
}
