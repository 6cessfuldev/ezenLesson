package day02;

public class Continue {

	public static void main(String[] args) {
		/* 
		 * continue문 pass, skip의 개념
		 */

		for(int i=1; i<=10; i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i+" ");
		}
		
		// 1~10까지 짝수만 출력
		
		for(int i=1; i<=10; i++) {
			if(i%2==1) continue;
			System.out.println(i);
		}
		
		
	}

}
