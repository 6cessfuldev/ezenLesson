package day09;

public class Wrapper클래스 {

	public static void main(String[] args) {
		/* Wrapper 클래스는 기본자료형을 클래스로 변환한 것
		 * -null을 허용, 기본 자료형은 null을 허용하지 않음
		 * -메서드를 제공.
		 */

		//int num1 = null;
		Integer num2 = null; // 클래스를 만든  참조변수는 null을 허용
		String num = "1234";
		num2 = Integer.parseInt(num);
		System.out.println(num2+1);
				
		int num3 = num2.intValue();
		System.out.println(num3);
	}

}
