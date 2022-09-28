package day11;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx01 {

	public static void main(String[] args) {
		//  ArrayList를 만들고 1~10까지 저장한 후 출력
		// 출력구문 향상된 for문으로 출력 /Iterator로 출력

		ArrayList<String> list = new ArrayList<>();
		list.add("가");
		list.add("나");
		list.add("다");
		list.add("마");
		list.add("라");
	
		for (String string : list) {
			System.out.println(string);
		}
	
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		String[] arr1 = {"a", "b", "c"};
		
		ArrayList<String> list2 = new ArrayList<>();
		
		for (String string : arr1) {
			list2.add(string);
		}
		
		System.out.println(list2);
	}
}
