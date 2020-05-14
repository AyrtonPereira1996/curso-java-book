package cap5exercices.example1;

import java.util.Scanner;

public class OwnFatorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean fim = false;
		int cont = 1;
		int numero;
		int i;
		long fatorial = 1;

		do {
			System.out.println("----- Inicio jogo nº " + cont + "-----");
			System.out.print("Escolha um número para calcular o fatorial: ");
			numero = entrada.nextInt();

			for (i = numero; i >= 1; i--) {
				fatorial *= i;
			}

			System.out.println(numero + "! = " + fatorial);
			fatorial = 1;
			cont++;
			if (cont >= 6) {
				System.out.println("Chegou ao fim, alcaçou as suas tentativas!");
				break;
			}

		} while (!fim);
		System.exit(0);

	}

}
