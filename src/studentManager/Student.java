package studentManager;

public class Student {

	private int stuNo;
	private String name;
	private String birthNo;
	private String department;
	private String major;
	private Subject[] subjectArr;
	
	public String getName() {
		return name;
	}

	public int getStuNo() {
		return stuNo;
	}

	public Student(int stuNo, String name, String birthNo, String department, String major) {
		super();
		this.stuNo = stuNo;
		this.name = name;
		this.birthNo = birthNo;
		this.department = department;
		this.major = major;
	}

	public void print() {
		System.out.println("----학생정보----");
		System.out.println("학번 : "+ stuNo);
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + birthNo);
		System.out.println("학부 : "+ department);
		System.out.println("학과 : " + major);
		if(subjectArr == null) {
			System.out.println("수강 과목은 없습니다.");
		} else {
			System.out.println("수강 과목은");
			for (Subject subject : subjectArr) {
				System.out.print(subject.getName()+"("+subject.getCode()+")");
			}
			System.out.println();
			System.out.println("입니다.");
		}
		
	}
	
	public boolean searchSubject(Subject sub) {
		if(subjectArr == null) {
			return false;
		} else {
			for (Subject subject : subjectArr) {
				if(subject.equals(sub)) {
					return true;
				}
			}
			return false;
		}
	}
	
	public boolean registSubject(Subject sub) {
		if(searchSubject(sub)) {
			return false;
		} else if(subjectArr == null){
			Subject[] tmp = { sub };
			subjectArr = tmp;
			return true;
		} else {
			if(subjectArr.length<1) {
				Subject[] tmp = {sub};
				subjectArr = tmp;
			} else {
				Subject[] tmp = new Subject[subjectArr.length+1];
				for (int i = 0; i < tmp.length; i++) {
					tmp[i] = subjectArr[i];
				}
				tmp[subjectArr.length] = sub;
			}
			return true;
		}
		
	}
	
	public boolean deleteSubject(Subject sub) {

		if(!searchSubject(sub)) {
			return false;
		} else {
			
			// 삭제하고 싶은 수강명의 인덱스 검색
			int del = 0;
			for (int i = 0; i < subjectArr.length; i++) {
				if(subjectArr[i].equals(del)) {
					del = i;
				}
			}
			
			Subject[] tmp = new Subject[subjectArr.length-1];
			for (int i = 0; i < tmp.length; i++) {
				if(i == del) {
					tmp[i] = subjectArr[++i];
				} else {
					tmp[i] = subjectArr[i];
				}
			}
			return true;
		}
		
	}
}
