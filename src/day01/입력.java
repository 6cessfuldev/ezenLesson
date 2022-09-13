package day01;

import java.util.Scanner;

public class 입력 {

	public static void main(String[] args) {
		/*Scanner : 클래스 => 콘솔에서 값을 입력 받을 수 있게 해준다.
		 * 내가 입력한 값이 짝수인지, 홀수인지 판별
		 */
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
	
		if(num1%2 == 0 ) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		/* num2를 입력받아 num2의 상태가 양수, 음수, 0인지 판별하시오. 
		 */
		int num2 = sc.nextInt();
		
		if(num2 >0) {
			System.out.println("양수입니다.");
		} else if(num2 == 0){
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
		}
	
		sc.close();
	}

}
