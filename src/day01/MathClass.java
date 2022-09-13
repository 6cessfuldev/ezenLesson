package day01;

public class MathClass {

	public static void main(String[] args) {
		// Math.method 
		
		// 반올림 round
		double num1 = 5.1234;
		System.out.println(Math.round(num1));

		//절대값 abs
		System.out.println(Math.abs(-10));
		
		//최댓값, 최솟값 max,min
		System.out.println(Math.max(3, 5));
		System.out.println(Math.min(3, 5));
		
		//올림, 내림 ceil, floor
		System.out.println(Math.ceil(num1));
		System.out.println(Math.floor(num1));
		
		//제곱, 제곱근, 무작위
		System.out.println(Math.pow(2, 5));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.random());
		
		int random = (int)(Math.random()*10) + 1;
		
		System.out.println(random);
	}

}
