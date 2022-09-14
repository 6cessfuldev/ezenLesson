package day02;

import java.util.Scanner;

public class Break문 {

	public static void main(String[] args) {
		/*
		 *  break문 : 반복문을 빠져나오게 하는 키워드.
		 *  -반목문에서 break는 조건(if문)을 동반하게 된다.
		 */

		//1~10까지 출력

		for(int i = 1 ; ; i++) {
			
			if(i == 10 ) {
				System.out.println("탈출!"); 
				break;
			}
		}
		
		/*한글자를 입력받아 글자를 출력
		 * y를 압력받으면 종료.
		 */
		
		 Scanner sc = new Scanner(System.in);
		 
		 for(;;) {
			 System.out.println("문자를 입력해주세요.");
			 String ch = sc.next();
			 if(ch.charAt(0)=='y'){
				 System.out.println("입력 문자는 y입니다.");
				 break;
			 }
		 }
		
		
	}

}
