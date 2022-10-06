package day15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EnglishDictionary {
	
	static private Scanner scan = new Scanner(System.in);
	static private HashMap<String, List<String>> map = new HashMap<>();

	/* 
	 * 출력 구조
	 * do
	 * 1. 동사 (어떤 동작이나 행위를) 하다.
	 * 2. 동사 (앞에서 언급된 대로) 하다.
	 * ...
	 */
	
	public static void main(String[] args) throws IOException {
		chooseMenu();
	}
	
	public static void printMenu() {

		System.out.println("----------");
		System.out.println("1. 단어 추가");
		System.out.println("2. 단어 목록");
		System.out.println("3. 단어 수정");
		System.out.println("4. 프로그램 종료");
	
	}
	
	public static void chooseMenu() throws IOException {
		
		int choice = -1;
		
		do {
			printMenu();
			choice = scan.nextInt();
			String forFix = scan.nextLine();
			switch (choice) {
				case 1 : add(); break;
				case 2 : read(); break;
				case 3 : update(); break;
				case 4 : System.out.println("종료");; break;
					default : System.out.println("잘못된 입력입니다."); break;
			}
		} while(choice != 5);
			
	}
	
	public static void add() throws IOException {
		System.out.println("추가할 단어를 입력");
		String word = scan.nextLine();
		System.out.println("단어의 뜻을 입력");
		String mean = scan.nextLine();
		if(map.get(word) ==null) {
			ArrayList<String> list = new ArrayList<>();
			list.add(mean);
			map.put(word, list);
		} else {
			map.get(word).add(mean);
		}
		System.out.println("추가했습니다.");
		file();
	}
	
	public static void read() {
		for (String word : map.keySet()) {
			System.out.println(word);
			int i = 1;
			for (String mean : map.get(word)) {
				System.out.println(i++ +" " +mean);
			}
		}
	}
	
	public static void update() throws IOException {
		System.out.println("수정할 단어를 입력");
		String word = scan.nextLine();
		
		if(map.get(word) == null) {
			System.out.println("저장된 단어가 아닙니다.");
			return;
		}
		
		System.out.println(word);
		int i = 1;
		for (String mean : map.get(word)) {
			System.out.println(i++ +" "+ mean);
		}
		
		System.out.println("수정할 의미의 번호를 입력해주세요.");
		int meanNum = scan.nextInt();
		String forFix = scan.nextLine();
		if(map.get(word).get(meanNum-1)==null) {
			System.out.println("해당되는 번호의 의미가 없습니다.");
			return;
		}
		
		System.out.println("의미를 입력해주세요.");
		String mean = scan.nextLine();
		map.get(word).set(meanNum-1, mean);
		System.out.println("추가 되었습니다.");
		file();
	}
	
	public static void file() throws IOException {
		FileOutputStream output = new FileOutputStream("EnglishDictionary.txt");
		StringBuilder sb = new StringBuilder();
		
		for (String word : map.keySet()) {
			sb.append(word+ "\n");
			int i = 1;
			for (String mean : map.get(word)) {
				sb.append(i++ +" "+ mean+"\n");
			}
		}		
		output.write(sb.toString().getBytes());
	}
}