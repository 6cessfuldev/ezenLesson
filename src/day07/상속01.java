package day07;

public class 상속01 {

	public static void main(String[] args) {
		/* 상속 : 부모의 것을 자식에게 물려주는 것
		 * 클래스 상속 : 부모 클래스의 멤버변수와 메서드를 물려주는 것
		 * 상속의 이유 : 재사용을 해서 코드 중복을 제거
		 * 부모 클래스 A 자식 클래스가 B라면
		 * class B extends A{
		 * } 
		 * 상속을 받으면 부모의 멤버변수와 메서드를 사용할 수 있다.
		 * But 접근제한자가 private 이면 사용할 수 없다.
		 * -접근제한자 protected : 자식 클래스에게 접근 가능하게 해주겠다.
		 */
		
		A a = new A();
		a.setA(10);
		a.print();
		
		B b = new B();
		b.setB(20);
		b.print();
	}

}

class A{
	private int a, b, c; // 나만 사용
	protected int num; // 클래스, 패키지, 자식 클래스 사용 가능
	
	public void print() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}

class B extends A{
	
	private int d, e, f;

	@Override
	public void print() {
		super.print();
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
	
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	
}
