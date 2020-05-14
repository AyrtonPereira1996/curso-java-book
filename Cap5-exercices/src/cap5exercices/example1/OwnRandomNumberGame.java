package cap5exercices.example1;

import java.util.Scanner;

public class OwnRandomNumberGame {

	public static void main(String[] args) {
		boolean end = false;
		
		exit:
			do {
				Scanner input = new Scanner(System.in);
				int resp;
				int tries = 0;
				boolean guess = false;
				
				Double d = Math.random();//gera numerps de 0 a 1
				int unknownNumber = (int)(2*d);//convertemos para passar a gerar numeros de 0 a 2
				
				while (guess == false) {
					System.out.println("Qual é o número? De [0-100] e [-1] para desistir do jogo");
					resp = input.nextInt();
					
					if (resp == -1) {
						System.out.println("Desistiu do jogo");
						break exit;
					}
					
					if (resp == unknownNumber) {
						System.out.println("Parabéns conseguiu acertar!");
						guess = true;
					} else {
						if (resp > unknownNumber){
							System.out.println(resp + "? Não, o número desconhecido é menor");
							System.out.println("O numero desconhecido corresponde a " + unknownNumber);
						} else if (resp < unknownNumber) {
							System.out.println(resp + "? Não, o número desconhecido é maior");
							System.out.println("O numero desconhecido corresponde a " + unknownNumber);
						}
					}
					
				}
				
				System.out.println("Parabéns! Acertou em " + tries + " tentativas" );
				
				boolean repeat;
				String respRepiticao;
				
				do {
					System.out.println("Quer jogar outra vez?");
					respRepiticao = input.next();
					
					switch (respRepiticao) {
					case "s":
					case "S":
						System.out.println("Vamos jogar outra vez!");
						repeat = false;
						break;
						
					case "n":
					case "N":
						System.out.println("Ate a proxima....");
						repeat = false;
						break;
						
						
					default:
						System.out.println("Resposta inválida");
						repeat = true;
						break;
					}
					
				} while (repeat == true);
			
			
				
				
				
			} while (end == true);

	}

}
