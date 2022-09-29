package day12;

import java.util.ArrayList;
import java.util.Scanner;

import product.Order;
import product.Product;

public class Salemanager {

	private ArrayList<Sale_Generic01<String,Integer>> list = new ArrayList<>();
	private ArrayList<Sale_Generic01<String, Integer>> order = new ArrayList<>();
	//1. 제품 추가(메뉴 추가)
		public void addList(Scanner scan) {
			
			System.out.println("추가할 메뉴 명 입력");
			String menu = scan.next();
			System.out.println("추가할 메뉴의 가격 입력");
			int price = scan.nextInt();
			
			Sale_Generic01<String, Integer> pro = new Sale_Generic01<>(menu, price);
			list.add(pro);	
			
			System.out.println(menu+"를 " + price+"원에 추가했습니다.");
		}
		
		//2. 제품 리스트 
		public void printList() {
			
			System.out.println("-----메뉴 리스트-----");
			for (Sale_Generic01 product : list) {
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
			
			for (Sale_Generic01 product : list) {
				if(product.getMenu().equals(menu)) {
					Sale_Generic01 tmp = new Sale_Generic01(menu, (Integer)product.getPrice()*count);
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
			for (Sale_Generic01 or : order) {
				String menu = (String)or.getMenu();
				sum += (Integer)or.getPrice();
				System.out.println(or.getMenu()+":"+or.getPrice()+"원");
			}
				
			System.out.println("총 금액은 : " + sum + "입니다.");
			System.out.println("------------------");
			
		}
}
