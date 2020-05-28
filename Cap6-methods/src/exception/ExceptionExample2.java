package exception;

public class ExceptionExample2 {
	public static void main (String[] args) {
		int x = 30, y = 0;
		try {
			System.out.println("x = " + x + ", y = " + y);
			System.out.println(x/y);
		} catch (Exception e) {
			System.out.println("Erro.");
		} finally {
			System.out.println("Resolvera e prontos. No fim executa esta expressao do finaly");
		}
	}
}
