package examples;

public class example3 {

	static int incremento(int x) {
		int incrementado = ++x;
		return x;
	}

	public static void main(String[] args) {
		int valor = 10;
		System.out.println("O valor de 'valor' antes de ser incrementado = " + valor);
		System.out.println("O valor de 'valor' depois de ser incrementado = " + incremento(valor)); // passagem de
																									// parametro por
																									// valor
		System.out.println("O valor da variavel 'valor' agora e " + valor);

	}

}
