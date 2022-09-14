package day02;

import java.util.Scanner;

public class 숙제2 {

	public static void main(String[] args) {
		/*
		 * 숫자 맞추기 게임
		 * 1~50 사이의 랜덤한 수 하나를 생성하여 
		 */

		
		int random = (int)(Math.random()*50)+1;
		
		int answer = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~50 중 숫자를 맞추세요.");
		
		do {
			answer = sc.nextInt();
			if(answer == random) {
				System.out.println("정답입니다.");
				break;
			} else if (answer < random) {
				System.out.println("정답보다 낮습니다.");
			} else if (answer > random) {
				System.out.println("정답보다 높습니다.");
			} else {
				System.out.println("답이 이상합니다.");
			}
		} while (answer != random);
		System.out.println("축하합니다~~~~!!!!");
		
		sc.close();
		
	}

}
