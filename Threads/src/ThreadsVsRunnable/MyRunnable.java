package ThreadsVsRunnable;

public class MyRunnable implements Runnable {

	
	
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
