package studentManager;

public class Subject {
	
	private String code;
	private String name;
	private int credit;
	private int totalTime;
	private String teacherName;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public Subject(String code, String name, int credit, int totalTime, String teacherName) {
		super();
		this.code = code;
		this.name = name;
		this.credit = credit;
		this.totalTime = totalTime;
		this.teacherName = teacherName;
	}
	
	
	

}
