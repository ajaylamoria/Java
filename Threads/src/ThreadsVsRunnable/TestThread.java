package ThreadsVsRunnable;

public class TestThread extends Thread {

	
	public static void main(String[] args) {
		TestThread th1 = new TestThread();
		TestThread th2 = new TestThread();
		 th1.start();
		 th2.start();
		 th2.setPriority(MIN_PRIORITY);
		
    
	}

}
