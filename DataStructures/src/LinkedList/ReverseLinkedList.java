package LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(10);
		list.show(list.head);
		System.out.println(removeElements(list.head,20));
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
		
	}
	
	public static LinkedList.NodeTest removeElements(LinkedList.NodeTest head, int val) {
		LinkedList.NodeTest node = head;
        
		LinkedList.NodeTest prev = null;
        
        while(node!=null){
            if(val==head.data){
                head = node.next;
                node = node.next;
               
                
            }else if(val==node.data){
                    prev.next = node.next;
                    prev = prev.next; 
                    node = node.next;
                }
            else {
            	 prev = node; 
                 node = node.next;
            }
            
            
        }
        return node;
    }
}
 