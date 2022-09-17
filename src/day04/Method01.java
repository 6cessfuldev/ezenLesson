package day04;

public class Method01 {
	
	//정수의 합을 구하는 메소드 
	/* 
	 * 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 
	 * -메서드 명 : sum
	 * -매개변수 : int num1, int num2 (모든 매개 변수 앞에 자료형을 저겅야 함)
	 * 리턴 타입 : int
	 * 
	 */
	public static int sum (int num1, int num2) {
		
		int result = num1 + num2;
		
		return result;
	}
	
	// 기능 : 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	/* 
	 * 메서드명 : sumPrint
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : void => 알려줄 게 없는 경우
	 */
	public static void sumPrint (int num1, int num2) {
		
		System.out.println(num1 + num2);
		
	}
	
	//기능 : 두 정수가 주어지면 두 정수의 곱을 알려주는 메소드
	public static int mulPrint (int num1, int num2) {
		
		int result = num1*num2;
		
		System.out.println(result);

		return result;
	}
	

	public static void main(String[] args) {
		/* 
		 * 메서드 : 기능 함수
		 * 접근 제한자 : 접근할 수 있는 권한 범위
		 * 리턴 타입 : 메서드 실행 후 결과로 알려주는 정보의 값(자료형)
		 * 메서드명 :소문자로 작성
		 * 매개변수 : 기능을 수행하기 위한 필요 정보값
		 * 
		 * 메서드 선언 및 구현
		 * 리턴타입 메서드 명 (매개변수) {
		 * 기능 구현;
		 * }
		 * 
		 * void : 반환할 값이 없을 때
		 * 
		 * 메서드의 위치
		 * 클래스 안. 메서드 밖
		 */

		System.out.println(sum(sum(5,1),10));
		
		sumPrint(1,2);
		
		mulPrint(3,4);
	}
	


}
