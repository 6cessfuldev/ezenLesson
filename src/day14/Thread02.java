package day14;

public class Thread02 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 500; i++) {
			System.out.println(i + "두번째 스레드");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

		
	}

	
	
}
