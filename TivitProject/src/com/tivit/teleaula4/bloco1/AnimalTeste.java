package com.tivit.teleaula4.bloco1;

public class AnimalTeste {

	public static void main(String[] args) {
		
		PetOwner p = new PetOwner();
		Animal a = p.start(24);
		System.out.println(a);
		
	}
		/*
		 * Animal a = new Dog();
		 * a = new Tiger();
		 */
//		Animal[] animalArray = new Animal[5];
//		animalArray[0] = new Dog();
//		animalArray[1] = new Tiger();
//		animalArray[2] = new Cat();
//		animalArray[3] = new Dog();
//		animalArray[4] = new Vand();
		
		/*
		for (int i = 0; i < animalArray.length; i++) {
			System.out.println(animalArray[i]);
			fazerBarulho(animalArray[i]);
		}
		*/
		//quando o método não é estático devemos instanciar a classe AnimalTeste
//		for (int i = 0; i < animalArray.length; i++) {
//			AnimalTeste at = new AnimalTeste();
//			System.out.println(animalArray[i]);
//			at.fazerBarulho(animalArray[i]);
//		}
//	}
//	
//	
//	public void fazerBarulho(Animal a){
//		a.makeNoise();
//	}
//
//	public static void fazerBarulho(Animal a){
//		a.makeNoise();
//	}
}
