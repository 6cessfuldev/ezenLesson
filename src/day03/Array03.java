package day03;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아서 배열에 저장하고,
		 * 점수의 합계와 평균 출력
		 */
	
		Scanner sc = new Scanner(System.in);
	
		int[] score = new int[5];
		int sum = 0;
		double avg = 0;
		
		for (int i = 0; i < score.length; i++) {
			
			score[i] = sc.nextInt();
			sum = sum + score[i];
			
		}
		
		avg = (double)sum/5;
		
		for(int i = 1; i<8; i++) {
			
			for(int j = 1; j<15; j++) {
				
				if(j<8-(i-1) || j>8+(i-1)) {
					System.out.print(" ");
				} else {
					System.out.print("-");
				}
				
			}
			
			System.out.println();
			
		}
		System.out.println("|합계는 " + sum+"|");
		System.out.println("|평균은 " + avg+"|");
		System.out.println("------------");
		
		sc.close();
		
	}
	
}
