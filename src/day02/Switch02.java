package day02;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		/* 정수 2개와 연산자 하나를 입력 받아 두 정수의 연산을 출력
		 * 연산자 (+ - *  /)
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 두개를 입력해주세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("연산자를 입력해주세요.");
		
		char op =sc.next().charAt(0);
		//next는 공백을 포함하지 않는 단어
		//nextLine는 공백을 포함하는 문자열
		
		switch (op) {
		case '+' :  System.out.printf("%d+%d=%d", a,b,(a+b)); break;
		case '-' : System.out.printf("%d-%d=%d", a,b,(a-b)); break;
		case '*' : System.out.printf("%d*%d=%d", a,b,(a*b)); break;
		case '/' : System.out.printf("/d//d=/f", a,b,((double)a/b)); break;
		default: System.out.println("연산자가 잘못되었습니다."); break;
		}
	
		sc.close();
		
	}

}