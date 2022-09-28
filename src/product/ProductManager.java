package product;

/* OrderManager
* =>> menu
* 1. 제품 추가(메뉴 추가)
* 2. 제품 리스트 보기(메뉴판 출력)
* 3. 제품 주문 (제품명, 수량) (String menu, int count)를 받아서
* 4. 주문 내역 (+ 총 금액)
* 5. 프로그램 종료
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {

	private ArrayList<Product> list = new ArrayList<>();
	private ArrayList<Order> order = new ArrayList<>();
	
	//1. 제품 추가(메뉴 추가)
	public void addList(Scanner scan) {
		
		System.out.println("추가할 메뉴 명 입력");
		String menu = scan.next();
		System.out.println("추가할 메뉴의 가격 입력");
		int price = scan.nextInt();
		
		Product pro = new Product(menu, price);
		list.add(pro);	
		
		System.out.println(menu+"를 " + price+"원에 추가했습니다.");
	}
	
	//2. 제품 리스트 
	public void printList() {
		
		System.out.println("-----메뉴 리스트-----");
		for (Product product : list) {
			System.out.println(product.getMenu()+":"+product.getPrice());
		}
		System.out.println("------------------");
	}
	
	//3. 제품 주문 (제품명, 수량)
	public void addOrder(Scanner scan) {
		
		System.out.println("주문할 메뉴 명 입력");
		String menu = scan.next();
		System.out.println("주문할 메뉴 수량 입력");
		int count = scan.nextInt();
		
		for (Product product : list) {
			if(product.getMenu().equals(menu)) {
				Order tmp = new Order(menu, product.getPrice(), count);
				order.add(tmp);
				System.out.println("등록되었습니다.");
				return;	
			} else {
				System.out.println("메뉴에 없는 주문입니다.");
			}
		}
	}
	
	//4. 주문 내역
	public void printOrder() {
		int sum = 0;
		System.out.println("-----주문 내역-----");
		for (Order or : order) {
			sum += or.getPrice()*or.getCount();
			System.out.println(or.getMenu()+":" +or.getCount()+"개"+"총 "+or.getPrice()*or.getCount()+"원");
		}
			
		System.out.println("총 금액은 : " + sum + "입니다.");
		System.out.println("------------------");
		
	}
}
