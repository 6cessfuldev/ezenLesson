package day03;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/*
		 * 5개 짜리 배열을 생성하여 1~5까지의 값을 입력하고 출력
		 * 출력 예시 : arr[0] =1 ;
		 */

		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] = "+ i);
		}
		
		sc.close();
		
		/* 
		 * 10 개 값을 갖는 배열을 생성하여 짝수의 값을 저장하고 출력
		 * 2 4 6 8 10
		 */
		
		System.out.println("-----------");
		
		int[] arr1 = new int[10];
		
		for(int i = 0 ; i<arr1.length; i++) {
			arr1[i] = 2*(i+1);
			System.out.printf("arr1[%d] = %d%n", i, arr1[i]);
		}
		
	}

}