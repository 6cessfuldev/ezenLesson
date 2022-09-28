package studentManager2;
/* 3. 학생 클래스(별도 생성)
 * 학생 클래스 : 한 학생의 정보를 나타내는 클래스
 * 멤버변수 학번(studentNum) ,이름(name), 주민번호(regidentNum), 학부(faculty), 학과(major), 수강과목[](Subject[]), 수강과목배열의 번지(subCount)
 * getter/setter
 * print() - 한 학생의 정보 출력
 * 수강과목 추가 - 배열이 다 찼다면 늘려주기
 * 수강과목 삭제
 * 필요한 생성자
 */
public class Student {

	private String studentNum;
	private String name;
	private String regidentNum;
	private String faculty;
	private String major;
	private Subject[] subjectList = new Subject[5];
	private int subCount = 0;
	
	//print 메서드
	public void stuPrint() {
		System.out.println("학생명: " + name);
		System.out.println("주민번호: " + regidentNum);
		System.out.println("학부: " + faculty+ " 전공: " + major);
	}	
	
	@Override
	public String toString() {
		return "Student [학번=" + studentNum + ", 학생명=" + name + ", 주민번호=" + regidentNum + ", 학부="
				+ faculty + ", 학과=" + major + ", 수강과목수=" + subCount + "]";
	}

	//수강과목(앞에서 추가한 수강과목)을 print메서드
	public void print() {
		if(subCount==0) {
			System.out.println("--수강중인 과목이 없습니다.--");
		}
		for (int i = 0; i < subCount; i++) {
			subjectList[i].subPrint(); // subPrint 메서드 호출하여 출력
 		}
	}

	//수강과목 추가
	//매개변수 : Subject subName
	//리턴타입 : void
	public void insertSubject(Subject subName) {
		
		//수강과목 배열이 꽉 찼다면 배열을 늘려주는 작업
		if(subCount == subjectList.length) {
			//new 배열 생성
			Subject[] tmp = new Subject[subCount+5];
			
			//System.Arraycopy(구배열, 시작번지, 신배열, 시작번지, 총개수)
			System.arraycopy(subjectList, 0, tmp, 0, subjectList.length);
			
			//새로 만든 배열로 연결
			subjectList = tmp;
		}
		
		subjectList[subCount] = subName;
		subCount++;
	}
	
	//수강과목삭제
	//매개변수 : String subName
	//검색하는 기능까지 포함
	public void deleteSubject(String subName) {
		int index=-1; // 배열에서 찾는 과목의 위치
		//만약 매개변수의 값이 없다면 return;
		if(subName == null) {
			return;
		}
		
		//subName이 subjectList에 있는지 검색
		for(int i=0; i<subCount; i++) {
			if(subjectList[i].getSubName().equals(subName)) {
				index = i;
				break;
			}
		}
		
		//만약 찾는 과목이 배열에 없다면
		if(index ==-1) {
			return;
		}
		//찾는 위치부터 뒷번지 과목을 앞번지로 옮기는 작업
		for (int i = index; i < subCount-1; i++) {
			subjectList[i]=subjectList[i+1];
		}
		//복사 후 마지막 번지는 null 입력
		subjectList[subCount-1] = null;
		subCount--; //과목 번지수 감소
		
	}

	//생성자
	public Student() {}

	public Student(String name) {
		super();
		this.name = name;
	}
	
	public Student(String studentNum, String name, String regidentNum, String faculty, String major) {
		super();
		this.studentNum = studentNum;
		this.name = name;
		this.regidentNum = regidentNum;
		this.faculty = faculty;
		this.major = major;
	}

	public Student(String studentNum, String name, String regidentNum, String faculty, String major,
			Subject[] subjectList, int subCount) {
		super();
		this.studentNum = studentNum;
		this.name = name;
		this.regidentNum = regidentNum;
		this.faculty = faculty;
		this.major = major;
		this.subjectList = subjectList;
		this.subCount = subCount;
	}

	//getter/setter
	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegidentNum() {
		return regidentNum;
	}

	public void setRegidentNum(String regidentNum) {
		this.regidentNum = regidentNum;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Subject[] getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(Subject[] subjectList) {
		this.subjectList = subjectList;
	}

	public int getSubCount() {
		return subCount;
	}

	public void setSubCount(int subCount) {
		this.subCount = subCount;
	}

	
	
}