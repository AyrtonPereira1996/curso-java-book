package examples;

public class example6 {
	
	static int metodo(int x, int y, int z) {
		return (x+y+z);
	}
	
	static int metodo(int x, int z) {
		return (x+z);
	}

	public static void main(String[] args) {
		
		System.out.println("Resultado do metodo 1 = " + metodo(3, 5));
		System.out.println("Resultado do metodo 2 = " + metodo(3, 40, 20));

	}

}
