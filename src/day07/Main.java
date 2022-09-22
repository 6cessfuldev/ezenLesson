package day07;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*---------클래스 하나 사용---------*/
		//객체 생성
		Student2 stu =new Student2("육성민", "930513", 30, "01023610167");
		
		//학생 정보 출력
		stu.printStuInfo();
		
		//수강 정보 출력
		stu.addLesson("자바6개월");
		stu.addLesson("자바스크립트(3개월)");
		stu.lessonInfo();
		
		//학원 정보 출력
		stu.setBranch("인천");
		stu.academyInfo();
				
		
		
		
		/*--------- 객체 지향 방식-----------*/
		// 데이터 입력
		Student1 stu1 = new Student1("성시헌","930513", 30, "01023610167");
		Student1 stu2 = new Student1("육성민","930513", 30, "01023610167");
		Student1 stu3 = new Student1("강미원","930513", 30, "01023610167");
		Student1 stu4 = new Student1("강지원","930513", 30, "01023610167");
		
		Student1[] stuArr = {stu1, stu2, stu3, stu4};
		
		Lesson lesson1 = new Lesson("자바 프로그래밍", "1개월");
		lesson1.setStuArr(stuArr);
		
		Lesson lesson2 = new Lesson("자바 스크립트", "2개월");
		Lesson lesson3 = new Lesson("파이썬", "3개월");
		Lesson lesson4 = new Lesson("C++", "4개월");
		
		Lesson[] lessonArr = {lesson1, lesson2, lesson3, lesson4};
		
		Branch branch1 = new Branch("인천");
		branch1.setLessonArr(lessonArr);
		
		Branch branch2 = new Branch("서울");
		Branch branch3 = new Branch("안양");
		
		Branch[] branchArr = {branch1, branch2, branch3};
		
		EzenComputer ec = new EzenComputer();
		ec.setBranchArr(branchArr);
		
		ec.printStudentInfoAll();
 		
	}

}
