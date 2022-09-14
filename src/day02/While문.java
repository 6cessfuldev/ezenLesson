package day02;

public class While문 {

	public static void main(String[] args) {
		/* 1~10까지 while문으로 작성
		 * while(조건식) {
		 * 실행문;
		 * 증감식;
		 * }
		 */

		for(int i = 1; i<=10; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		
		int a = 1;
		while(a<=10) {
			System.out.print(a++ + " ");
		}
		
		System.out.println();
		System.out.println(">> while문을 활용하여 짝수 찍기");
		
		int b=1;
		while(b<=10){
			if(b%2==0) {
				System.out.print(b);
			}
			b++;
		}
		
		
		
	}

}
