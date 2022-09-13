package day01;

public class 연산자 {

	public static void main(String[] args) {

		/* 대입 연산자 : =, +=, -=, /=, *=, %=
		 *  = 을 기준으로 오른쪽에 있는 값을 왼쪽에 저장
		 *  a=b b를 a에 넣어라
		 *  a 는 반드시 변수, b 는 변수, 리터럴 값이 올 수 있다.
		 */
		int a = 10; 
		
		System.out.println("a : " + a);
		
		int b = 20;
		a=b;
		
		System.out.println("a : " + a);

		int c = 1;
		c= c+a; // 누적 1+ 10 = 11
		c += a; //위와 같은 의미

		c++ ; // c = c + 1 과 같음 
		
		++c; // 미리 1을 더한 후 변수 활용

		System.out.println(c++); // c를 출력하고 난 후 1을 더함
		System.out.println(c); // 
		System.out.println(++c); // c를 출력하기 전에 1을 더함
		
		a += c++; // a에 c의 이전 값을 더하는 연산을 진행한 후에 c에 1을 더함
		
		System.out.println("a : " + a);
		System.out.println("c : " + c);
		
		/* 산술 연산자 : +, -, *, /, %
		 * 나누기 (/) 결과물은 양 옆 변수의 자료형에 따른다는 것
		 *
		 */
		
		// +  문자열 연결과 연산자를 구별하여 사용할 것 
		System.out.println("3+2 : " + 3 + 2);
		System.out.println("3+2 : " + (3+2));
		
		//나머지 연산자 % 배수 약수 구할 때
		System.out.println(3%2);
	
		/* 비교 연산자
		 * >=, <=, >, <
		 * ==, !=
		 * &&(and), ||(or)
		 */
		
		/* 조건 선택 연산자
		 * (조건식) ? 참일 때 결과 : 거짓일 때 결과
		 */
		
		System.out.println((3>2) ? "true" : "false");
		int even = 10;
		//even이 짝수인지 아닌지 판별하는 조건서택 연산자로 출력
		System.out.println((even%2 == 0 )? "짝수" : "홀수");
		
	}

}
