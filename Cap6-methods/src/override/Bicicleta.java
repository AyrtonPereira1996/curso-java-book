package override;



public class Bicicleta extends Veiculo {
	
	@Override
	protected void travar() {
		System.out.println("Apertar o manipulo com a mao direita");
	}

}
