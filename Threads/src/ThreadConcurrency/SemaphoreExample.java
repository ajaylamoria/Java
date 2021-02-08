package ThreadConcurrency;

import java.util.concurrent.Semaphore;

class MyThread extends Thread{

    Semaphore semaphore;
    
    public MyThread(Semaphore s) {
           semaphore=s;      
    }
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+
                " is waiting for permit");
   try {
          semaphore.acquire();
          System.out.println(Thread.currentThread().getName()+
                       " has got permit");
   
          for(int i=0;i<5;i++){
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+
                              " > ");
          }
          
   } catch (InterruptedException e) {
          e.printStackTrace();
   }
   
   System.out.println(Thread.currentThread().getName()+
                " has released permit");
   semaphore.release();
		
	}
	
}
public class SemaphoreExample {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(2);
		MyThread th1= new MyThread(semaphore);
		th1.start();
		MyThread th2= new MyThread(semaphore);
		th2.start();
		

	}

}
