package day05;

import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
	
		/* 야구게임 메서드화
		 * 
		 * 컴퓨터 번호는 1~9 랜덤 생성 (중복x)
		 * 사용자 번호는 직접 입력
		 * 
		 */
		int[] com = new int[3];
		int[] user = new int[3];
		
		//정답 생성
		randomArray(com);
		printArray(com);
		
		int out = 0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("3개의 숫자를 입력하세요");
			//사용자 대답 배열 생성
			for(int i=0; i<3; i++) {
				user[i] = sc.nextInt();
			}
			int strike = strike(com, user);
			int ball = ball(com, user);
		
			System.out.println(strike+"스트라이크 "+ ball+ "볼" );
			
			//아웃 카운트 로직
			if(strike == 0 && ball == 0) {
				out++;
				System.out.println(out+"아웃입니다.");
				if(out >= 3) {
					System.out.println( "실패!");
					break;
				}
			}
			
			if(strike == 3) {
				System.out.println("정답입니다!");
			}
			
		} while (out <3);
}
	
	
	public static boolean isContain (int num, int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}
	
	public static int random () {
		return (int)(Math.random()*9)+1;
	}
	
	//랜덤 배열 생성
	public static void randomArray (int[]arr) {
		for(int i=0; i<arr.length; i++) {
			
			int r = random();
			while(isContain(r, arr)) {
				r = random();
			}
			arr[i] = r;
		}
	}
	
	/* 스트라이크를 판정하는 메서드
	 * 기능 : 컴퓨터의 값과 유저의 값이 위치와 숫자가 일치하면 카운트하는 기능
	 * 메서드명 : strike
	 */
	public static int strike(int[] com, int[] user) {
		int cnt = 0;
		for(int i=0; i<user.length; i++) {
			if(com[i] == user[i]) cnt++;
		}
		return cnt;
	}
	
	/* 볼 메서드
	 * 기능 : 컴퓨터의 값과 유저의 값이 일치하면 카운트하는 기능
	 * 메서드명 : ball
	 */
	public static int ball(int[] com, int[] user) {
		int cnt = 0;
		for(int i=0; i<user.length; i++) {
			for(int j=0; j<user.length; j++) {
				if(i!=j && user[i] == com[j]) cnt++;
			}
		}
		return cnt;
	}
	
	/* 배열 출력
	 */
	public static void printArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i);
		}
		System.out.println();
	}
	
}
