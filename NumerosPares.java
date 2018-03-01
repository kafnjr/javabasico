public class NumerosPares {
	public static void main(String[] args){
		int[] num = new int[10];
		for (int i = 0; i < 10; i++){
			num[i] = i;
			if ((num[i] % 2) == 0){
				System.out.println(num[i] + " " + "Par");
		    }
				else {
				System.out.println(num[i]);
				}
			
	    }
	}
}