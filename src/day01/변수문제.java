package day01;

public class 변수문제 {

	public static void main(String[] args) {
		//국어(kor), 영어(eng), 수학(math)
		//세 값의 합계와 평균을 구하려고 합니다.
		//필요한 변수와 값을 넣어주세요.
		
		int kor = 93, eng = 82, math = 91;
		
		int total = kor+eng+math;
		
		System.out.println( total/3 );
		// 정수 연산자 정수 => 결과물도 정수 
		// 나눗셈 연산자로 인해 결과물이 정수가 아닌 실수이더라도 결과물은 정수로 나온다.
		
		double avg = (double)total/3;
		
		System.out.println("total : " + total);
		System.out.println("average : " + avg);
		System.out.println("---------------------------------");

		// 값 % 0 or 값 / 0 ArithmeticException 예외 발생 0.0이나 0.0f 로 나눌 경우 exception이 발생하지는 않으나 infinity로 결과값
		// 
	}

}