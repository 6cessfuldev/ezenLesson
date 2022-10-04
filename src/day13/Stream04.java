package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Stream04 {

	public static void main(String[] args) {
		/* 여행사 상품 
		 * 여행 비용 :15세 이상은 100만원, 15세 미만은 50만원
		 * 고객 3명이 패키지 여행을 떠난다고 했을 때 비용 계산, 고객 명단 검색, 출력
		 * 고객에 대한 클래스 생성, ArrayList로 고객을 관리
		 * 
		 * 고객 정보 
		 * CustomerLee
		 * 이름: 이순신, 나이 : 40, 비용 100
		 * CustomerKim
		 * 이름: 김유신, 나이 : 20, 비용 100
		 * CustomerHong
		 * 이름: 홍길동, 나이 : 13, 비용 50
		 * 
		 * 고객 명단 + 여행 경비 합계
		 * 20대 이상 고객 명단 => 이름순으로 정렬
		 * 
		 */
		
		Customer custom1 = new Customer("이순신", 40);
		Customer custom2 = new Customer("김유신", 20);
		Customer custom3 = new Customer("홍길동", 13);
		
		ArrayList<Customer> list = new ArrayList<>();
		list.add(custom1);
		list.add(custom2);
		list.add(custom3);
		
		int sum =0;
		System.out.println("-----고객 명단-----");
		for (Customer customer : list) {
			System.out.println(customer.getName());
			sum += customer.getPrice();
		}
		System.out.println("비용 합계는 " + sum);
		System.out.println("---20대 이상-----");
		
		Collections.sort(list);
		
		for (Customer customer : list) {
			if(customer.getAge()>=20) {
				System.out.println(customer.getName());
			}	
		}
	
		/*------------------- stream을 사용 --------------------*/
		System.out.println("=================Stream 사용=================");
		List<Customer> list2 = Arrays.asList(
					new Customer("이순신", 40),
					new Customer("김유신", 20),
					new Customer("홍길동", 13)
					);
		
		
		//Comparator클래스 사용하기
		list2.sort(new Comparator<Customer>(){

			@Override
			public int compare(Customer o1, Customer o2) {
				// String : compareTo 1, -1 ,0;
				// int : - 
				return o1.getName().compareTo(o2.getName());
			}
		});
	
		
		Stream<Customer> s1 = list2.stream();
		s1.map(c -> c.getName()).forEach(s -> System.out.println(s));
		System.out.println("----총비용----");
		int sum2 = list2.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 경비: " + sum2);
		
		System.out.println("------20대 이상------");
		Stream<Customer> s2 = list2.stream();
		//s2.filter(a -> a.getAge()>=20).sorted().forEach(a -> System.out.println(a.getName()));
		s2.filter(a -> a.getAge()>=20).map(c -> c.getName()).sorted().forEach( a -> System.out.println(a));
		
	}	
}

class Customer implements Comparable<Customer> {
	private String name;
	private int age;
	private int price;
	
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.price = (age >= 20) ? 100 : 50;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	@Override
	public boolean equals(Object obj) {
		 
		Customer other = (Customer)obj;
		 
		return this.age == other.getAge();
	}
	
	
	@Override
	public int compareTo(Customer o) {
		
		return this.name.compareTo(o.getName());
	}
	
}