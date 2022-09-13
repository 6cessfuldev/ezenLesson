package day01;

public class 변수 {

	public static void main(String[] args) {
		//한 줄 주석: 코드에 영향을 미치지 않는 문구 설명을 위해 사용
		
		//변수 선언 방법
		//변수타입 변수명;
		int num1, num3, num4;
		int num2 = 123; //선언 후 값을 지정
		num3 = 3;
		
		char ch;
		ch = '육';
		float num5;
		double num6;
		boolean bool;
		bool = true;
		System.out.println(bool);
		//변수는 중복 선언 불가능

		char ch1 = 'a';
		
		System.out.println(ch1);
		
		num1 = 010; //8진법
		num3 = 0x2f; //16진법
		
		System.out.println(num1);
		System.out.println(num3);
		
		long num7 = 1234567890123L;
		num5 = 1.2f;
		
		//지역변수는 일반적으로 중괄호 블록 안에서만 가능
		//지역변수 사용을 위해 반드시 초기화가 필요. cf) 멤버 변수는 자동으로 초기화를 해준다.
	}

}
