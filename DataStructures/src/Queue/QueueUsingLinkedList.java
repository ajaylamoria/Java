package Queue;

class Node{
	 int data;
	 Node next;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
	
}

class Queue{
	
	 Node front;
	 Node rear;
	
	public Queue(){
		this.front= this.rear = null;
	}
	
	public void enQueue(int data){
		Node node = new Node(data);
		if(this.rear==null){
			this.front = this.rear = node;
		}else{
			this.rear.next = node;
			this.rear = this.rear.next;
		}
		
	}
	
	public int deQueue(){
		if(this.front==null){
			System.out.println("Queue is Empty");
			return 0; 
		}else{
			int data = this.front.data;
			this.front = this.front.next;
			return data;
		}
	}
	
	public void show(){
		
	}
}
public class QueueUsingLinkedList {
    public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		System.out.println(queue.rear.data);
		System.out.println(queue.deQueue());
	}
}
