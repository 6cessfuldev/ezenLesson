package day12;

//Product 클래스를 제네릭 타입으로 생성
public class Sale_Generic01<K, V> {
	//멤버 변수 menu, price
	private K menu;
	private V price;
	
	public Sale_Generic01(){}
	
	public Sale_Generic01(K menu, V price) {
		this.menu = menu;
		this.price = price;
	}

	public K getMenu() {
		return menu;
	}

	public void setMenu(K menu) {
		this.menu = menu;
	}

	public V getPrice() {
		return price;
	}

	public void setPrice(V price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Sale_Generic01 [menu=" + menu + ", price=" + price + "]";
	}
	
}
