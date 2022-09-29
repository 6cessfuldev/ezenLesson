package wordBook;

import java.util.ArrayList;
import java.util.Scanner;

/* 1. 단어 등록
 * 2. 단어 검색
 * 3. 단어 수정
 * 4. 단어 출력
 * 5. 프로그램 종료
 */

public class WordBookManager {

	ArrayList<Word> list = new ArrayList<>(); 
	Scanner scan = new Scanner(System.in);
	
	public void play() {
		int choice = -1;
		do {
			printMenu();
			choice = scan.nextInt();
			switch (choice) {
			case 1 : addWord(); break;
			case 2 : searchWord(); break;
			case 3 : modifyWord(); break;
			case 4 : printWord(); break;
			case 5 : System.out.println("종료합니다."); break;
				default : System.out.println("입력이 잘못되었습니다.");
			}
		} while(choice != 5);
		
	}
	
	public void printMenu () {
		System.out.println("----메 뉴----");
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어 검색");
		System.out.println("3. 단어 수정");
		System.out.println("4. 단어 출력");
		System.out.println("5.  종료   ");
	}
	
	public void addWord() {
		System.out.println("등록할 단어 입력");
		String word = scan.next();
		System.out.println("단어의 의미 입력");
		String mean = scan.next();
		
		Word tmp = new Word(word, mean);
		
		if(list.contains(tmp)) {
			System.out.println("이미 등록된 단어입니다.");
		} else {
			list.add(tmp);
			System.out.println("등록되었습니다.");
		}
	}
	
	public void searchWord() {
		System.out.println("검색할 단어 입력");
		String word = scan.next();
		Word tmp = new Word(word);
		if(list.contains(tmp)) {
			for (Word wo : list) {
				if(wo.equals(tmp)) {
					System.out.println(wo.getWord() + ":" + wo.getMean());
					break;
				}
			}
		} else {
			System.out.println("등록되지 않은 단어입니다.");
		}
	}
	
	public void modifyWord() {
		System.out.println("수정할 단어 입력");
		String word = scan.next();
		Word tmp = new Word(word);

		boolean flag = false;
		for (Word wo : list) {
			if(wo.equals(tmp)) {
				System.out.println("새로운 의미 입력");
				wo.setMean(scan.next());
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("수정되었습니다.");
		} else {
			System.out.println("등록되지 않은 단어입니다.");
		}
	}
	
	public void printWord() {
		for (Word word : list) {
			System.out.println(word.getWord()+ ":"+word.getMean());
		}
	}
}
