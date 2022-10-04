package day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BufferedReader02 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("out.txt"));

		HashMap<String, Integer> map = new HashMap<>();
		
		int sum = 0;
		while(true) {
			String line = br.readLine();
			if (line == null) break;
			String[] arr = line.split(" ");
			int score = Integer.parseInt(arr[1]);
			map.put(arr[0], score);
			sum += score;
		}		
		//System.out.println(map);
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("sum : "+sum);
		br.close();
		
		//스캐너처럼 데이터를 입력받을 때 (콘솔 입력)
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("아무 문자나 입력!!");
		String a = br2.readLine();
		//int b = br2.read(); //문자에 대응되는 코드를 찍어준다.
		System.out.println(a);
	}
}