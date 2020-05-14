package cap5exercices.example1;

import java.io.IOException;

public class RandomNumberGame {

	public static void main(String[] args) throws IOException {
		boolean sair = false; //variavel de controlo
		
		quebrar: do { // ciclo principal com label quebrar
			boolean guess = false;
			char c;
			int tentativas = 0;
			
			//gerar um numero aleatorio e armazenar em num
			double d = Math.random(); 
			int num = (int) (100 * d);
			
			while (guess == false) { //ciclo interno
				String s = "";
				System.out.println("Qual é o número?(0-100, -1 para desistir)");
				
				while ((c = (char) System.in.read()) != 10) {
					s += c;
					
					s = s.substring(0, s.length() - 1); // eliminacao de lixo no final da string
					int n = Integer.valueOf(s).intValue();
					
					tentativas ++; //incrementar o contador de tentativas
					
					if (n == -1) {
						System.out.println("Voce desistiu!");
						break quebrar;
					}
					
					if (n == num) {
						guess = true;
						
					}else 
							if (n > num)
								System.out.println(n + "? Não, o número é mais baixo!");
							else
								System.out.println(n + "? Não, o número é mais alto!");
				}	
			}
			
			System.out.println("Voce adivinhou o numero em " + tentativas + "tentativas");
			
			boolean repetir;
			do {
				System.out.println("Quer jogar de novo? [S/N]");
				c = (char) System.in.read();
				switch (c) {
				case 's':
				case 'S':
					System.out.println("Vamos jogar outra vez");
					repetir = false;
					break;
					
				case 'n':
				case 'N':
					System.out.println("Ate a proxima...");
					repetir = false;
					sair = true;
					break;

				default:
					System.out.println("A sua resposta nao e valida");
					repetir = true;
					break;
				}
			} while (repetir == true);
			
			System.in.read();
			
			
		} while (sair);

	}

}
