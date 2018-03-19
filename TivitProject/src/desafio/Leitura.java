package desafio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Leitura {
	public static void main(String[] args) {
		try{
			FileWriter fw = new FileWriter("C:/Users/carlos/Documents/javabasico/TivitProject/src/desafio/arquivo.txt");
			fw.write("Carlos Antonio Ferreira do Nascimento\r\n");
			fw.write("Barabara Cesar Santos do Nascimento\r\n");
			fw.write("Diego Alberto Santos do Nascimento\r\n");
			fw.write("Felipe Santos do Nascimento\r\n");
			fw.write("Vinicius Santos do Nasicmento\r\n");
			fw.write("Juliana Guimaraes Pedras\r\n");
			fw.write("Manuella Guimaraes do Nascimento\r\n");
			fw.close();
			
			FileReader leitura = new FileReader("C:/Users/carlos/Documents/javabasico/TivitProject/src/desafio/arquivo.txt");
			BufferedReader leituraLinha = new BufferedReader(leitura);
			String frase = "";
			
			while((frase = leituraLinha.readLine()) != null){
				String nome = primeiraPalavra(frase);
				FileWriter arquivoIndividual = new FileWriter("C:/Users/carlos/Documents/javabasico/TivitProject/src/desafio/"+nome+".txt");
				arquivoIndividual.write(frase);
				arquivoIndividual.close();
			}
			
			}catch (IOException e){
				System.out.println("Erro");
			}
			
		}

	private static String primeiraPalavra(String p) {
		String[] nome = p.split(" ");
		return nome[0];
	}
}
