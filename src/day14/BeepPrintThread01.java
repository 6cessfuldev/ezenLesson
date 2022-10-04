package day14;

import java.awt.Toolkit;

public class BeepPrintThread01 implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 10; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
	
}
