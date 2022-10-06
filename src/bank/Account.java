package bank;

public class Account {
	// 멤버변수 : 계좌번호, 소유주, 잔고
	private String seriesNum;
	private String owner;
	private long balance;
	
	public Account(String seriesNum, String owner) {
		super();
		this.seriesNum = seriesNum;
		this.owner = owner;
		this.balance = 0;
	}
	public String getSeriesNum() {
		return seriesNum;
	}
	public void setSeriesNum(String seriesNum) {
		this.seriesNum = seriesNum;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
}
