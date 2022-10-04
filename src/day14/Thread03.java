package day14;

public class Thread03 extends Thread {
	
	//객체 생성 시 이름을 주면 스레드 이름을 set
	public Thread03(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10000; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName());
		
	}
	
	
	
}
