package bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class BankApp {
	
	String name;
	
	/* 은행업무 프로그램
	 * 값을 입력 받을 때는 scanner 안됨
	 * 메뉴 1. 계좌 생성 2. 계좌 목록 3. 예금 4. 출금 5. 종료
	 * 
	 * 1. 계좌번호는 자동 생성 "Bank-0001" "Bank-0002" .... 
	 * 2. 계좌번호는 여러 개 생성 가능.
	 * 3. 하나의 계좌에 대해 입금/출금이 가능
	 * 4. 입금/출금이 이루어지면 잔액이 변경
	 * 5. 잔액이 부족하면 출금시 잔액 부족 출력
	 * 6. 생성되지 않은 계좌에 대한 입/출금 X
	 */

	// 실행메소드
	public static void main(String[] args) throws IOException {

		Bank bank = new Bank();
		bank.menu();
	}
}

class Bank {
	
	private ArrayList<Account> list = new ArrayList<>();
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private int cnt = 1;
	
	public void menu() throws IOException {
		
		int choice = -1;
		do {
			System.out.println("------------");
			System.out.println("1. 계좌 생성");
			System.out.println("2. 계좌 목록");
			System.out.println("3. 예금");
			System.out.println("4. 출금");
			System.out.println("5. 종료");
			
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1 : addAccount(); break;
			case 2 : readList(); break;
			case 3 : deposit(); break;
			case 4 : withdraw(); break;
			case 5 : System.out.println("종료합니다.");
				default : System.out.println("잘못된 입력입니다.");
			}
			
		}while(choice != 5);
	}
	
	public void addAccount() throws IOException {
		
		System.out.println("이름을 입력하시오.");
		String owner = br.readLine();
		String num = String.format(new DecimalFormat("0000").format(cnt++));
		String seriesNum = "Bank-" + num;
		
		Account acc = new Account(seriesNum, owner);
		list.add(acc);		
	}
	
	public void readList() {
		for (Account acc : list) {
			System.out.println(acc.getOwner() + "님의 계좌 "+acc.getSeriesNum() +"의 잔액은 " +acc.getBalance()+"원입니다.");
		}
	}
	
	public void deposit() throws IOException {
		System.out.println("계좌번호를 입력하세요.");
		String acc = br.readLine();
		boolean is = false;
		for (Account account : list) {
			if(account.getSeriesNum().equals(acc)) {
				System.out.println("입금 금액을 입력하세요.");
				long depo = Long.parseLong(br.readLine());
				account.setBalance(account.getBalance()+depo);
				System.out.println("입금되었습니다.");
				is = true;
				System.out.println("해당 계좌의 잔액은 "+account.getBalance()+"원 입니다.");
			}
		}
		if(!is) System.out.println("해당 계좌가 없습니다.");
	}
	
	public void withdraw() throws IOException {
		System.out.println("계좌번호를 입력하세요.");
		String acc = br.readLine();
		boolean is = false;
		for (Account account : list) {
			if(account.getSeriesNum().equals(acc)) {
				System.out.println("출금 금액을 입력하세요.");
				long withdraw = Long.parseLong(br.readLine());
				if(withdraw <= account.getBalance()) {
					account.setBalance(account.getBalance()-withdraw);	
					System.out.println("출금되었습니다.");
				} else {
					System.out.println("잔액이 부족합니다.");
				}
				System.out.println("해당 계좌의 잔액은 "+account.getBalance()+"원 입니다.");
				is = true;
			}
		}
		if(!is) {
			System.out.println("해당 계좌가 없습니다.");
		}
	}
}