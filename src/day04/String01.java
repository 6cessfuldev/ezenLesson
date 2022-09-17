package day04;

public class String01 {

	public static void main(String[] args) {
		/* String 클래스 = 문자열을 다루는 클래스
		 * String str = "Hell World";
		 * 기본 자료형처럼 사용이 가능.
		 */

		String str = "Hello World";
		String email = "1234@gmail.com";
		System.out.println(email.substring(0, 4)); // 시작번지는 포함, 끝번지는 그 전까지만 포함		
		
		String exe = "123.jpg";
		
		int position = exe.indexOf(".");
		System.out.println("index는 : " + position);
		
		System.out.println(str);
		System.out.println(str.charAt(1));
		
		String str1 = new String();
		str1 = "Hello Java";
		System.out.println(str1);
		
	}

}
