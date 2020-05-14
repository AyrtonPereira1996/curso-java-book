package flowcontrolandcicles;

import java.util.Scanner;


public class ConditionalsStatementSwitch {

	public static void main(String[] args) {
		
		System.out.println("Escolhe um animal");
		System.out.println("A. Gato;");
		System.out.println("B. Cao;");
		System.out.println("C. Vaca;");
		System.out.println("");
		
		System.out.print("Responda : ");
		Scanner entrada = new Scanner(System.in);
		String resp = entrada.next();
		
		switch (resp) {
		case "A":
		case "a":
			System.out.println(" ");
			System.out.println("Resposta : O gato faz miauuuu!");
			break;
		case "B":
		case "b":
			System.out.println(" ");
			System.out.println("Resposta : O cao faz ao ao!");
			break;
		case "C":
		case "c":
			System.out.println("");
			System.out.println("Resposta : A vaca faz moohh!");
			break;

		default:
			System.out.println("");
			System.out.println("Resposta : Opcao invalida");
			break;
		}
		
		System.exit(0);

	}

}
