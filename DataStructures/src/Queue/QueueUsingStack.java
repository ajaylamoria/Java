package Queue;

import java.util.Iterator;
import java.util.Stack;

public class QueueUsingStack {

	private Stack<Integer> s1; 
	private Stack<Integer> s2;
	
	public QueueUsingStack(){
		s1= new Stack<>();
		s2 = new Stack<>();
	
	}
	
	public void enQueue(int val){
		if(s1.isEmpty()){
			s1.push(val);
		}else{
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
			s1.push(val);
			
			while(!s2.isEmpty()){
				s1.push(s2.pop());
			}
			
		}
	}
	
	public void show(){
		Iterator<Integer> itr = s1.iterator();
		while(itr.hasNext()){
			System.out.print(" "+itr.next());
		}
		System.out.println();
	}
	public int deQueue(){
		if(s1.isEmpty()){
			System.out.println("Queue is Empty");
		}
		int x = s1.peek();
		s1.pop();
		
		return x;
	}
	
	public static void main(String[] args) {
		QueueUsingStack queue = new QueueUsingStack();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.show();
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}
}
