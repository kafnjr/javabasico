package exercicio.teleaula4.bloco2;

public class Dog extends Animal implements Pet {

	@Override
	public void brincar() {
		System.out.println("Cachorro brincando");
		
	}

	@Override
	public void andar() {
		System.out.println("Cachorro Andando");
		
	}

}
