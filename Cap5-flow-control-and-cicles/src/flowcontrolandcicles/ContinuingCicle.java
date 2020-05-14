package flowcontrolandcicles;



public class ContinuingCicle {

	public static void main(String[] args) {
		int cont=0;

				
		for (cont = 0; cont <= 50; cont++) {
			if (cont==25) {
				System.out.println("####Esta a metade####");
				continue;
			}
			System.out.println(cont);
		}
	}

}
