package day06;

public class 숙제 {

	public static void main(String[] args) {
		/* 두 정수 a,b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 메서드
		 */	
		
		System.out.println(solution1(4,1));
		System.out.println(solution2(4,1));
	}
	
	// 단순 반복문
	public static int solution1 (int num1, int num2) {		
		int sum = 0;	
		int min = Math.min(num2, num1);
		int max = Math.max(num2, num1);
		for(int i = min; i<=max; i++) {
			sum += i;
		}		
		return sum;
	}
	
	//등차수열의 합 공식  : S=(∣a−b∣+1)∗(a+b)/2
	public static int solution2 (int num1, int num2) {
		return (Math.abs(num2-num1)+1)*(num1+num2)/2;
	}
}
