package Deadlock;
class A extends Thread{
	public void run(){
		
		synchronized (String.class) {
			System.out.println("Thread String has acquired a Lock");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (Object.class) {
				System.out.println("DeadLock Released :-Thread Object has acquired a Lock");
			}
			
			System.out.println("Run Execution Done for A");
		}
	}
}

class B extends Thread{
	
	public void run(){
		synchronized (Object.class) {
			System.out.println("Thread Object has acquired a Lock");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (String.class) {
				System.out.println("DeadLock Released:-Thread Object has acquired a Lock");	
			}
			
			System.out.println("Run Execution Done for B");
		}
	}
}
public class DeadLockCreation {

	public static void main(String[] args) {
		A th = new A();
		th.start();
		
		B th1 = new B();
		th1.start();

	}

}
