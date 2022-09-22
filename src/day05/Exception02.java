package day05;

public class Exception02 {

	public static void main(String[] args) {
		/* 아래 코드들은 예외가 발생할 수 있는 코드들
		 * 자주 발생시키는 예외들
		 * 
		 */
		
//		
//		//ArrayIndexOutOfBoundsException : 배열의 주소가 길이를 넘어갔을 때
//		int[] arr = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[0]);
//			
//		}
//		//ArithmeticException : 0으로 나누었을 때
//		double a = 1/0;
		
		//ClassCastException : 클래스 형변환 과정에서 예외 발성
//		P1 p = new P1();
//		/C1 c = (C)p;
//		
//		//NullPointerException : 참조 변수가 객체와 연결되지 않은 상태에서 
//		//멤버변수나 메서드에 접근하려고 하는 경우
//		P1 p = new P1();
//		C1 c = new C1();
//		
//		C1 c1 = null;
//		c1.print();

	}

}

class P1{
	void print() {}
}

class C1 extends P1 {
	@Override
	void print() {}
}
