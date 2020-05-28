package cap5exercices.example1;

import java.io.IOException;

public class Fatorial {

	public static void main(String[] args) throws IOException {
		String s = ""; 
		int k; //variavel de controlo
		char c; //armazenara o numero do teclado
		long total = 1;
		
		//asking for a number
		System.out.println("Qual e o numero?");
		while ((c = (char) System.in.read()) != 10) { // onde 10 igual a enter considerar caracteres na posicao 0
			s += c;
			s = s.substring(0, s.length()); //elimina o lixo no final da string
			
			int n = Integer.valueOf(s).intValue(); //variavel ira converter a valor na posicao 0 da string s
			
			for (k = n; k>=1; k--) { //achar o fatorial
				total *= k; //total ira multiplicar com os valores que a variavel de controlo ira obtendo
				
			}
			
			System.out.println(n + "! = " + total); //exibicao do resultado na console
			
		}
		

	}

}
