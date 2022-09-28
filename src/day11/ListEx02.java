package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import day03.Array01;

public class ListEx02 {

	public static void main(String[] args) {
		/* 두 배열을 하나로 합치는 ArrayList로 구성
		 * arr1 = d,e,f;
		 * arr2 = a,b,c;
		 * list = d,e,f,a,b,c;
		 */

		String[] arr1 = {"db","e","f"};
		
		String[] arr2 = {"a", "b", "c"};
		
		ArrayList<String> list = new ArrayList<>();
		
		for (String string : arr1) {
			list.add(string);
		}
		
		for (String string : arr2) {
			list.add(string);
		}
		
		System.out.println(list);
		
		Collections.sort(list);
		
//		list.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//
//				return o1.charAt(0) - o2.charAt(0);
//				
//			}
//		});
		
		System.out.println(list);
	}

}
