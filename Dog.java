public class Dog {
	public static void main(String[] args) {
		Dog[] myDogs = new Dog[7];
		for(int i = 0; i<myDogs.length; i++){
			myDogs[i] = new Dog();
			System.out.println(myDogs[i]);				
		}
	}
}
