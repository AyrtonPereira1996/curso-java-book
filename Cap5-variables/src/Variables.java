//Author: Ayrton Pereira
//Date: 22/04/2020
//Objective: Use local variables with cast

public class Variables {
	public static void main(String[] args) {
		int x, y, w, r;
		String result = "Result = ";

		x = 4;
		y = 20;
		w = (int) 3.15; //using cast on double type data
		r= (x+y)*w;
		System.out.println(result + r);
		System.out.println("The variables are " + "x = " + x + " y = " + y  + " w = "+ w );
		
		
	}
}
