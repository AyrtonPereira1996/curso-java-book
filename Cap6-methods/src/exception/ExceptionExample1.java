package exception;

public class ExceptionExample1 {

	public static void main(String[] args) {
	 int a = 1, b = 0;
	 
	 try {
		 System.out.println(a/b);
	} catch (Exception e) {
		System.out.println("Erro. Essa operecao não pode ser concretizada!");
//		e.printStackTrace();
	}
	 
	 

	}

}
