package day05;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		// 야구 게임
		// 컴퓨터가 3자리의 숫자 생성(숫자는 1~9까지)
		// 유저가 3자리의 숫자를 맞추는 게임
		// 같은 자리에 같은 숫자는 스트라이크, 숫자만 맞으면 볼, 아무것도 안맞으면 out
		
		System.out.println("야구 게임을 시작합니다. 숫자 3개를 입력해주세요.");
		
		//컴퓨터 정답 입력
		int[] com = new int[3];
		randomArray(com);
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0; // 아웃 카운트
		while (true) {			
			//사용자 입력
			int[] user = new int[3];
			for(int i=0; i<3; i++) {
				user[i] = sc.nextInt();
			}
					
			Score score = new Score(user, com);
			score.printResult();
			if(score.getStrike()==3) {
				System.out.println("정답입니다!");
				break;
			}
			
			if(score.getStrike() == 0 && score.getBall() == 0){
				count++;
				System.out.println(count + "아웃!");
				if(count >= 3) {
					System.out.println("실패!");
					break;
				}
			}
		}
		
	}
	
	public static int random() {
		return (int)(Math.random()*9)+1;
	}
	
	public static int[] randomArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			int random = 0; 
			
			do { 
				random = random();
			} while (isContain(random,arr));
			arr[i] = random;
			//System.out.println(arr[i]);
		}
		return arr;
	}
	
	public static boolean isContain (int num, int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}	
}

//입력 배열과 정답 배열을 생성자 매개변수로 넣으면 자동으로 strike와 ball의 값을 멤버 변수 값으로 갖는 클래스 
class Score {	
	
	private int[] com;
	private int[] user;
	private int strike;
	private int ball;
	
	public int getStrike() {
		return strike;
	}

	public int getBall() {
		return ball;
	}

	//생성자에 바로 스트라이크와 볼 계산하여 값 입력
	public Score (int[] user, int[] com) {
		if(user.length == 3 && com.length == 3) {
			this.com = com;
			this.user = user;
			this.strike = checkStrike();
			this.ball = checkBall();
		}
		
	}
	
	public int checkStrike() {
		
		int cnt = 0;
		
		for(int i=0; i<com.length; i++) {
			if(user[i] == com[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public int checkBall() {

		int cnt = 0; 
		
		for(int i=0; i<com.length; i++) {
			for(int j=0; j<com.length; j++) {
				if(i != j && user[i] == com[j]) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	public void printResult() {

		if( this.strike == 3 ) {
			return;
		} else {
			System.out.println(this.strike+"스트라이크 " + this.ball+"볼입니다.");
		}
	}
}
