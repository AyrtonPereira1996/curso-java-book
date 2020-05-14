package javatime;

import java.time.Clock;

public class TimeClock {

	public static void main(String[] args) {
		Clock relogio = Clock.systemDefaultZone();
		System.out.println("Variavel relogio " + relogio);
		
		Clock relogioUTC = Clock.systemUTC();
		System.out.println(relogioUTC);
		
			
		
		
		
	

	}

}
