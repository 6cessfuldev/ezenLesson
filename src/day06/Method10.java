package day06;

public class Method10 {

	public static void main(String[] args) {
		/* 재귀 메소드 : 메서드 A 안에 메서드 A를 호출하는 메서드
		 * 10! = 10*9*8*7*6*5*4*3*2*1
		 */
		
		System.out.println(fact(3));
		System.out.println(factorial(3));
		
	}

	/* 기능: 양수가 주어지면 주어진 양수의 팩토리얼 값을 알려주는 메소드
	 * 매개변수 : 양수 => int num
	 * 리턴 타입 : 펙토리얼 값=> int
	 */
	public static int fact (int num) {
		if(num<0) {
			return 0;
		}
		if(num == 0 || num == 1) {
			return 1;
		}
		int res = 1;
		
		for(int i=2; i<=num; i++) {
			res*=i; 
		}
		
		return res;
	}

	public static int factorial (int num) {
		
		if(num<0) {
			return 0;
		}
		if(num == 0 || num == 1) {
			return 1;
		}
		
		return num*factorial(num-1);
	}
	
}


