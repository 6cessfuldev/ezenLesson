package day02;

import java.util.Scanner;

public class DoWhile문 {

	public static void main(String[] args) {
		/* 
		 * for, while문은 조건식에 따라서 한번도 실행이 안되는 경우도 있다.
		 * do ~ while문은 무조건은 한번 실행 후 조건식에 따라 반복 혹은 중단한다.
		 * 
		 * do {
		 * 실행문;           // 무조건 실행문 한번은 실행
		 * } while (조건식); // 필수
		 */
		
		/* ---ㅡmenu---
		 * 1. 저장하기
		 * 2. 새로 만들기
		 * 3. 종료하기
		 */

		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		
		do {
			System.out.println("---menu---");
			System.out.println("1. 저장하기 ");
			System.out.println("2. 새로만들기");
			System.out.println("3. 종료하기" );
			System.out.println("----------" );
			System.out.println("입력 : " );
			
			menu = sc.nextInt();
			
			switch (menu) {
			case 1 : System.out.println("저장합니다."); break;
			case 2 : System.out.println("새로 만듭니다.."); break;
			case 3 : System.out.println("종료합니다.."); break;
				default : System.out.println("잘못된 입력입니다."); break;
			
			} 
		} while (menu != 3);
		System.out.println("프로그램 종료!!");
		
		sc.close();
	}

}
