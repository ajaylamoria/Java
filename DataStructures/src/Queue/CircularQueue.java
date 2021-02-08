package Queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CircularQueue {

	private List<Integer> queue;
	private int size;
	private int front;
	private int rear;
	
	public CircularQueue(int size){
		this.queue = new ArrayList<>(size);
		this.front=this.rear = 0;
		this.size = size;
	}
	
	public void enQueue(int data){
		
		if(this.rear==size-1){
			System.out.println("Queue is Full");
		}else{
			this.queue.add(data);
			this.rear = this.rear+1;
		}
	}
	
	public void deQueue(){
		if(this.rear==0){
			System.out.println("Queue is Empty");
		}else{
			this.queue.remove(front);
			this.front = this.front+1;
		}
	}
	
	public void display(){
		Iterator<Integer> itr = this.queue.iterator();
		while(itr.hasNext()){
			System.out.print(" "+itr.next());
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		CircularQueue queue = new CircularQueue(5);
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		queue.enQueue(60);
		queue.display();
		queue.deQueue();
		queue.enQueue(50);
		queue.display();
	}
}
