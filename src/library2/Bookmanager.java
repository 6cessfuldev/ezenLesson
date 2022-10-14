package library2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Bookmanager {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Book> bookList = new ArrayList<>();
	ArrayList<User> userList = new ArrayList<>();

	
	public void Main () throws NumberFormatException, IOException, ParseException {
		
		int choice = 0;
		
		do {
			System.out.println("==============");
			System.out.println("1. 도서 관리");
			System.out.println("2. 도서관 이용");
			System.out.println("==============");
			choice = Integer.parseInt(br.readLine());
			
			switch(choice) {
			case 1 : libMenu(); break;
			case 2 : userMenu(); break;
				default : System.out.println("잘못된 입력입니다.");
			}
		} while(true);
	}
	
	/* 도서관 이용 메서드 */
	
	public void userMenu() throws NumberFormatException, IOException {
		
		int choice = 0;
		
		System.out.println("==============");
		System.out.println("1. 회원 가입");
		System.out.println("2. 도서 검색");
		System.out.println("3. 도서 대출");
		System.out.println("4. 도서 반납");
		System.out.println("==============");
		choice = Integer.parseInt(br.readLine());
			
		switch(choice) {			
		case 1 : signUp(); break;
		case 2 : searchBook(); break;
		case 3 : rentBook(); break;
		case 4 : returnBook(); break;
			default : System.out.println("잘못된 입력입니다.");
		}
	}
	
	public void signUp() throws IOException {
		System.out.println("가입할 회원의 이름은 :");
		String name = br.readLine();

		for (User user : userList) {
			if(user.getName().equals(name)) {
				System.out.println("이미 가입되어 있습니다.");
				return;
			}
		}
		
		User user = new User(name);
		userList.add(user);
		System.out.println("회원 가입 되었습니다.");
	}
	
	public ArrayList<Book> searchBook() throws IOException {
		
		ArrayList<Book> res = new ArrayList<>();
		int choice = 0;
		System.out.println("===검색 내용===");
		System.out.println("1. 도서명 ");
		System.out.println("2. 저자명 ");
		
		boolean flag = false;
		if(choice == 1) {
			System.out.println("검색어를 입력");
			String name = br.readLine();
			for (Book book : bookList) {
				if(book.getBook_name().equals(name)) {
					System.out.println(book);
					res.add(book);
					flag=true;
				}
			}
		} else if(choice == 2) {
			System.out.println("검색어를 입력");
			String writer = br.readLine();
			for (Book book : bookList) {
				if(book.getWriter().equals(writer)) {
					System.out.println(book);
					res.add(book);
					flag=true;
				}
			}
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
		return res;
	}
	
	public void rentBook() {
		
	}
	
	public void returnBook() {
		
	}
	
	
	/*       도서 관리 메소드      */
	
	public void libMenu() throws IOException, ParseException {
		
		int choice = 0;
		
		System.out.println("==============");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 목록");
		System.out.println("3. 도서 수정");
		System.out.println("4. 도서 삭제");
		System.out.println("==============");
		choice = Integer.parseInt(br.readLine());
		
		switch(choice) {
		case 1 : bookCreate(); break;
		case 2 : bookRead(); break;
		case 3 : bookUpdate(); break;
		case 4 : bookDelete(); break;
			default : System.out.println("잘못된 입력입니다.");
		}
	}
	
	public void bookCreate() throws IOException, ParseException {
		System.out.println("책 이름은 : ");
		String name = br.readLine();
		System.out.println("저자 이름은 : ");
		String writer = br.readLine();
		System.out.println("등록 날짜는 :[yyyyMMdd]");
		String date = br.readLine();
		Date d = new SimpleDateFormat("yyyyMMdd").parse(date);

		Book book = new Book(name, writer, d);
		bookList.add(book);
	}
	
	public void bookRead() {
		for (Book book : bookList) {
			System.out.println(book);
		}
	}
	
	public void bookUpdate() throws IOException, ParseException {
		System.out.println("수정할 책 이름은 :");
		String name = br.readLine();
		
		boolean flag = false;
		for (Book book : bookList) {
			if(book.getBook_name().equals(name)) {
				System.out.println("수정할 내용");
				System.out.println("1. 도서명");
				System.out.println("2. 저자명");
				System.out.println("3. 등록일");
				
				int choice = Integer.parseInt(br.readLine());
				switch(choice) {
				case 1: 
					System.out.println("무엇으로 수정하시겠습니까?");
					name = br.readLine();
					book.setBook_name(name);
					flag = true;
					break;
					
				case 2:
					System.out.println("무엇으로 수정하시겠습니까?");
					String writer = br.readLine();
					book.setWriter(writer);
					flag = true;
					break;
				case 3:
					System.out.println("무엇으로 수정하시겠습니까?(yyyyMMdd)");
					String date = br.readLine();
					Date d = new SimpleDateFormat("yyyyMMdd").parse(date);
					book.setRegDate(d);
					flag = true;
					break;
					default : 
						System.out.println("잘못된 입력입니다.");
						return;
				}
			}
		}
		if(flag) {
			System.out.println("수정되었습니다.");
		} 
	}
	
	public void bookDelete() throws IOException {
		System.out.println("삭제할 책 이름은 :");
		String name = br.readLine();
		
		boolean flag = false;
		Iterator<Book> iterator = bookList.iterator();
		while(iterator.hasNext()) {
			Book book =iterator.next();
			if(book.getBook_name().equals(name)){
				iterator.remove();
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("검색 결과가 없습니다.");
		}
	}
}


