package day12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class 학생성적관리프로그램 {

	static Scanner scan = new Scanner(System.in);
	
	static HashMap<String, Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		/* map을 (멤버변수로 or 메인에서 객체 생성해서 매개변수로)로 이용
		 * 한 학생의 성적을 관리하는 프로그램 작성
		 * scanner는 멤버 변수로 선언하고, 메서드에서 사용
		 * >> menu
		 * 1. 성적 추가 insert(map) - scan 필요
		 * 2. 성적 전체 조회(전체 과목 출력) => print(map)
		 * 3. 성적 과목 조회(과목명으로 검색 후 출력) => printSub(map) -scan 필요
		 * 4. 성적 수정 => modify(map) - scan
		 * 5. 종료
		 * 
		 * 출력 예시 "국어 : 100"
		 * 전체 조회시에만 합계 / 평균 같이 출력
		 */
		
		printMenu();
	
	}
	
	public static void printMenu() {
		
		int choice = -1;
		do {
			System.out.println("--------");
			System.out.println("1. 성적 추가 ");
			System.out.println("2. 성적 전체 조회");
			System.out.println("3. 과목명으로 성적 조회");
			System.out.println("4. 성적 수정 ");
			System.out.println("5. 종료");
			
			choice = scan.nextInt();
			switch (choice) {
			case 1 : insert(); break;
			case 2 : readAll(); break;
			case 3 : readBySub(); break;
			case 4 : modify(); break;
			case 5 : System.out.println("종료하겠습니다."); break;
				default : System.out.println("잘못된 입력"); break;				
			}
		} while (choice != 5);
	}
	
	public static void insert() {
		System.out.println("입력할 과목의 이름 입력");
		String name = scan.next();
		if(map.containsKey(name)) {
			System.out.println("이미 있는 과목입니다.");
			return;
		} else {
			System.out.println("점수를 입력해주세요.");
			int score = scan.nextInt();
			map.put(name, score);
			System.out.println("추가되었습니다.");
		}
	}
	
	public static void readAll() {
		System.out.println("---전체 성적 조회---");
		if(map.isEmpty()) {
			System.out.println("추가된 성적이 없습니다.");
			return;
		}
	
		Set<String> set = map.keySet();
		int sum = 0;
		for (String key : set) {
			System.out.println(key+" : "+map.get(key));
			sum += map.get(key);
		}
		double avg = (double)sum/map.size();
		System.out.println("성적 총 합계 : " + sum);
		System.out.println("성적 평균 : " + avg);
		
		if(avg >= 90) {
			System.out.println("1등급입니다.");
		} else if(avg >= 80) {
			System.out.println("2등급입니다.");
		} else if(avg >= 70) {
			System.out.println("3등급입니다.");
		} else if(avg >= 60) {
			System.out.println("4등급입니다.");
		} else {
			System.out.println("공부합시다..");
		}
	}

	public static void readBySub() {
		System.out.println("검색할 과목명 입력");
		String name = scan.next();
		Set<String> set = map.keySet();
		boolean flag = false;
		for (String key : set) {
			if(key.equals(name)) {
				System.out.println(key+" : "+ map.get(key));
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("등록된 과목이 아닙니다.");
		}
	}
	
	public static void modify() {
		System.out.println("수정할 과목명 입력");
		String name = scan.next();
		Set<String> set = map.keySet();
		boolean flag = false;
		for (String key : set) {
			if(key.equals(name)) {
				System.out.println("수정할 성적을 입력");
				int score = scan.nextInt();
				map.put(name,score);
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("등록된 과목이 아닙니다.");
		}
	}
}
