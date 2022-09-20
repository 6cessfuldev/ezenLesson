package day05;

public class Method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printMulti(2);
	}

	/* 구구단 출력 메서드
	 * 매개변수 : 정수
	 * 리턴 타입 : 
	 * 메서드명 : printMulti
	 */
	
	public static void printMulti (int a) {
		
		for(int i=1; i<=9; i++) {
			System.out.println(a + " * " + i + " = " + a*i );
		}
		
	}
	
}
