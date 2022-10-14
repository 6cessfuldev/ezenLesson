package library;

import java.util.Date;

public class Book {
	
	private String book_name;
	private String writer;
	private Date regDate;
	
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	public Book(String book_name, String writer, Date regDate) {
		super();
		this.book_name = book_name;
		this.writer = writer;
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "Book [book_name=" + book_name + ", writer=" + writer + ", regDate=" + regDate + "]";
	}	
}
