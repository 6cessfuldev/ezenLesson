package day03;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		/* 
		 * 숫자를 입력 받아 입력 받은 숫자를 거꾸로 출력
		 * ex) 11456 => 65411 => 6+5+4+1+1
		 * ex) 19463 => 36491 => 3+6+4+9+1
		 * 
		 * 각 자리의 합계 출력
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		//10,100,1000,10000자리 순서로 나누어 나머지 값을 나오는 순서대로 배열 앞자리 값에 입력하는 방법
		
		
		int num = 0;
		int sum1 = 0;
		
		System.out.println("5자리 숫자를 입력하시오");
		
		do {
			
			 num = sc.nextInt();
			if(10000 <= num && num <= 99999) break;
			
		} while(num<10000 || num>99999);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
		
			arr[i] = num%(int)Math.pow(10, i+1)/(int)Math.pow(10, i);
			
			sum1 += arr[i];
			
			System.out.print(arr[i]+" ");
			
		}
		
		System.out.println("합계는 : " + sum1);
		
		
		
		// 값을 입력 받을 때 역순으로 입력하는 방법
		
		System.out.println("숫자 하나씩 5번 입력하시오");
		
		int[] arr1 = new int[5];
		int sum2 = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			int a = sc.nextInt();
			
			sum2 += a;
			
			arr1[arr1.length-1-i]= a;	
		}
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+ " ");
		}
		
		System.out.println();
		System.out.println("합계는" + sum2);
		
		
		sc.close();
	}

}
