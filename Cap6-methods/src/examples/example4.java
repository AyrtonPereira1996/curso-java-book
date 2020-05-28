package examples;

public class example4 {
	
	static int calcular(int[] calc) {
		calc[1] = 10; //caucou alteracao na area na posicao 1
		return (calc[0] + calc[1] + calc[2]);
	}

	public static void main(String[] args) {
		int[] v = {1, 2, 3};
		System.out.println("Array antes " + v[0] + ", " + v[1] + ", " + v[2]);
		System.out.println("Soma da array = " + calcular(v));
		System.out.println("Array antes " + v[0] + ", " + v[1] + ", " + v[2]);
		
		
	}

}
