package library2;

import java.util.ArrayList;

public class User {

	private String name;
	private ArrayList<Book> rentList = new ArrayList<>();
	private ArrayList<Book> rentHistory = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Book> getRentList() {
		return rentList;
	}
	public void setRentList(ArrayList<Book> rentList) {
		this.rentList = rentList;
	}
	public ArrayList<Book> getRentHistory() {
		return rentHistory;
	}
	public void setRentHistory(ArrayList<Book> rentHistory) {
		this.rentHistory = rentHistory;
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public void addList(Book book) {
		rentList.add(book);
		rentHistory.add(book);
	}

}
