package day14;

import java.util.ArrayList;

public class ThreadJoinEx extends Thread {
	//seq 변수를 가지는 스레드 생성
	int seq;
	
	public ThreadJoinEx(int seq) {
		this.seq = seq;
	}

	@Override
	public void run() {
		System.out.println(this.seq + "thread start");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(this.seq + "thread end");
	}
	
	public static void main(String[] args) {

		//순차적으로 발생/종료 => main 종료
//		for (int i = 0; i < 10; i++) {
//			Thread t = new ThreadJoinEx(i);
//			t.start();
//			try {
//				t.join(); // 스레드 실행이 끝날 때가지 기다려라
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//
//		System.out.println("main 종료!!");
		
		//List를 이용하여 쓰레드 생성 시 생성된 객체를 저장
		//main 메서드가 종료되기 전까지 대기
		ArrayList<Thread> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			Thread t = new ThreadJoinEx(i);
			t.start();
			list.add(t);
		}
		
		for (int i = 0; i < list.size(); i++) {
			Thread t = list.get(i);
			try {
				t.join(); // 스레드 실행이 끝날 때가지 기다려라
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("main 끝!");
		
		// 스레드가 종료되지 않았는데, 다음 로직이 수행되는 경우를 막는 역할
				
	}	
}
