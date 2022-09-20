package day05;

public class Method06 {

	public static void main(String[] args) {
		int arr[] = new int[] {1,3,5,7,4,5,7,4,2,3,4};
		
		int[] arr2 = sortArray(arr);
		
		//sortArray의 리턴값으로 받은 arr2
		printArray(arr2);
		//sortArray 메소드 내에서 메인 메소드 변수인 arr 값을 수정 
	
	}
	
	/* 기능 : 주어진 배열을 콘솔에 출력
	 * 매개 변수 : arr[]
	 * 리턴 타입 : void
	 * 메서드 명 : printArray
	 * 옆으로 출력 / 5개씩 한줄에 나열
	 */
	public static void printArray (int[] arr) {

		int count = 0;
	
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i !=0 && i%5 == 0) System.out.println();
		}
		
//		for(int i = 0; i<arr.length/5+1; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.print(arr[count++]);
//				if(count == arr.length) break;
//			}
//			System.out.println();
//		}
		
	}
	
	/* 기능 : 주어진 배열을 오름차순으로 정렬
	 * 매개 변수 : arr[]
	 * 리턴 타입 : arr[]
	 * 메서드 명 : sortArray
	 */
	public static int[] sortArray (int[] arr) {
		
		for( int i=0 ; i<arr.length; i++ ) {
			for (int j=i; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr; 
		
	}
	
	/* 기능 : 새로운 배열을 만들어서 돌려주는 매서드
	 * 매개변수 : size
	 * 리턴 타입 :int[]
	 * 메서드명 : createArray
	 */
	
	public static int[] createArray (int size ) {
		
		int[] arr = new int[size];
		
		return arr;
	}
}
