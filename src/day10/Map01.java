package day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 * - 값을 두개 저장, key값과 value값으로 저장
		 * - key는 중복불가, value는 중복가능
		 * - 아이디/패스워드 처럼 같ㅇ ㅣ묶어서 저장해야 할 때 사용
		 * HashMap<key,value> map = new HashMap<key, value>(); 
		 * Map은 Map자체로 Iterator를 사용할 수 없다.
		 * 주로 Map을 Set으로 바꿔서 사용
		 * list, set => .add / .get
		 * map => .put / .getKey() .getValue() 
		 */
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("aaa1111", "abc");
		map.put("baaaa", "1234");
		map.put("aaa1111", "abcdef");
		map.put("11111111", "abc");
		System.out.println(map);
		
		//Map => Set : entrySet(), keySet()
		Set<Map.Entry<String,String>> set = map.entrySet();

		Iterator<Map.Entry<String, String>> it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, String> tmp = it.next();
			System.out.println("ID : "+ tmp.getKey());
			System.out.println("PW : " + tmp.getValue());
		}
		
		Iterator<String> it1 = map.keySet().iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			System.out.println(key + ":" + map.get(key));
		}
	}

}
