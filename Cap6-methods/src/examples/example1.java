package examples;

public class example1 {
	
	static int multiplicao(int x, int y) {
		int total;
		total = x * y;
		return total;
		
	}
	
	public static void main(String[] args) {
		
		int calcMultiplicacao = multiplicao(20, 20);
		System.out.println("O resultado " + calcMultiplicacao);
		
	}

}
