package flowcontrolandcicles;

public class LabelingCicle {

	public static void main(String[] args) {
		
		ciclo:for (int contx=0; contx<=100; contx--) {
			for (int conty = 50; conty<=100; conty--) {
				if (conty==25) {
					System.out.println("Metade da contagem de conty");
					break ciclo;
				}
				System.out.println("Contagem de y " + conty);
			}	
		}

	}

}
