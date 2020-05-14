package flowcontrolandcicles;

import java.io.IOException;

public class WhileCicle {
	
	public static void main (String[] args) throws IOException {
		char c = 0;
		boolean sair = false;
		
		while (!sair) {
			
			c = (char) System.in.read();
			if (c != 'q') {
				if (c!=10) {
					System.out.println("");
					System.out.println("");
					System.out.println("Voce introduziu a tecla errada!");
					System.out.println("So com a tecla q saira do ciclo");
					System.out.println("Introduza a tecla");
				}
				
			} else {
				sair = true;
				System.out.println("");
				System.out.println("");
				System.out.println("Voce introduziu a tecla correcta");
			}
			
		}
	}

	
}
