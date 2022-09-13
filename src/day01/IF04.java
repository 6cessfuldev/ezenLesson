package day01;

import java.util.Scanner;

public class IF04 {

	public static void main(String[] args) {
		/* 정수를 입력받아서 정수가 2의 배수인지, 3의 배수인지, 6의 배수인지 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		
		// 가장 높은 수의 배수만 출력하려면
		
		if(num1 % 2 == 0) {
			
			if(num1 % 3 == 0) {
					System.out.println("6의 배수입니다.");
				} else {
					System.out.println("2의 배수입니다.");
				}
		} else {
			if(num1 % 3 == 0) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("아무것도 아닙니다.");
			}
		}
		
		
		
		

		
	}

}
