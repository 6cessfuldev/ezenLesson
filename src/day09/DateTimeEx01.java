package day09;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeEx01 {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfWeek());
		System.out.println(now);
		
		// String 값으로 변환한 후 T를 기준으로 날짜와 시간을 구분
		String curr= now.toString();
		String date = curr.substring(0, curr.indexOf("T"));
		String time = curr.substring(curr.indexOf("T")+1,curr.indexOf("T")+9);
		System.out.println(date);
		System.out.println(time);
		
		ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
		
		System.out.println(utc);
		
		ZonedDateTime newyork = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newyork);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		System.out.println(dtf.format(newyork));
	}

}
