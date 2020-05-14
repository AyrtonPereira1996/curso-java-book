package javatime;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestJavaTime {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("Data actual = " + localDate);
		LocalDate dateLocal = localDate.plusDays(2);
		System.out.println("Data com acréscimo + 2 = " + dateLocal);
		System.out.println("");
		LocalTime horaLocal = LocalTime.now();
		System.out.println("Hora actual = " + horaLocal);
		LocalTime localHora = horaLocal.plusHours(3);
		System.out.println("Hora com acrescimo + 3 = " + localHora);
		
		int hora = horaLocal.getHour();
		
		System.out.println("Hora = " + hora);

	}

}