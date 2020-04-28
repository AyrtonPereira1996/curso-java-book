//Author: Ayrton Pereira
//Date: 27/04/2020
//Objective: Use arrays in different ways

public class ArrayUnidimensional {

	public static void main(String[] args) {
		
		//Estrutura de array 1
		int[] inteiros = new int[5]; //inicializa a array com todas a posicoes da memoria igual a 0
		inteiros[0] = 2;
		inteiros[1] = 40;
		inteiros[2] = 50;
		inteiros[3] = 1;
		inteiros[4] = 50;
		
		System.out.println("Estrutura de array 1");
		System.out.println("");
		System.out.println("Posicao 0 = " + inteiros[0] + "; Posicao 1 = " + inteiros[1] + "; Posicao 2 = " + inteiros[2] + "; Posicao 3 = " + inteiros[3] + "; Posicao 4 = " +inteiros[4]);
		System.out.println("");
		System.out.println("");
		
		//Estrutura de array 2
		String[] animais = {"gato","cao","rato","passarinho"}; //inicializa a array com os valores das posicoes ja definidas
		System.out.println("Estrutura de array 2");
		System.out.println("");
		System.out.println("O animal que faz miau = " + animais[0]);
		System.out.println("O animal que faz ao ao = " + animais[1]);
		System.out.println("O animal que roe tudo em casa = " + animais[2]);
		System.out.println("O animal que faz piu piu = " + animais[3]);
		
		
		
		
		
	}

}
