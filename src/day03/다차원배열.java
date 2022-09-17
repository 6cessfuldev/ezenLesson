package day03;

public class 다차원배열 {

	public static void main(String[] args) {
		/* 2차원 배열 선언
		 * 자료형 배열명[][] = new 자료형[행길이][열길이];
		 */

		int arr[][] = new int[5][3];
		
		int cnt = 1;
		
		//행개수 :5개
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = cnt;
				cnt++;
				
				System.out.printf("%3d", arr[i][j]);
			}
			
			System.out.println();
		}
		
	}

}
