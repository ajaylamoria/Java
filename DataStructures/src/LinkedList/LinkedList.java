package LinkedList;

public class LinkedList {

	public Node head;
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
		}
	}
	
	public void addAtFirst(int data){
		
		Node new_node = new Node(data);
		
		if(head==null){
		   head = new_node;	
		}else{
			
			new_node.next = head;
			head = new_node;
		}
		
	}
	
	public void add(int data){
		Node new_node = new Node(data);
		Node n = head;
		if(n==null){
			head = new_node;
		}else{
			while(n.next!=null){
				n = n.next;
			}
			n.next = new_node;
		}
		
	}
	
	public void addAfter(int prev_data , int data){
		Node prev_node = new Node(prev_data);
		Node n = head;
		Node new_node = new Node(data);
		while(n.next!=null){
			if(n.data==prev_node.data){
				Node temp = n.next;
				n.next = new_node;
				new_node.next = temp;
			}
			n = n.next;
		}
		
	}
	
	public void getElement(int data){
		Node node = new Node(data);
		Node n = head;
		while(n.next!=null){
			if(n.data==node.data){
				
			}
		}
	}
	public void addAtLast(int data){
		Node new_node = new Node(data);
		
		if(head==null){
			head = new_node;
		}else{
			Node node = head;
			while(node.next!=null){
				node = node.next;
			}
			node.next = new_node;
		}
		
		
	}
	
	public int size(){
		int size = 0;
		Node node = head;
		if(node==null){
			return size;
		}
		else{
			while(node!=null){
				size++;
				node = node.next;
			}
			return size;
		}
	}
	
	public void show(Node n){
		while(n!=null){
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
	public void display(){
		Node node = head;
		while(node!=null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	
	public void deleteAtFirst(){
		Node node= head;
		head = node.next;
		node = null;
		this.display();
	}
	
	
	public void deleteAnyNode(int data){
	   Node node = new Node(data);
	   if(head.data == node.data){
		   System.out.println();
		   this.deleteAtFirst();
	   }
	   else{
		   Node n = head;
		   Node prev = null;
		   while(n.next!=null){
			   if(n.data == node.data){
				   prev.next = n.next;
				  
			   }
			   
			   prev = n;
			   n = n.next;
		   }
		   System.out.println();
		   this.display();
	   }
	   
	}
	
	public void deleteAtLast(){
		Node n = head;
		while(n.next!=null){
			n = n.next;
		}
		n = null;
		System.out.println();
		this.display();
	}
	
	public int search(int data){
		Node no = new Node(data);
		Node n = head;
		while(n.next!=null){
			if(n.data==no.data){
				return no.data;
			}
			n = n.next;
		}
		return 0;
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addAtFirst(10);
		list.addAtLast(20);
		list.addAtLast(30);
		
		list.addAfter(10, 15);
		list.addAfter(15, 18);
		System.out.println(list.size());
		list.deleteAtFirst();
		
		list.addAtFirst(10);
		list.deleteAnyNode(18);
		
		list.deleteAnyNode(10);
		list.deleteAtLast();
		System.out.println();
		System.out.println(list.search(55));
		//list.display();
	}
}
