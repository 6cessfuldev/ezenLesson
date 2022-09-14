package day02;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		/*
		 * num를 하나 입력 받아 num의 약수를 출력
		 * 약수 : 나누어서 떨어지는 수 num%i == 0 이면 i는 num의 약수
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i =1; i<=num; i++ ) {
			if (num%i == 0) System.out.println(i);
		}
		
		sc.close();
	}

}
