package day02;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// 두 정수의 공약수와 최대공약수

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int greatCommonFactor = 0;
		
//		for(int i = 1; i<=Math.min(a, b); i++) {
//			
//			if(a%i==0 && b%i==0) {
//				greatCommonFactor = i; 
//				System.out.print(i + " ");
//			}
//			
//		}
//		
//		System.out.println("최대공약수 : " + greatCommonFactor);
//		
		/* 높은 공약수부터 찾아 반복 횟수를 줄이는 방식 */
		
		for (int i = Math.min(a, b); i>0; i--) {
			
			if(a%i == 0 && b%i == 0) {
				greatCommonFactor = i;
				break;
			}
		}
		
		System.out.println("최대공약수 : " + greatCommonFactor);
		
		
		
		sc.close();
		
	}

}
