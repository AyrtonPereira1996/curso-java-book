package exercices;

public class Computador {
	
//	Variaveis de objecto e constante de classe
	static final boolean ligado = true;  //contante de classe
	static final boolean desligado = false;  //constante de classe
	String marca; // variavel de objecto
	String processador; // variavel de objecto
	int memoriaRAM; // variavel de objecto
	boolean computador_ligado;
	
//	Metodo de botao ligar e desligar
	void botao(boolean accao) {
		computador_ligado = accao;
	}
	
//	Metodo - Mostrar estado do computador
	void estadoComputador() {
		System.out.println("Maquina: " + marca + ", " + processador + " " + memoriaRAM);
		if(computador_ligado == true)
			System.out.println("O computador esta ligado!");
		else
			System.out.println("O computador esta desligado!");		
	}
	
	public static void main(String[] args) {
		Computador comp = new Computador();
		comp.marca = "HP";
		comp.memoriaRAM = 8192;
		comp.processador = "Core i5";
		
		comp.estadoComputador();
		comp.botao(ligado);
		comp.estadoComputador();
	}
	
	

}
