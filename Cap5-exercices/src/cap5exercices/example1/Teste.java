package cap5exercices.example1;

import java.io.IOException;

public class Teste {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
			char leitura;
			int controle;
			int numero;
			long total = 1;
			String string = "";
			    		
			System.out.print("Qual é o número?\nValor informado: ");
		
			while((leitura = (char) System.in.read()) != 10){
				if(Character.isDigit(leitura)){
					string += leitura;
					
					string = string.substring(0, string.length());
				
					numero = Integer.valueOf(string).intValue();
					
					for(controle = numero; controle >= 1; controle--){
						total *= controle;
					}
					
					System.out.println(numero + "! = " + total);
				}
			}
		}

	}


