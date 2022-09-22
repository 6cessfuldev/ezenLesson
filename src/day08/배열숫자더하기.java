package day08;

public class 배열숫자더하기 {

	public static void main(String[] args) {
		
		int[][]arr1 = {{1,2},{3,4}};
		int[][]arr2 = {{3,4},{5,6}};
		
		int[][]res = solution(arr1, arr2);
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.println(res[i][j]);
			}
		}

	}
	
	/* 두 배열(2차원) => 행, 열 크기가 같은 두 배열
	 * 이 두 배열의 같은 행, 같은 열의 값을 더해서 새로운 배열을 생성
	 * 매개 변수 : 2차원 배열 arr1, arr2
	 * 리턴 타입 : 2차원 배열
	 * 메서드 명 : solution
	 * 예) arr1=[[1,2],[3,4]] arr2=[[3,4],[5,6]] => [[4,6],[[8,10]]
	 */

	public static int[][] solution (int[][] arr1, int[][] arr2) {
		
		int[][] res = new int[arr1.length][arr1[0].length];
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				res[i][j] = arr1[i][j]+arr2[i][j];
			}			
		}
		return res;
	}
	
}
