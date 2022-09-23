package studentManager;

import java.util.Scanner;

public interface Program {

	//학생 리스트 출력
	void printStudent ();
	
	//학생 등록
	void insertStudent(Scanner scan);
	
	//학생 검색
	void searchStudent(Scanner scan);
	
	//수강 신청
	void registSubject(Scanner scan);
	
	//수강 철회
	void deleteSubject(Scanner scan);
}
