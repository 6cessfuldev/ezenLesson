package day02;

public class For02 {

	public static void main(String[] args) {
		/* 
		 * 1~10까지의 홀수 합과 짝수 합
		 */
		
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i = 1; i<11; i++) {
			if(i%2 == 0 ) {
				evenSum = evenSum + i;
			} else {
				oddSum = oddSum + i ;
			}
		}
		
		System.out.println("짝수의 합은 " +evenSum);
		System.out.println("홀수의 합은 " +oddSum);
	
		/*
		 * 구구단 출력 2단 ~ 9단까지
		 */
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		
		

	}
	
	
}
