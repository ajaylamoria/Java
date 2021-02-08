package ReEntrantLocks;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockGetQueuedThreadTest {
    public static void main(String[] args) {
 
           ReentrantLock lock=new ReentrantLock();
           MyRunnable3 myRunnable=new MyRunnable3(lock);
           new Thread(myRunnable,"Thread-1").start();
           new Thread(myRunnable,"Thread-2").start();
           new Thread(myRunnable,"Thread-3").start();
           
    }
}
 


 
class MyRunnable3 implements Runnable{
    
    ReentrantLock lock;
    public MyRunnable3(ReentrantLock lock) { 
           this.lock=lock;
    }
    
    public void run(){
           
           System.out.println(Thread.currentThread().getName()
                        +" is Waiting to acquire lock");
           
           lock.lock();
 
           System.out.println(Thread.currentThread().getName()
                        +" has acquired lock.");
           
           try {
                  Thread.sleep(2000);
           } catch (InterruptedException e) {
                  e.printStackTrace();
           }
 
 
           System.out.println(">>>>--- getQueueLength = "+lock.getQueueLength()+"---<<<<");
           
           System.out.println(Thread.currentThread().getName()
                        +" has released lock.");
           
           lock.unlock();    //read explanation for 5sec
    }
}
