package teamProject;

public class Company {

	
	private String name;
	private String phone;
	private int cnt;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public Company(String name, String phone, int cnt) {
		super();
		this.name = name;
		this.phone = phone;
		this.cnt = cnt;
	}
	
}
