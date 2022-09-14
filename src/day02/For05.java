package day02;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		/* 최소공배수 구하기
		 * 공배수 : 두 정수에서 공통적으로 있는 배수
		 */
		
		/* num1, num2를 입력 받아 최소 공배수를 츌력하는 예제
		 * 반복횟수 : i는 num1부터 무한까지 num1씩 증가
		 * 초기값 : i = num1
		 * 조건식 : 없음.
		 * 증갑식 : i= i+num1
		 * 실행문 : i 를 num1으로 나누었을 때 나머지가 0인지 확인. && i를 num2로 나누었을 때 나머지가 0인지 확인
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
//		for(int i = num1; ; i = i +num1) {
//			
//			if (i%num2==0) {
//				System.out.println("최소공배수는 " + i + "입니다.");
//				break;
//			}
//		}
		
		for(int i=1; i<num2 ; i++) { 
			
			for(int j=1; j<num1; j++) {
				if(num1*i==num2*j) {
					System.out.println(num1*i);
					break;
				}
			}
		}
			
		
		sc.close();
		
		
//		
		

	}

}
