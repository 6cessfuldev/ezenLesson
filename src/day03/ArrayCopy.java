package day03;

public class ArrayCopy {

	public static void main(String[] args) {
		/*
		 * 배열은 크기를 가지고 있음.
		 * 길이가 정해져 있기 때문에 이후 추가/삭제를 할 수가 없다.
		 * 배열의 길이를 늘리거나, 줄이거나 할 때 배열 복사를 이용.
		 */
		
		//일반 변수를 복사할 때는 대입 연산자를 이용해 덮어쓰기로 저장
		int a= 10;
		int b = a;
		
		//
		int[] arr = new int[] {1,2,3,4,5};
		int arr1[] =  arr; //잘못된 방법
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr1[i]);
		}
		
		int arr2[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];  // arr 배열을 arr2 배열로 복사
			
			System.out.println(arr2[i]);
			
		}
		
		System.out.println(arr);
		System.out.println(arr1);
		System.out.println(arr2);
		
		System.out.println("--------------");
		
		//arraycopy 이용해서 배열을 복사할 수도 있다.
		
		int[] arr3 = new int[arr2.length*2]; 
		//arr2 => arr3으로 복사
		//System.arraycopy(복사할 배열, 시작 인덱스, 새 배열, 시작 인덱스, 개수);
		
		System.arraycopy(arr2, 0, arr3, 5, arr2.length);
		
		System.out.println(arr2);
		System.out.println(arr3);
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}

}
