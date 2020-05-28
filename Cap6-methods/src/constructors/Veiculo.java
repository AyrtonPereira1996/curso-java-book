package constructors;

public class Veiculo {
	
	String marca, modelo;
	int ano_matricula, cilindrada;
	
	Veiculo (String p1, String p2, int x, int y){
		marca = p1;
		modelo = p2;
		ano_matricula = x;
		cilindrada = y;
	}
	
	Veiculo (String marca, String modelo){
		this.marca = marca;
		this.modelo = modelo;
		this.ano_matricula = 2020;
		this.cilindrada = 20000;
	}
	
	void mostra_objecto() {
		System.out.println("Marca = " + marca + ", modelo = " + modelo + ", ano = " + ano_matricula + ", cilindrada = " + cilindrada + ";");
	}
	
	public static void main(String[] args) {
		Veiculo v = new Veiculo("Toyota", "Hyrus", 2020, 20000);
		v.mostra_objecto();
		Veiculo v2 = new Veiculo("Opel", "Tigra");
		v2.mostra_objecto();
	}
	

}
