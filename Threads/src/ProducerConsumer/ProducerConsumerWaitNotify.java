package ProducerConsumer;

import java.util.LinkedList;
import java.util.List;

class Producer extends Thread {

	private List<Integer> sharedQueue;
	private final int MAX_SIZE = 2;
	
	public Producer(List<Integer> sharedQueue){
		this.sharedQueue = sharedQueue;
	}
	
	@Override
	public void run() {
		
		for(int i= 1 ;i<=10;i++){
			
			try {
				produce(i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	public void produce(int i) throws InterruptedException{
		
		synchronized(this.sharedQueue){
			if(this.sharedQueue.size()== MAX_SIZE){
				System.out.println("Queue is Full ,Producer waits for Consumer to consume the product" +this.sharedQueue.size());
				this.sharedQueue.wait();
			}
			else{
				Thread.sleep(1000);
				this.sharedQueue.add(i);
				System.out.println("Produced :-"+i);
				this.sharedQueue.notify();
			}
		}
	}
	
}

class Consumer extends Thread{
	private List<Integer> sharedQueue;
	
	public Consumer(List<Integer> sharedQueue){
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for(int i= 1 ;i<=10;i++){
			try {
				consume();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	public void consume() throws InterruptedException{
		
		synchronized(this.sharedQueue){
			if(this.sharedQueue.size()==0){
				System.out.println("Queue is Empty , Consumer is waiting for Producer to produce");
				this.sharedQueue.wait();
			}
			else{
				Thread.sleep(1000);
				
				System.out.println("Consumed:-"+this.sharedQueue.remove(0));
				this.sharedQueue.notify();
			}
			
		}
		
	}
	
}
public class ProducerConsumerWaitNotify {

	public static void main(String[] args) {
		List<Integer> sharedQueue = new LinkedList<>();
		Producer produce = new Producer(sharedQueue);
		Consumer consume = new Consumer(sharedQueue);

		Thread thread = new Thread(produce,"Thread 1");
		Thread thread2 = new Thread(consume,"Thread 2");
		thread.start();
		thread2.start();
	}

}
