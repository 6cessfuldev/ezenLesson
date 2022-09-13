package day01;

import java.util.Scanner;

public class IF03 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학의 값을 입력받아 합계와 평균
		 * 평균 90이상이면 A
		 * 평균 80이상이면 B
		 * 평균 70이상이면 C
		 * 나머지는 D
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요.(0~100) : 국, 영, 수 순으로");
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		if(kor < 0 || kor > 100 ) {
			System.out.println("잘못된 값입니다.");
		}
		if(eng < 0 || eng > 100 ) {
			System.out.println("잘못된 값입니다.");
		}
		if(math < 0 || math > 100 ) {
			System.out.println("잘못된 값입니다.");
		}
		
		int sum = kor+eng+math;
		
		double avg = sum/3.0;
		
		
		if(avg > 100) {
			System.out.println("잘못된 값입니다.");
		} else if (avg >= 90) {
			System.out.println("A");
		} else if(avg >= 80) {
			System.out.println("B");
		} else if(avg >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
	}

}
