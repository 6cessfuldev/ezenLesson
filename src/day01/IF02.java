package day01;

public class IF02 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 점수의 합계와 평균을 출력.
		 * 평균이 80이상이면 합격, 아니면 불합격
		 */
		
		int kor = 80, eng = 90, math = 70;
		
		int sum = kor + eng + math;
		double avg = sum/3.0;
		
		if(avg >= 80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		System.out.println((avg >=80) ? "합격" : "불합격");
	}

}
