package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 List 생성 <String>
		 * 
		 */
		
		List<String> list = new ArrayList<>();
		
		list.add("배고파..");
		list.add("배고파.....");
		list.add("너무 배고파.....");
		
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//list.sort(new Test()); // 직접 구현한 Test()
		Collections.sort(list);
	}

}
