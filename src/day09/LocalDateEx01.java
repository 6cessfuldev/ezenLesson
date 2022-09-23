package day09;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateEx01 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate date = LocalDate.of(2022, 9, 30);
		System.out.println(date);
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.minusDays(100l));

		LocalTime time = LocalTime.now();
		System.out.println(time.getNano());
		
	}

}
