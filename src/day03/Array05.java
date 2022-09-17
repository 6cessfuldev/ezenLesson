package day03;

public class Array05 {

	public static void main(String[] args) {
		/*
		 * 5개 짜리 배열에 랜덤으로 값을 저장한 후 출력
		 * 1~50사이의 수로 생성
		 * 
		 * 합계, 평균, 최대, 최소
		 */

		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			
			arr[i] = (int)(Math.random()*50)+1;
			
			System.out.print(arr[i]+ " ");	
		}
		System.out.println();
		
		int sum=0, max=arr[0], min=arr[0]; 
		double avg = 0;
		
		for(int i=0; i<5; i++) {
			sum += arr[i];
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		avg = (double)sum/5;
		
		System.out.println("합계는 : " + sum);
		System.out.println("평균은 : " + avg);
		System.out.println("최대는 : " + max);
		System.out.println("최소는 : " + min);
		
 		
	}

}
