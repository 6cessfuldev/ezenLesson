package day06;

public class Method08 {

	public static void main(String[] args) {
		/* 메소드 오버로딩
		 * -동일한 이름을 가지는 메소드가 여러 개를 만드는 경우
		 * 1. 매개변수의 개수가 다르면 가능.
		 * 2. 매개변수의 종류(자료형) 다른 경우 가능
		 * 리턴 타입은 상관 없음. 매개변수 이름도 상관없음.
		 */

	}
	
	public static int sum(int num1, int num2) {
			return num1 + num2;
	}
	
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}

}
