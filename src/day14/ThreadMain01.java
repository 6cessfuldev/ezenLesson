package day14;

public class ThreadMain01 {

	public static void main(String[] args) {

		Thread01 t1 =new Thread01();
		
		Runnable t2 =new Thread02();
		Thread t3 = new Thread(t2);
		
		//익명 객체(runnable)
		Thread t4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		
		//람다식
		Thread t5 = new Thread(() ->{
			
		});
		
		t1.start();
		t3.start();
		

	}

}
