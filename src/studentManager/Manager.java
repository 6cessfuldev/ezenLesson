package studentManager;

import java.util.Scanner;

public class Manager implements Program {
	
	private Student[] stu;
	private int stuNoCount;
	
	public Manager () {
		this.stuNoCount = 1;
	}

	@Override
	public void printStudent() {
		for (Student student : stu) {
			student.print();
		}
	}

	@Override
	public void insertStudent(Scanner scan) {
		System.out.println("학생 이름을 입력하세요");
		String name = scan.nextLine();
		System.out.println("주민번호를 입력해주세요");
		String birth = scan.nextLine();
		System.out.println("학부를 입력해주세요.");
		String department = scan.nextLine();
		System.out.println("학과를 입력해주세요.");
		String major = scan.nextLine();
		
		Student stu = new Student(stuNoCount++, name, birth, department, major);
		
		System.out.println("등록 완료되었습니다.");

	}

	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("검색할 학생의 이름을 입력해주세요.");
		String name = scan.nextLine();
		for (Student student : stu) {
			if(student.getName().equals(name)) {
				student.print();
			}
		}
	}

	@Override
	public void registSubject(Scanner scan) {
		System.out.println("수강할 과목 코드를 입력해주세요.");
		String code = scan.nextLine();
		String name = scan.nextLine();
		int credit = scan.nextInt();
		int totalTime = scan.nextInt();
		String teacherName = scan.nextLine();
		
		System.out.println("등록할 학생의 학번을 입력해주세요.");
		String stuNo = scan.nextLine();
		
		for (Student student : stu) {
			if(student.getstuNo().equal(stuNo)) {
				student.registSubject(code);
			}
		}

	}

	@Override
	public void deleteSubject(Scanner scan) {
		// TODO Auto-generated method stub

	}

}
