package examples;

public class example2 {
	static int multiplica(int x, int y) {
		int total;
		total = (20 -15) + x * y;
		return total;
	}
	
	public static void main(String[] args) {
		int a = 12;
		int b = 40;
		int calc = multiplica(a, b);//passagem de parametro por valor
		System.out.println("Resultado" + " " + calc);
		 
	}
}
