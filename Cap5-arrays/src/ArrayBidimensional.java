//Author: Ayrton Pereira
//Date: 27/04/2020
//Objective: Use arrays in different ways

public class ArrayBidimensional {

	public static void main(String[] args) {
		int [][] inteiros = new int [2][2]; //Array multidimensional
		inteiros [0][0] = 3 ;
		inteiros [0][1] = 2 ;
		inteiros [1][0] = 4 ; 
		inteiros [1][1] = 10 ;
		
		System.out.println ("Visualizacao dos valores do array armazenado nas posicoes da memoria ");
		System.out.println ("Posicao[0][0] = " + inteiros[0][0]);
		System.out.println ("Posicao[0][1] = " + inteiros[0][1]);
		System.out.println ("Posicao[1][0] = " + inteiros[1][0]);
		System.out.println ("Posicao[1][1] = " + inteiros[1][1]);
		
		

	}

}
