package day09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {

		Date d = new Date();
		d.getDate(); //deprecated : 비권장

		/* Calendar 클래스는 추상 클래스
		 * 직접 객체를 생성할 수 없다.
		 * new 연산자를 이용해서 객체 구현이 안되고
		 * getInstance() 를 이용해서 구현한 클래스를 통해 인스턴스를 얻어온다.
		 */
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTime());
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1; // 0~11
		
		int day = now.get(Calendar.DAY_OF_MONTH);
		int day_week = now.get(Calendar.DAY_OF_WEEK);
		
		String dayWeek = new String();
		switch(day_week) {
		case 1 : 
			dayWeek = "일";
			break;
		case 2 : 
			dayWeek = "월";
			break;
		case 3 : 
			dayWeek = "화";
			break;
		case 4 : 
			dayWeek = "수";
			break;
		case 5 : 
			dayWeek = "목";
			break;
		case 6 : 
			dayWeek = "금";
			break;
		case 7 : 
			dayWeek = "토";
			break;			
		}

		String ampm = now.get(Calendar.AM_PM) == 0 ? "오전" : "오후";  
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		//2022-09-23(금)
		//오후 2:58:00 출력
		
		System.out.println(year+"-"+month+"-"+day+"("+dayWeek +")");
		System.out.println(ampm+" "+hour+":"+minute+":"+second);
		
		
		
		//SimpleDateFormat 을 쓰자...
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일");
		System.out.println(sdf.format(d));
				
		}

}
