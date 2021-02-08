package ThreadPool;

import java.util.LinkedList;
import java.util.List;

public class LinkedBlockingQueue<E> implements BlockingQueue<E> {

	private List<E> queue;
	private int maxSize;
	private static int size;
	
	
	public LinkedBlockingQueue(int maxSize){
		this.maxSize = maxSize;
		this.queue = new LinkedList<E>();
	}
	

	/**
     * Inserts the specified element into this queue
     * only if space is available else
     * waits for space to become available.
     * After inserting element it notifies all waiting threads.
     */
	
	@Override
	public synchronized void put(E item) throws InterruptedException {
		
		 //check space is available or not.
		if(queue.size()==this.maxSize){
			System.out.println("Put::Queue is Full ,waiting for empty ");
			this.wait();
		}else{
			
			 //space is available, insert element and notify all waiting threads.
			queue.add(item);
			System.out.println("Put::Item Added and Notify:- "+item);
			this.size = this.size+1;
			this.notifyAll();
		}
		
	}

	@Override
	public synchronized E take() throws InterruptedException {
		E returnobj = null;
		 //waits element is available or not.
		if(queue.size()==0){
			System.out.println("Take::Queue is Empty , waiting to add Item");
			this.wait();
		}
		returnobj = queue.remove(0);    // remove element from head of queue.
		this.size = this.size -1;
		//element is available, remove element and notify all waiting threads.
           System.out.println("Take::Wait Over and now ready to get Item :-" +returnobj);
		    this.notifyAll();
			return returnobj;
	
		
	}
	
	public int size(){
		return this.size;
	}

	
}
