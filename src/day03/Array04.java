package day03;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {

		int[] arr = new int[] {3, 5, 7, 1, 6, 9};
		/* 합계, 평군, 최대값, 최소값 출력
		 */
		
		int sum=0, max=arr[0], min=arr[0];
		double avg = 0;

		for(int i=1; i<arr.length; i++) {
			sum += arr[i];
			max = Math.max(max,arr[i]);
			min = Math.min(min,arr[i]);
		}
		avg = (double)sum/arr.length;
		
		System.out.println("합계는 : " + sum );
		System.out.println("평균은 : " + avg );
		System.out.println("최대값은 : " + max);
		System.out.println("최소값은 : " + min);
	}

}
