package day14;

public class Thread01 extends Thread {

	@Override
	public void run() {
		
		for (int i = 0; i < 500; i++) {
			System.out.println(i+"번째 "+getName());
			try {
				
				Thread.sleep(500); //0.5초 이후
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

	
	

}
