package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) {
		/*
		 * --메뉴판--
		 * 1. 햄버거 : 15000
		 * 2. 피자 : 20000
		 * 3. 음료 : 2000
		 * 4. 과자 : 1000
		 * 5. 사탕 : 500
		 * 6. 프로그램 종료 
		 * 
		 * 메뉴를 선택해주세요. 1 수량을 입력해주세요. 1
		 * 메뉴를 선택해주세요. 2 수량을 입력해주세요. 2
		 */

		Scanner scan = new Scanner(System.in);		
		FoodManager fm = new FoodManager();
		
		int bye = 0;
		do {
			System.out.println("--메뉴판--");
			System.out.println("1. 햄버거 : 15000");
			System.out.println("2. 피자 : 20000");
			System.out.println("3. 음료 : 2000");
			System.out.println("4. 과자 : 1000");
			System.out.println("5. 사탕 : 500");
			System.out.println("6. 프로그램 종료");
			
			fm.order(scan);
			
			System.out.println("주문을 종료하시겠습니까?(Y=1/N=2)" );
			bye = scan.nextInt();
		} while (bye == 2);
		
		fm.printSum();
	}
}

class FoodManager {
	
	private String[] menu = {"햄버거", "피자", "음료", "과자", "사탕"};
	private List<Integer> orderNum;
	private List<Integer> qtt;
	
	public FoodManager () {

		orderNum = new ArrayList<Integer>();
		qtt = new ArrayList<Integer>();
	}
		
	//주문을 받는 기능
	public void order(Scanner scan){
		
		int menuNum = 0;
		boolean flag = false;
		do {
			System.out.println("메뉴를 선택해주세요.");
			menuNum = scan.nextInt();
			
			if(menuNum == 6) return;
			
			if(0 > menuNum && menuNum >6 ) {
				System.out.println("메뉴 번호가 잘못되었습니다."); 
				flag = true;
			}
		} while (flag);
		
		orderNum.add(menuNum);
		
		System.out.println("수량을 선택해주세요.");
		int vol = scan.nextInt();
		qtt.add(vol);
		
		System.out.println("----주문 내용----");
		System.out.println(menu[menuNum-1] + " : " + vol);
	}
	
	
	//주문 목록과 총 금액 출력
	public void printSum() {
		
		int sum = 0;
		
		System.out.println("----주문 목록----");
		
		for (int i = 0; i < orderNum.size(); i++) {
			System.out.println(menu[orderNum.get(i)-1] + " " + qtt.get(i) + "개");
		}
		
		for (int i = 0; i < orderNum.size(); i++) {
			switch(orderNum.get(i)) {
			case 1 : sum += 15000*qtt.get(i); break;
			case 2 : sum += 20000*qtt.get(i); break;
			case 3 : sum += 2000*qtt.get(i); break;
			case 4 : sum += 1000*qtt.get(i); break;
			case 5 : sum += 500*qtt.get(i); break;
			}
		}
		
		System.out.println("주문하신 음식의 총 금액은");
		System.out.println(sum + "원입니다.");
		
	}

}




