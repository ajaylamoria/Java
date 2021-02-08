package Questions;

class MyThread  extends Thread {
	 
    @Override
    public void run() {
           System.out.println("in run() method "+ Thread.currentThread().getName());
    }
    
   
    
}


public class OverrideStartMethod {
    public static void main(String[] args) {
           System.out.println("main has started.");
           
           MyThread  thread1=new MyThread ();
          //thread1.start();
           thread1.run();
           
           System.out.println("main has ended.");
    }
 
}