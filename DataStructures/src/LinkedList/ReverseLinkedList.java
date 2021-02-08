package LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(10);
		list.show(list.head);
		System.out.println(list.head.data);
		LinkedList listOld = new LinkedList();
		LinkedList.Node n = list.head;
		while(n!=null){
			listOld.add(n.data);
			n = n.next;
		}
		
		LinkedList.Node prev= null;
		LinkedList.Node current = list.head;
		LinkedList.Node next =null;
		
		while(current!=null){
			next = current.next;
			current.next = prev;   // Arrow changes here
			prev = current;
			current = next;
		}
		System.out.println();
		list.show(prev);
		
	}
}
 