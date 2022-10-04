package day14;

public class PriorityEx01 {

	public static void main(String[] args) {
		

		Thread th = new Thread03("Thread"+1);
		Thread th1 = new Thread03("Thread"+2);
		Thread th2 = new Thread03("Thread"+3);
		Thread th3 = new Thread03("Thread"+4);
		Thread th4 = new Thread03("Thread"+5);
		Thread th5 = new Thread03("Thread"+6);
		Thread th6 = new Thread03("Thread"+7);
		Thread th7 = new Thread03("Thread"+8);
		
		th.setPriority(Thread.MIN_PRIORITY);
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.MIN_PRIORITY);
		th3.setPriority(Thread.MIN_PRIORITY);
		th4.setPriority(Thread.MIN_PRIORITY);
		th5.setPriority(Thread.MIN_PRIORITY);
		th6.setPriority(Thread.MIN_PRIORITY);
		th7.setPriority(Thread.MAX_PRIORITY);
		
		th.start();
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		th7.start();
		
	}

}
