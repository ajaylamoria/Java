package ReEntrantLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTryLockTest {
    public static void main(String[] args) {
 
           Lock lock=new ReentrantLock();
           MyRunnablee myRunnable=new MyRunnablee(lock);
           new Thread(myRunnable,"Thread-1").start();
           new Thread(myRunnable,"Thread-2").start();
           
    }
}
 


 
class MyRunnablee implements Runnable{
    
    Lock lock;
    public MyRunnablee(Lock lock) { 
           this.lock=lock;
    }
    
    public void run(){
           
           System.out.println(Thread.currentThread().getName()
                        +" is Waiting to acquire lock");
           int count=0;
           while(lock.tryLock() && count==0){
                  System.out.println(Thread.currentThread().getName()
                               +" has acquired lock.");
                  try {
                        Thread.sleep(1000);
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
                  System.out.println(Thread.currentThread().getName()
                          +" has Unlock.");
                  lock.unlock();
                  count++;
                  
           }
           /*else{
                  System.out.println(Thread.currentThread().getName()
                               +" didn't got lock.");
                  
           }*/
 
    }
}
