public class Par {
	public static void main(String[] args) {
		int[] par = new int[10];
		for(int i = 0; i <par.length; i++){
			par[i] = i+1;
			if(par[i]%2 == 0){
				System.out.println(par[i]+" Par" );
			}else{
				System.out.println(par[i]);
			}
		}
	}
}
