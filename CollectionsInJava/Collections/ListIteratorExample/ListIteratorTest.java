package ListIteratorExample;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		 ArrayList al = new ArrayList(); 
	        for (int i = 0; i < 10; i++) 
	            al.add(i); 
	  
	        System.out.println(al); 
	  
	        // at beginning ltr(cursor) will point to 
	        // index just before the first element in al 
	        ListIterator ltr = al.listIterator(); 
	        
	        // checking the next element availabilty 
	        while (ltr.hasNext()) 
	        { 
	            //  moving cursor to next element 
	            int i = (Integer)ltr.next(); 
	           
	            if(i>5){
	            	 ltr.remove();
	            }
	  
	            // getting even elements one by one 
	            //System.out.print(i + " "); 
	  
	            
	            } 
	        System.out.println(); 
	        System.out.println(al); 
	        while(ltr.hasPrevious()){
	        	int i = (int) ltr.previous();
	        	System.out.print(i + " "); 
	        }
	        } 
	       

	

}
