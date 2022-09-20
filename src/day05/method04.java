package day05;

public class method04 {

	public static void main(String[] args) {
		/* 메서드 선언부 구성
		 * 
		 * 접급제한자 리턴타입 메서드명(매개변수) {
		 * 	기능구현;
		 * }
		 * 
		 * 메서드 선언 위치는 클래스, 메서드 밖
		 * 
		 * */
		
		System.out.println(sum(1,3));
		System.out.println(diff(1,3));
		System.out.println(div(1,3));
		System.out.println(remainder(1,3));
	}
	
	/* 기능 두 정수의 합을 구하는 메서드
	 */
	public static int sum (int a, int b) {
		return a+b;
	}
	
	// 두 정수의 차를 알려주는 메서드
	public static int diff (int a, int b) {
		return a-b;
	}
	 
	// 두 정수의 곱을 알려주는 메서드
	public static int mul (int a, int b) {
		return a*b;
	}
	
	// 나눈 값을 알려주는 메서드
	public static int div (int a, int b) {
		return a/b;
	}
	
	// 나머지 값을 알려주는 메서드
		public static int remainder (int a, int b) {
			return a%b;
		}
	
}
