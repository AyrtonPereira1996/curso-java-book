import java.util.Scanner;

public class ClasseTeste1 implements AminhaInterface {
	@Override
	public void envioMensagem(String msg) {
		System.out.print(msg);
		
	}

	@Override
	public int soma(int a, int b) {
		
		return (a + b);
	}

	@Override
	public int subtracao(int x, int y) {
		
		return (x - y);
	}
	
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		ClasseTeste1 teste = new ClasseTeste1();
		System.out.println("Escolha uma opcao");
		System.out.println("A. Emissao de mensagem");
		System.out.println("B. Soma de valores");
		System.out.println("C. Subtracao de valores");
		String resp = entrada.next();
		
		switch (resp) {
		case "A":
			System.out.println("Escreva a sua mensagem");
			String resp2 = entrada.nextLine();
			teste.envioMensagem(resp2);
			System.exit(0);
			break;
		case "B":
			System.out.println("Introduza primeiro valor");
			int x = entrada.nextInt();
			System.out.println("Introduza o segundo valor");
			int y = entrada.nextInt();
			int resultadoSoma = teste.soma(x, y);
			System.out.println("Resultado " + resultadoSoma);
			System.exit(0);
			break;
			
		case "C":
			System.out.println("Introduza primeiro valor");
			int a = entrada.nextInt();
			System.out.println("Introduza o segundo valor");
			int b = entrada.nextInt();
			int resultadoSubtracao = teste.subtracao(a, b);
			System.out.println("Resultado " + resultadoSubtracao);
			System.exit(0);
			break;
		default:
			System.out.println("Resposta invalida");
			System.exit(0);
			break;
		}
		
		
	}

	

	

}
