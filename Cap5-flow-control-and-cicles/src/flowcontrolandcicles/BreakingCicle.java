package flowcontrolandcicles;

public class BreakingCicle {

	public static void main(String[] args) {
		int cont = 0;
		while (cont<=50) { 
			if (cont==25) {
				System.out.println("####->Interrompi o ciclo com o break<-####");
			break;}
			System.out.println("Contagem em cont -> -> [" + cont + "]");
				cont ++;
		}
	}

}
