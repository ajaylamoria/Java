package LinkedList;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		LinkedList listA = new LinkedList();
		listA.add(1);
		listA.add(2);
		//listA.add(3);
		listA.add(4);
		listA.display();
		LinkedList listB = new LinkedList();
		listB.add(1);
		listB.add(3);
	//	listB.add(5);
		//listB.add(6);
		listB.add(4);
		System.out.println();
		listB.display();
		LinkedList listC =mergeList(listA, listB);
		System.out.println();
		listC.display();


	}
	
	
	public static LinkedList mergeList(LinkedList A ,LinkedList B){
		
		LinkedList C = new LinkedList();
		
		LinkedList.NodeTest a1 = A.head;
		LinkedList.NodeTest b1 = B.head;
	
		
		while(true){
			if(a1==null){
				C.add(b1.data);
				if(b1.next==null){
					break;
				}else{
					b1=b1.next;
				}
				
			}
			if(b1 == null){
				C.add(a1.data);
				if(a1.next==null){
				break;
				}else{
					b1=b1.next;
				}
			}
			if(a1!=null && b1!=null){
			if(a1.data <= b1.data){
				C.add(a1.data);
				a1 = a1.next;
			}else{
				C.add(b1.data);
				b1 = b1.next;
			}
			}
			//c1 = c1.next;
		}
			
		return C;
	}

}
