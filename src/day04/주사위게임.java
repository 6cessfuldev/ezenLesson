package day04;

import java.util.Scanner;

public class 주사위게임 {

	public static void main(String[] args) {

		String[] arr = {"가위","바위","보","가위"};
		int computer = (int)(Math.random()*3);
		int user = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 중 하나를 입력해주세요.");
		
		while(true) {
			String input = sc.next();
			int index = -1;
			
			for(int i=0; i<3; i++) {
				if(arr[i].equals(input)) {
					index = i;
				}
			}
			if(index == -1) {
				System.out.println("입력이 잘못되었습니다.");
			} else {
				user = index;
				break;
			}
		}

		System.out.println("컴퓨터는 " + arr[computer] + "를 냈고 당신은 " + arr[user] + "을 냈습니다.");	
		if(user==computer) {
			System.out.println("당신은 비겼습니다.");
		} else if (arr[user].equals(arr[computer+1])) {
			System.out.println("당신은 이겼습니다.");
		} else {
			System.out.println("당신은 졌습니다.");
		}
		sc.close();

	}

}
