package day07;

/*학생 기본 정보 : 이름, 생년월일, 나이, 전화번호
 * 학원 정보 : 학원 이름=static final, 지점
 * 학생 수강 정보 : 수강과목, 기간
 * 홍길동, 900101, 33, 010-1111-1111
 * ezen, 인천
 * 자바(1개월),db(2개월), html(1개월)
 * 
 * 학생의 기본 정보 출력
 * 학생의 학원 정보 출력
 * 학생의 수강 정보 출력
 * 학생의 수강 정보를 추가하는 기능
 */

class Student2 {
	private String name;
	private String birth;
	private int age;
	private String phoneNo;
	
	private final static String academyName = "Ezen";
	private String branch;
	
	private String[] lessonArr;

	
	
	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Student2(String name, String birth, int age, String phoneNo) {
		super();
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.phoneNo = phoneNo;
	}

	public void printStuInfo() {
		System.out.println("----학생정보----");
		System.out.println("이름은 " + name);
		System.out.println("생년월일은 " + birth);
		System.out.println("나이는 " + age);
		System.out.println("폰번호는 " + phoneNo);
		System.out.println("--------------");
	}
	
	public void addLesson(String lesson) {
		
		if(lessonArr ==null) {
			String[] tmpArr = {lesson};
			lessonArr = tmpArr;
			return;
		}
		
		String[] tmpArr = new String[lessonArr.length+1];
		
		for(int i=0; i<lessonArr.length; i++) {
			tmpArr[i] = lessonArr[i];	
		}
		tmpArr[lessonArr.length] = lesson;
		
		lessonArr = tmpArr;
	}
	
	public void lessonInfo() {
		System.out.println("----수강 정보----");
		for(String s : lessonArr) {
			System.out.println(s);
		}
		System.out.println("--------------");
	}
	
	public void academyInfo() {
		System.out.println("----학원 정보----");
		System.out.println("학원 이름은 "+academyName);
		System.out.println("지점은 "+ branch);
		System.out.println("--------------");
	}
}


//객체 지향 시도

//모든 지점을 배열로 갖고 있는 클래스
public class EzenComputer {
	
	private static final String name = "이전 아카데미 컴퓨터 학원";
	private Branch[] branchArr;
	
	public void setBranchArr(Branch[] branchArr) {
		this.branchArr=branchArr;
	}
	
	public void printBranchAll() {
		for(Branch b : branchArr) {
			System.out.println(b.getLocale());
		}
	}
	
	public void printLessonAll() {
		for(Branch b : branchArr) {
			b.printLessonAll();
		}
	}
	
	public void printStudentInfoAll() {
		if(branchArr != null) {
			for(Branch b : branchArr) {
				b.printStuInfoAll();
			}
		}
	}
}

//모든 강의를 배열로 갖고 있는 Branch 클래스 
class Branch{
	
	private String locale;
	private Lesson[] lessonArr;
	
	public String getLocale() {
		return locale;
	}

	public Branch(String locale) {
		this.locale=locale;
	}
	
	public void setLessonArr(Lesson[] lessonArr) {
		this.lessonArr = lessonArr;
	}
	
	public void printLessonAll() {
		for(Lesson l : lessonArr) {
			System.out.println(l.getName());
		}
	}
	
	public void printStuInfoAll() {
		if(lessonArr != null) {
			for(Lesson l : lessonArr) {
				l.printStudentInfoAll();
			}
		}
	}
}

//강의 정보와 수강생의 정보를 담고 있는 lesson 클래스
class Lesson{
	
	private String name;
	private String period;
	private Student1[] stuArr;
	
	public String getName() {
		return name;
	}

	public Lesson(String name, String period) {
		this.name = name;
		this.period  = period; 
	}
	
	public void setStuArr (Student1[] stuArr) {
		this.stuArr = stuArr;
	}
	
	public void printStudentInfoAll() {
		if(stuArr!= null) {
			for(Student1 s : stuArr) {
				s.printStuInfo();
			}
		}
	}
	
	public int countStu() {
		System.out.println(stuArr.length);
		return stuArr.length;
	}
	
}

// 학생 기본 정보를 담고 있는 Student1 클래스
class Student1 {
	
	//학생 기본 정보
	private String name;
	private String birth;
	private int age;
	private String phoneNo;
	
	public Student1(String name, String birth, int age, String phoneNo) {
		super();
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.phoneNo = phoneNo;
	}
	
	public void printStuInfo() {
		System.out.println("----학생정보----");
		System.out.println("이름은 " + name);
		System.out.println("생년월일은 " + birth);
		System.out.println("나이는 " + age);
		System.out.println("폰번허는 " + phoneNo);
		System.out.println("--------------");
	}

}


