package day03;

public class Array01 {

	public static void main(String[] args) {
		/*
		 * 배열 : 같은 타입, 같은 의미를 가지는 변수들의 집합 (참조 변수)
		 */
		
		//배열을 선언하는 방법
		int[] arr1 ;
		int arr2[] ;
		
		//배열 선언 및 초기화 방법
		int[] arr3 = new int[5];
		int[] arr4 = {1,2,3,4,5};
		int[] arr5 = new int[] {1,2,3,4,5};
		
		//배열의 길이는 0이상이어야 한다.
		//배열의 index는 0부터 시작
		
		/* 배열을 사용하는 이유는
		 * 반복문을 효과적으로 이용할 수 있기 때문이다.
		 * 배열의 번지는 0부터 총길의 -1까지
		 */
		
		// 배열의 총 길이를 알기 위해서는 {배열명}.length 이용
		System.out.println(arr4.length);
		
		//인덱스를 통해 호출
		System.out.println(arr4[0]);
		
		for(int i = 0; i<arr3.length; i++) {
			
			System.out.print(arr4[i]);
			
		}
		
		System.out.println();
		
		arr4[3] = 9;
		
		for(int i = 0; i<arr3.length; i++) {
			
			System.out.print(arr4[i]);
			
		}
		
		System.out.println();
		
		//빈 배열 출력
		System.out.println(arr3[0]);
		
		for(int i=0; i<arr3.length; i++){
			arr3[i] = i+1;
			
			System.out.println(arr3[i]);
		}
		
	}

}
