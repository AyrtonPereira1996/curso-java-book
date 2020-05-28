package exercicio;

public class Estatisticas {
	
	/*variaveis de objecto*/
	double x[], media, variancia, desvio_padrao;
	int numeroElementos;

	/* Metodo contrutor da classe */
	Estatisticas(String[] v) {
		int k;
		numeroElementos = v.length;
		x = new double[numeroElementos];
		for (k = 0; k < numeroElementos; k++)
			x[k] = Double.valueOf(v[k]).doubleValue();

		media = acharMedia();
		variancia = acharVariancia();
		desvio_padrao = acharDesviarPadrao();
	}

	/* metodo para achar a media */
	double acharMedia() {
		int k;
		double total = 0;
		for (k = 0; k < this.numeroElementos; k++)
			total += this.x[k];
		return (total / this.numeroElementos);
	}

	/* metodo para achar a varianca */
	private double acharVariancia() {
		int k;
		double total = 0;
		for (k = 0; k < this.numeroElementos; k++)
			total += Math.pow(this.x[k] - this.media, 2);
		return (total / this.numeroElementos);
	}

	/* metodo para obter o desvio padrao */
	double acharDesviarPadrao() {

		return (Math.sqrt(this.variancia));
	}

	public static void main(String[] args) {

		try {
			if (args.length < 2) { // se o numero de argumentos for inferior a 2
				System.out.println("Para usar este programa tera que");
				System.out.println("passar os valores dos dados de que");
				System.out.println("obter estatisticas (minimo dois valores)");
				System.exit(1);// Terminar programa
			}

			Estatisticas dados = new Estatisticas(args);
			System.out.println("Introduzio " + dados.numeroElementos + " elementos");
			System.out.println("Dados Estatisitcos:");
			System.out.println("Media: " + dados.media);
			System.out.println("Variancia: " + dados.variancia);
			System.out.println("Desvio padrao: " + dados.desvio_padrao);

		} catch (Exception e) {
			System.out.println("Erro");
			System.out.println();
			e.printStackTrace();
		}

	}

}
