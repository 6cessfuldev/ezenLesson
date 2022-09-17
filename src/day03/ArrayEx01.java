package day03;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 
		 * 1~10까지 담고 있는 배열 arr를 생성
		 */

		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = i+1;
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("----------섞은 후----------");

		//배열을 섞는 코드
		//방법 : 랜덤한 번지(0~arr.length)를 선택해서 다른 번지와 교환
		
		int temp = 0;
		
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*(arr.length-1));
			temp = arr[i];
			arr[i] = arr[random];
			arr[random] = temp;

		}
		
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("----------정렬 후----------");
		//오름차순으로 정렬
		
		for(int i=0; i<arr.length; i++) {
		
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] =temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
}
