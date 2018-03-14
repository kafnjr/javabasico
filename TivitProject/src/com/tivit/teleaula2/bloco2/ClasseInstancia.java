package com.tivit.teleaula2.bloco2;

public class ClasseInstancia {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.idCliente = 1;
		cliente1.cpf = "111.111.111-11";
		cliente1.nomeCliente = "Pedro Afonso";
		cliente1.endereco = "Rua 1 n° 2 Centro";
		cliente1.renda = 1.200;
		
		cliente2.idCliente = 2;
		cliente2.cpf = "222.222.222-2";
		cliente2.nomeCliente = "Maria Souza";
		cliente2.endereco = "Av Independência n°1425";
		cliente2.renda = 4.500;
		
		cliente1.obter();
		cliente2.obter();
	}
}
