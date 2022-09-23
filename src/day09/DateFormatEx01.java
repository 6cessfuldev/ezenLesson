package day09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx01 {

	public static void main(String[] args) throws ParseException{
		/* 날짜를 문자열로 format 설정
		 */

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd(E) hh:mm:ss");
		System.out.println(sdf.format(date));
		
		//문자열을 날짜로 
		
		String dateString = "1993-5-13 08:30:31";
		Date date2 = sdf.parse(dateString);
	}

}
