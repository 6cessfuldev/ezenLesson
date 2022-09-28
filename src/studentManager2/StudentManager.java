package studentManager2;

import java.util.Scanner;

public class StudentManager implements Program {

	private Student[] std = new Student[10];
	private int stdCount; // 등록한 학생 수 카운트	
	
	@Override
	public void printStudent() {
		// 등록한 모든 학생을 출력하는 메소드
		for(int i=0; i<stdCount; i++) {
			printStudentOne(std[i]);
		}
	}

	@Override
	public void insertStudent(Scanner scan) {
		// 1명의 학생정보 값을 입력받아 객체 생성 후 객체 배열에 저장
		System.out.println("--학생 정보 입력--");
		System.out.println("이름 : ");
		String name = scan.next();
		System.out.println("주민번호 : ");
		String rNum = scan.next();
		System.out.println("학번 : ");
		String sNum = scan.next();
		System.out.println("학부 : ");
		String faculty = scan.next();
		System.out.println("학과 : ");
		String major = scan.next();
		System.out.println("--------------");
		
		Student s = new Student(sNum,name, rNum, faculty, major);
		
		//배열이 다 찼다면 더 큰 배열을 생성 후 배열 복사
		
		if(stdCount == std.length) {
			//new 배열 생성
			Student[] tmp = new Student[stdCount+5];
			
			//System.Arraycopy(구배열, 시작번지, 신배열, 시작번지, 총개수)
			System.arraycopy(std, 0, tmp, 0, std.length);
			
			//새로 만든 배열로 연결
			std = tmp;
		}
		
		std[stdCount] = s;
		stdCount++;
		
		
	}

	@Override
	public void searchStudent(Scanner scan) {
		// 입력받은 학생명으로 std 검색
		// 검색어를 입력받기~!
		System.out.println("--검색할 이름 입력--");
		String tmpName = scan.next();
		//전체배열탐색
		for (int i = 0; i < stdCount; i++) {
			if(tmpName.equals(std[i].getName())) {
				//한사람의 정보를 출력
				printStudentOne(std[i]);
			}
		}

	}

	@Override
	public void registSubject(Scanner scan) {
		// 수강신청하고자 하는 학생 이름 체크
		// 학생의 위치를 알려주는 index 변수
		int index = -1;
		//학번을 입력받아 수강신청자 체크
		System.out.println("수강신청할 학번 입력: ");
		String sNum = scan.next();
		//그 학번이 어디에 있는지 체크 (index 번지에 검색학생 위치 확보)
		for (int i = 0; i < stdCount; i++) {
			if(sNum.equals(std[i].getStudentNum())) {
				index = i;
				break;
			}
		}
		
		//만약 학번을 못찾았다면...
		if(index == -1) {
			System.out.println("존재하지 않는 학번입니다.");
			return;
		}
		// 과목명을 입력받아 과목 객체 생성 insertSubject 메서드 호출
		System.out.println("--과목명 : ");
		String sTitle = scan.next();
		Subject sub = new Subject(sTitle);
		std[index].insertSubject(sub); //student에서 insertSubject 메서드 호출
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 수강신청하고자 하는 학생 이름 체크
		// 학생의 위치를 알려주는 index 변수
		int index = -1;
		//학번을 입력받아 수강신청자 체크
		System.out.println("수강철회할 학번 입력: ");
		String sNum = scan.next();
		//그 학번이 어디에 있는지 체크 (index 번지에 검색학생 위치 확보)
		for (int i = 0; i < stdCount; i++) {
			if(sNum.equals(std[i].getStudentNum())) {
				index = i;
				break;
			}
		}
		
		//만약 학번을 못찾았다면...
		if(index == -1) {
			System.out.println("존재하지 않는 학번입니다.");
			return;
		}
		// 과목명을 입력받아 과목 deleteSubject 메서드 호출
		System.out.println("--과목명 : ");
		String sTitle = scan.next();
		std[index].deleteSubject(sTitle); //student에서 insertSubject 메서드 호출
	}
	
	/* 수강 관리 프로그램
	 * ----menu----
	 * 1. 학생 등록
	 * 2. 학생 확인(학생리스트)
	 * 3. 학생 검색(검색어 입력)
	 * 4. 수강 신청
	 * 5. 수강 철회
	 * 6. 종료
	 */
	public void printMenu() {
		System.out.println("-----menu-----");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 목록");
		System.out.println("3. 학생 검색");
		System.out.println("4. 수강 신청");
		System.out.println("5. 수강 철회");
		System.out.println("6. 종료");
		System.out.println("--------------");
		System.out.println("메뉴를 선택해주세요.");
		
	}

	public void printAlert() {
		System.out.println("메뉴를 잘못 입력했습니다.");
	}
	
	//한명의 학생을 출력할 수 있는 메서드
	public void printStudentOne(Student s) {
		System.out.println("-----학생정보-----");
		s.stuPrint();
		System.out.println("-----수강정보-----");
		s.print();
		
	}

	public Student[] getStd() {
		return std;
	}

	public void setStd(Student[] std) {
		this.std = std;
	}

	public int getStdCount() {
		return stdCount;
	}

	public void setStdCount(int stdCount) {
		this.stdCount = stdCount;
	}

	
	
}
