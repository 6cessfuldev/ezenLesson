package day02;

public class For01 {

	public static void main(String[] args) {
		/*
		 *  반복문이란 규칙적인 작업을 반복적으로 사용하는 문법
		 *  종류 : for, while, do while
		 *  for, while은 문법은 다르지만 동작은 같다.
		 *  do while은 한번 동작을 한 후 조건에 따라 반복이 시작된다.
		 *  
		 *  for(초기화; 조건식; 증감연산식){3실행문}
		 *  1. 초기화 : 조건식이나 실행문에서 사용하는 변수를 초기화
		 *  		: 실행시 처음 한번만 실행 생략 가능
		 *  2. 조건식 : 반복문의 반복을 결정하는 식. 참이면 반복, 거짓이면 종료.
		 *  		: 생략 가능 (생략하면 무조건 참이 되어 실행)
		 *  4. 증감연산식 : 조건식에서 사용하는 변수가 증가/감소되는 방식을 결정 생략 가능
		 *  
		 *  실행 순서 : 1) 초기화 => 2) 조건식 => 3) 실행문 => 4) 증감연산식
		 *  
		 * 1~10 까지 출력하는 예제
		 * 
		 */

		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		/* 10부터 1까지 출력
		 * 초기화 : i=10;
		 * 조건식 : i>0;
		 * 증감연산식 : i--
		 * 실행문 : syso(i);
		 */
		
		for(int i=10; i>0; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			System.out.print(11-i+" ");
		}
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) System.out.print(i+" ");
		}
		System.out.println();
		
		/* 1~10까지의 합계 출력
		 * 초기화 : int i = 1;
		 * 조건식 : i<=10;
		 * 증감식 : i++
		 * 실행문 : sum + i;
		 * 실행 후 : 
		 */
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	
		/* 구구단 2단 춮력
		 * 2*1=2, 2*2=2 ...
		 */
		
		for(int i=1; i<=9; i++) {
			System.out.println(2+ "*" + i + "=" + (2*i) );
		}
		
	}
	
	
	
	

}
