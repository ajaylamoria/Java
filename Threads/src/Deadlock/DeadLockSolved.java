package Deadlock;

class C extends Thread{
	public void run(){
		
		synchronized (String.class) {
			System.out.println("Thread String has acquired a Lock:-" +Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (Object.class) {
				System.out.println("DeadLock Released :-Thread Object has acquired a Lock:-" +Thread.currentThread().getName());
			}
			
			System.out.println("Run Execution Done for A:-"+Thread.currentThread().getName());
		}
	}
}

class D extends Thread{
	
	public void run(){
		synchronized (String.class) {
			System.out.println("Thread Object has acquired a Lock:-"+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (Object.class) {
				System.out.println("DeadLock Released:-Thread Object has acquired a Lock:-"+Thread.currentThread().getName());	
			}
			
			System.out.println("Run Execution Done for B:-"+Thread.currentThread().getName());
		}
	}
}

public class DeadLockSolved {

	
	public static void main(String[] args) {
		C obj1 = new C();
		Thread th1 = new Thread(obj1,"Thread 1");
        th1.start();
        D obj2 = new D();
        Thread th2 = new Thread(obj2,"Thread 2");
        th2.start();
        
        // Using Join Method
	}

}
