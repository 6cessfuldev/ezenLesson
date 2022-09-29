package day12;

import java.util.Scanner;

public class Product출력 {

	public static void main(String[] args) {
		// product를 class로 구성하여 상품을 등록/출력
		/* 
		 * OrderManager
		 * =>> menu
		 * 1. 제품 추가(메뉴 추가)
		 * 2. 제품 리스트 보기(메뉴판 출력)
		 * 3. 제품 주문 (제품명, 수량) (String menu, int count)를 받아서
		 * 4. 주문 내역 (+ 총 금액)
		 * 5. 프로그램 종료
		 */

		Scanner scan = new Scanner(System.in);
		Salemanager pm = new Salemanager();
		
		int select = 0;
		do {
			System.out.println("-------------");
			System.out.println("1.메뉴 추가");
			System.out.println("2.메뉴 리스트");
			System.out.println("3. 메뉴 주문");
			System.out.println("4. 주문 내역");
			System.out.println("5. 프로그램 종료");
			
			select = scan.nextInt();
			switch(select) {
			case 1 : pm.addList(scan); break;
			case 2 : pm.printList(); break;
			case 3 : pm.addOrder(scan); break;
			case 4 : pm.printOrder(); break;
			case 5 : System.out.println("종료합니다."); break;
				default : System.out.println("잘못된 입력입니다."); break;
			}
		} while (select != 5);
	
		
	}

}