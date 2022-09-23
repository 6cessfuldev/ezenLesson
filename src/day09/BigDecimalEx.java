package day09;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalEx {

	public static void main(String[] args) {
		
		//BigDecimal 값을 초기화하기 위해서 문자열로 생성해야 정확
		BigDecimal bd1 = new BigDecimal("1000000.1234");
		BigDecimal bd2 = new BigDecimal("100");
		
		System.out.println(bd1);
		System.out.println(bd2);
		
		//사칙연산을 이용하여 연산이 불가능
		//add subtract multiply divide remainder
		System.out.println(bd1.add(bd2));
		System.out.println(bd1.subtract(bd2));
		System.out.println(bd1.multiply(bd2));
		System.out.println(bd1.divide(bd2));
		System.out.println(bd1.remainder(bd2));
		
		//비교를 나타낼 때 compareTo
		System.out.println(bd1.compareTo(bd2));// 1이면 매개변수보다 크고 0이면 같고 -1이면 매개변수가 더 크다.
		
		
		//BigInteger
		BigInteger bi = new BigInteger("123456789");
		//메소드는 BigDecimal과 비슷
		
		//BigInteger 형변환
		//int => BigInteger
		int num = 10;
		BigInteger bi2 = BigInteger.valueOf(num);
		
		System.out.println(bi2);
		
		int int_bigNum = bi2.intValue(); //BigInteger => int
		System.out.println(int_bigNum);
		long long_bigNum = bi2.longValue();
		System.out.println(long_bigNum);
		
		String str_bigNum = bi2.toString();
		System.out.println(str_bigNum);
	}

}
