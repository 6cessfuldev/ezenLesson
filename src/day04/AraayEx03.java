package day04;

public class AraayEx03 {

	public static void main(String[] args) {
		/* 
		 * 1~10까지 배열에 저장하고 출력
		 */
		
		int size = 10;
		
		int[] arr1 = new int[size];
		 
		for(int i=0; i<size; i++) {
			arr1[i] = i;
		
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("---------------");	
		
		/*
		 * 10개의 size의 배열을 생성하고, 1~20사이의 랜덤 수를 입력 받은 후 출력
		 */

		int[] arr2 = new int[size];
		
		for(int i=0; i<size; i++) {
		
			arr2[i] = (int)(Math.random()*20)+1;
			
			System.out.print(arr2[i]+" ");
			
		}
		System.out.println();
		System.out.println("-------------");
		
		/* 
		 * 랜덤수의 배열을 오름차순 정렬 후 출력
		 */

		for(int i=0; i<size; i++) {
			
			for(int j=i; j<size; j++) {
				if(arr2[i]>arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
			
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("-------------");
		
		/*
		 * 배열 탐색 (출력) - 향상된 for문
		 */
		for(int tmp : arr1) {
			System.out.print(tmp+ " ");
		}
		System.out.println();
		System.out.println("----------------");
	}

}
