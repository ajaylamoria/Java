package HashMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

	public static void main(String[] args) {
		NavigableMap<String, Integer> nm = 
                new TreeMap<String, Integer>(); 
nm.put("C", 888); 
nm.put("Y", 999); 
nm.put("A", 444); 
nm.put("T", 555); 
nm.put("B", 666); 
nm.put("A", 555); 

System.out.println(nm.floorEntry("M"));
System.out.println(nm.ceilingEntry("M"));
System.out.println(nm.higherEntry("M"));
System.out.println("Original Map ::"+nm);
System.out.println("Reverse Map ::"+nm.descendingMap());

	}

}
