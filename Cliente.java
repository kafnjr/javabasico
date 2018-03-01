public class Cliente {
	long idCliente;
	String cpf;
	String nomeCliente;
	String endereco;
	double renda;
		
	void imprime(){
			System.out.println("            ");
			System.out.println("|------ / --------------- / --------------|");
			System.out.println("|Nome: " + nomeCliente + "                |");
			System.out.println("|Identificador: " + idCliente + "         |");
			System.out.println("|CPF: " + cpf + "                         |");
			System.out.println("|Renda: " + renda + "                  |");
			System.out.println("|Endereço: " + endereco + "            |");
			System.out.println("|                                         |");
			System.out.println("|------ / --------------- / --------------|");
		}
	
	public static void main(String[] args){
		Cliente cliente1 = new Cliente();
		cliente1.nomeCliente = "Carlos";
		cliente1.cpf = "12203813733";
		cliente1.renda = 100.00;
		cliente1.endereco = "Rua Andaluzia n 97";
		cliente1.imprime();
		
		Cliente cliente2 = new Cliente();
		cliente2.nomeCliente = "Bolssonaro";
		cliente2.cpf = "66699988822";
		cliente2.renda = 500000.00;
		cliente2.endereco = "Rua Cuzão 69";
		cliente2.imprime();
	}
	
	
}