package day02;

public class 숫자문제 {

	public static void main(String[] args) {
		/*
		 * 다음과 같이 출력되도록 반복문을 작성하시오.
		 * 
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9 
		 */

		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				System.out.print(3*(i-1)+j+" ");
			}
			System.out.println();
		}
		
		//카운트 사용하기
		int count=0;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}

}
