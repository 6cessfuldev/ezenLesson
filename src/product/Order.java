package product;

public class Order extends Product {

	private int count;

	public Order(String menu, int price, int count) {
		super(menu, price);
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Order() {};
	
}
