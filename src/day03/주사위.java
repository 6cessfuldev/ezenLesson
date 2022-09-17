package day03;

import java.util.Scanner;

public class 주사위 {

	public static void main(String[] args) {
		/*
		 * 주사위를 던져서 총 30칸을 이동
		 * 나는 총 몇 번 주사위를 던져서 완주했는지
		 * 주사위 랜덤으로 1~6까지 값을 생성
		 * 한번 던질 때마다 얼마가 나왔는지 출력
		 * 던진 후 
		 * "주사위 : 3"
		 * "*칸 남았습니다."
		 * 
		 * 도작하면
		 * "도착~!! 총 이동횟수 : *번.
		 */

		int count = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("주사위를 던져주세요.");
			
			String go = sc.nextLine();
			
			int random = (int)(Math.random()*6)+1;
			
			System.out.println("주사위 : " + random);
			
			sum += random;
			count++;
			
			if(sum>=30) {
				break;
			} else {
			System.out.println(30-sum + " 칸 남았습니다.");
			}
		}
		
		System.out.println("도착~!! 총 이동횟수 : " + count);
		
	}

}
