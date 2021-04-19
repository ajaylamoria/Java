package LinkedList;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(10);
		list.show(list.head);
		System.out.println(list.head.data);
		LinkedList listOld = new LinkedList();
		LinkedList.NodeTest n = list.head;
		while(n!=null){
			listOld.add(n.data);
			n = n.next;
		}
		
		LinkedList.NodeTest prev= null;
		LinkedList.NodeTest current = list.head;
		LinkedList.NodeTest next =null;
		
		while(current!=null){
			next = current.next;
			current.next = prev;   // Arrow changes here
			prev = current;
			current = next;
		}
		System.out.println();
		list.show(prev);
		boolean flag = true;
		LinkedList.NodeTest oldhead = listOld.head;
		while(oldhead!=null && prev!=null){
			if(oldhead.data!=prev.data){
				flag= false;
			}
			oldhead = oldhead.next;
			prev = prev.next;
		}
		if(flag){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}

	}

}
