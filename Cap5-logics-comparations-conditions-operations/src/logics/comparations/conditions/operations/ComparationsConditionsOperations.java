package logics.comparations.conditions.operations;

public class ComparationsConditionsOperations {
	public static void main(String[] args) {
		int x,y,z;
		x=4;
		y=9;
		z=4;
		
		System.out.println(" Inicio ");
		System.out.println("");
		System.out.println("x = " + x +"; y = " + y + "; z = " + z);
		System.out.println("");
		if(x>y)
			System.out.println("O valor de X é maior do que o valor y");
		else
			System.out.println("O valor de X não é maior que o valor de y");
		
		System.out.println(" ");
		
		if(y>x)
			System.out.println("O valor de Y é maior que o de X");
		else
			System.out.println("O valor de Y não é maior que o de X");
		
		System.out.println(" ");
		
		if(x==z)
			System.out.println("O valor de x é igual ao valor de z");
		else
			System.out.println("O valor de x não é igual ao de Z");
		
		System.out.println(" ");
		System.out.println(" FIM ");
	}

}
