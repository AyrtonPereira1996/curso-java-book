package exercices;

public class ObjectClassVariables {
	int x;
	static int y;
	
	public static void main (String[] args) {
		//variavel de objecto 1
		ObjectClassVariables variavelObjecto = new ObjectClassVariables();
		variavelObjecto.x = 2; 
		
		//variavel de objecto 2
		ObjectClassVariables variavelObjecto2 = new ObjectClassVariables();
		variavelObjecto2.x = 4;
		
		//variavel de instancia
		ObjectClassVariables.y = 5;
		
		System.out.println("Variavel da classe 1 = " + variavelObjecto.x);
		System.out.println("Variavel da classe 2 = " + variavelObjecto2.x);
		System.out.println("Variavel da classe y = " + y);
		
		//incremento na variavel de classe
		variavelObjecto.y = ++y;
		
		System.out.println("Variavel da classe y = " + variavelObjecto2.y);
		
		
		
		
		
		
	}
}
