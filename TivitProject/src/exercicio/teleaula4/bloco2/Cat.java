package exercicio.teleaula4.bloco2;

public class Cat extends Animal implements Pet{

	@Override
	public void brincar() {
		System.out.println("Gato Brincando");
		
	}

	@Override
	public void andar() {
		System.out.println("Gato andando");
		
	}
	
}
