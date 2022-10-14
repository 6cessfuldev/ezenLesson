package forExam;

import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("난수의 개수를 입력하세요. : " );
		int total = scan.nextInt();
		int sum = 0;
		for (int i = 0; i < total; i++) {
			sum += (int)(Math.random()*100);
		}
		System.out.println("난수 "+total+"개의 합은 " + sum);
		

	}

}
