package VolatileAndSynchronised;


class VolatileData{
	private int counter = 0;
	
	public int getCounter(){
		return counter;
	}
	
	public void incrementCounter(){
		++counter;
	}
}

class MyThread extends Thread{
	VolatileData data;
	
	public MyThread(VolatileData d){
		this.data = d;
	}
	
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName()+"::"+this.data.getCounter());
		
		try{
			//Thread.sleep(5000);
			for(int i=0;i<=5;i++){
				this.data.incrementCounter();
			}
			
		}catch(Exception e){
			
		}
		System.out.println(Thread.currentThread().getName()+":After Increment"+this.data.getCounter());
	}
}

class MyThread2 extends Thread{
	VolatileData data;
	
	public MyThread2(VolatileData d){
		this.data = d;
	}
	
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName()+"::"+this.data.getCounter());
		
		try{
			//Thread.sleep(5000);
			for(int i=0;i<=5;i++){
				this.data.incrementCounter();
			}
		}catch(Exception e){
			
		}
		System.out.println(Thread.currentThread().getName()+":After Increment"+this.data.getCounter());
	}
}
public class VolatileTestwithoutVolatile {

	public static void main(String[] args) {
		VolatileData obj = new VolatileData();
		MyThread th1 = new MyThread(obj);
		MyThread2 th2 = new MyThread2(obj);
		th1.start();
		th2.start();

	}

}
