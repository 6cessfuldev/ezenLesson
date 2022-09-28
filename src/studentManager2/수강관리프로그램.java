package studentManager2;

import java.util.Scanner;

public class 수강관리프로그램 {
	public static void main(String[] args) {
		/* 수강 관리 프로그램
		 * ----menu----
		 * 1. 학생 등록
		 * 2. 학생 확인(학생리스트)
		 * 3. 학생 검색(검색어 입력)
		 * 4. 수강 신청
		 * 5. 수강 철회
		 * 6. 종료
		 */
		StudentManager manager = new StudentManager();
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		
		do {
			manager.printMenu();
			menu = sc.nextInt();
			
			//메뉴에 대한 구현
			switch (menu) {
			
			case 1 : 
				manager.insertStudent(sc);
				break;
			case 2 : 
				manager.printStudent();
				break;
			case 3 : 
				manager.searchStudent(sc);
				break;
			case 4 : 
				manager.registSubject(sc);
				break;
			case 5 : 
				manager.deleteSubject(sc);
				break;
			case 6 : 
				System.out.println("종료합니다!");
				break;
				default : System.out.println("잘못된 입력입니다.");
			}
			
		} while(menu != 6); 
		sc.close();
		
		
	}
}