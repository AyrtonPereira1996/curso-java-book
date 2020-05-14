package flowcontrolandcicles;

import java.io.IOException;
import java.util.Scanner;

public class ConditionalsStatementIF {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Digite um número a sua escolha!");
		int num = entrada.nextInt();
		
		if (num>10) {
			System.out.println("O número é maior que 10. ");
			System.out.println("O número corresponde a " + num);
		} else {
			System.out.print("O número é menor ou igual 10. ");
			System.out.println("O número corresponde a " + num);
		}
		

	}

}
