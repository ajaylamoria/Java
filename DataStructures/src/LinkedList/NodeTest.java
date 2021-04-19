package LinkedList;

class Node {
	int data;
	Node next;

	public Node() {

	}

	public Node(int data) {
		this.data = data;
	}
	public Node(int data,Node n) {
		this.data = data;
		this.next = n;
	}
}

public class NodeTest {

	public static void main(String[] args) {
		Node n = new Node(10);
		n.next = new Node(20);
		n.next.next = new Node(30);
		Node head = n;
		while(n!=null) {
			System.out.print(" "+n.data);
			n = n.next;
		}
		
      CheckPair(head);
	}
	
	public static Node CheckPair(Node n) {
		Node temp = new Node();
		Node current = n;
		Node nextNode = n.next;
		while(current!=null) {
			temp = nextNode;
			nextNode = current;
			nextNode.next = temp.next;
			current.data = temp.data;
			current.next = nextNode;
			
			
		}
		
		
		return n;
	}

}
