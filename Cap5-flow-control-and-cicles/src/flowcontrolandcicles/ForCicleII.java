package flowcontrolandcicles;

public class ForCicleII {

	public static void main(String[] args) {
		
		int k;
		for(k=200; k >= 0; k = k - 2) {
			if (k==100) {
				k = k - 10;
				System.out.println("contagem a metade");	
			}
			System.out.println(k);
		}
	}

}
