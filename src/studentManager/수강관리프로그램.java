package studentManager;

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
		
		/* 3. 학생 클래스(별도 생성)
		 * 학생 클래스 : 한 학생의 정보를 나타내는 클래스
		 * 멤버변수 학번 ,이름, 주민번호, 학부, 학과, 수강과목[]
		 * getter/setter
		 * print() - 한 학생의 정보 출력
		 * 수강과목 추가 - 배열이 다 찼다면 늘려주기
		 * 수강과목 삭제
		 * 필요한 생성자
		 */
		
		/* 2. 과목 클래스(별도 생성)
		 * 한 과목의 정보를 나타내는 클래스
		 * 멤버 변수 : 과목 코드, 과목명, 학점, 시수, 교수명
		 * 필요한 getter/setter/생성자, 과목의 내용은 tostring(한줄로)
		 */
		
		/* 4. Manager 클래스에서 검색, 추가, 삭제, 출력 메서드 구현
		 * : 학생 추가 검색 리스트 기능
		 */
		
		/*
		 * 1. program 인터페이스 
		 * 학생리스트 출력
		 * 학생 등록
		 * 학생 검색
		 * 수강 신청
		 * 수강 철회
		 */
		
		Scanner sc = new Scanner(System.in);
		
//		while() {
//			System.out.println("----menu----");
//			System.out.println("1. 학생 등록");
//			System.out.println("2. 학생 확인");
//			System.out.println("3. 학생 검색");
//			System.out.println("4. 수강 신청");
//			System.out.println("5. 수강 철회");
//			System.out.println("6. 종료");
//			
//			int select = sc.nextInt();
//			
//		};
		
		Student stu1 = new Student(1, "육성민", "930513", "컴퓨터", "소프트개발");
		stu1.print();
		
		Subject sub1 = new Subject("01", "자바", 3, 60, "성시헌");
		stu1.registSubject(sub1);
		stu1.print();
	}
}
