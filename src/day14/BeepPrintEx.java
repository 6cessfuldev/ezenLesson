package day14;

import java.awt.Toolkit;

public class BeepPrintEx {

	public static void main(String[] args) {

		Runnable t2 = new BeepPrintThread01();
		Thread t3 = new Thread(t2);
		t3.setPriority(Thread.NORM_PRIORITY);
		System.out.println(t3.getState());
		t3.start();
		System.out.println(t3.getState());
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			System.out.println(i+"print");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}