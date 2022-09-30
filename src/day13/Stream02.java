package day13;

import java.util.Arrays;
import java.util.stream.IntStream;

import day02.For03;

public class Stream02 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬)
		 * 
		 */

		int[] arr = {5,6,7,23,4,3,5,8,2,9};
	
		Arrays.stream(arr).filter((b) -> b%2==0).forEach(System.out::println);
		
		IntStream is = Arrays.stream(arr).filter((b) -> b%2==0);
		is.forEach(System.out::println);
		
		int[] arr2 = Arrays.stream(arr).filter(b -> b%2==0).sorted().toArray();
		
	}
}
