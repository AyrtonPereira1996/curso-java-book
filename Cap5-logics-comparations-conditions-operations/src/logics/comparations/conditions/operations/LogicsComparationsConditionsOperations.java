package logics.comparations.conditions.operations;

public class LogicsComparationsConditionsOperations {
	public static void main(String[] args) {
		int x,y,z;
		x=4;
		y=9;
		z=4;
		
		if ((x>y) && (x>z))
			System.out.println("O X tem o maior numero");
		else if ((x<y)&&(x>y))
			System.out.println("O X tem o menor numero");
		else
			System.out.println("O valor de X não é o maior nem o menor");
		
		System.out.println(" ");
		
		if((z==x) || (x<y) )
			System.out.println("O valor de Z é igual a X ou o valor de X é menor que Y");
		else
			System.out.println("O valor de Z não é igual ao de X e o valor de X não é menor que o de Y");
			
		
		
	}
}
