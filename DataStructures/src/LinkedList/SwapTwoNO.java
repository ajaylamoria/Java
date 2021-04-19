package LinkedList;

public class SwapTwoNO {

	 public static LinkedList.Node swapPairs(LinkedList.Node head) {
		 LinkedList.Node dummy;
		 int temp;
	        
		 LinkedList.Node node = head;
	       while(node!=null){
	    	   while(node!=null) {
	    		   
	    	   }
	           dummy = node.next.next;
	           node.next.next = null;
	           
	           temp = node.data;
	           node.data = node.next.data;
	           node.next.data = temp;
	           temp = 0;
	           node.next.next = dummy;
	           dummy = null;
	           node = node.next.next;
	           
	       }
	        
	        return head;
	    } 
	 
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.show(list.head);
		System.out.println("Swap;"+swapPairs(list.head));

	}

}
