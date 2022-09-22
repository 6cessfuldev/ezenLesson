package day07;

public class 클래스07 {

	public static void main(String[] args) {
		/*
		 * 학생 정보의 클래스 Student
		 * -멤버 변수 
		 * -메서드(print)
		 */

		Student st = new Student();
		st.printAll();
		
		
		st.setName("Yuk");
		st.setNo(6);
		st.setClassNo(1);
		st.setGrade(1);
		st.setPhoneNo("010-2361-0167");
		
		st.printAll();
		
		Student st1 = new Student("yuk", 6,3,3,"01023610167");
		st1.printAll();
	}

	/* 초기화 방법 :기본값, 명시적 초기화, 초기화 블럭, 생성자
	 * 1. 명시적 초기화 : 멤버 변수 선언과 동시에 값을 지정
	 * 2. 초기화 블럭 : 중괄호 안에 멤버 변수를 초기화하는 방법
	 * 3. 생성자 : 생성자를 활용하는 초기화 방법
	 * 기본값 => 명시적 초기화 => 초기화 블럭 => 생성자
	 * */
	
}

class Student {
	
	private String name; 
	private int no; 
	private int classNo;
	private int grade = 1; //명시적 초기화
	private String phoneNo;
	
	{
			
			//초기화 블럭 :멤버 변수 초기화
			grade = 2;
			
	}
	
	public Student() {};
	
	public Student( String name, String phoneNo) {
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	public Student(String name, int no, int classNo, int grade, String phoneNo) {
		super();
		this.name = name;
		this.no = no;
		this.classNo = classNo;
		this.grade = grade;
		this.phoneNo = phoneNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getClassNo() {
		return classNo;
	}
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public void printAll() {
		System.out.println("Name : " + name);
		System.out.println("Grade : " + grade);
		System.out.println("Class : " + classNo);
		System.out.println("No : " + no);
		System.out.println("Phone : " + phoneNo);
		System.out.println("----------------------");
	}
	
}