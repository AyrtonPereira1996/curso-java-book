//Author: Ayrton Pereira
//Date: 22/04/2020
//Objective: Use aritmetric operation 

package cap5aritmetric;

public class Aritmetric_class {
	public static void main(String[] args) {
		int a = 20, b = 30, c = 2, d = 6;
		float z = 30.9f, y = 5.5f, x = 6.6f;

		System.out.println("--- Values ---");
		System.out.println("a = " + a + "b = " + b + "c = " + c + "d = " + d);
		System.out.println(" ");
		System.out.println("z = " + z + "y = " + y + "x = " + x);

		System.out.println("a + z = " + (a + z));
		System.out.println("x - b = " + (x - z));
		System.out.println("d * y = " + (d * y));
		System.out.println("c / d = " + (c / d));
		System.out.println("d % a = " + (d % a));
		System.out.println("Mix operation 1 = " + ((a + z) + (d * x) - 15));
		System.out.println("Mix operation 2 = " + ((c % a) * 2));

	}
}
