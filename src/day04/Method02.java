package day04;

public class Method02 {

	public static void main(String[] args) {
	
		System.out.println(isPrimeNum(13));

		//1~100까지 중 소수를 출력
		for(int i=1; i<=100; i++) {
			
			if(isPrimeNum(i)) {
				System.out.print(i+" ");
			}
			
		}
		
	}
	
	
	/*
	 * 기능 : 정수가 소수인지 아닌지 판별
	 */
	public static boolean isPrimeNum (int num) {
		
		for(int i = 2; i<num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
}
