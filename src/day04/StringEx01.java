package day04;

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
		/* 5개의 파일명이 주어졌을 때, 검색하고자 하는 단어를 입력하면 
		 * 해당 단어를 포함하는 파일을 출력하려고 합니다.
		 */
		
		String[] filename = {"java의 정석.text", "String메서드.jpg", "이것이자바다.png",
				"이것이java다.jpg", "String의 정석.png"};
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for(int i=0; i<filename.length; i++) {
			
			if(filename[i].contains(str)) {
				System.out.println(filename[i]);
			}
			
		}
		
		
		
	}

}
