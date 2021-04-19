package HashMap;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
		SortedMap<Integer, String> sm = 
                new TreeMap<Integer, String>(); 
    sm.put(new Integer(2), "practice"); 
    sm.put(new Integer(3), "quiz"); 
    sm.put(new Integer(5), "code"); 
    sm.put(new Integer(4), "contribute"); 
    sm.put(new Integer(1), "geeksforgeeks"); 
    sm.put(new Integer(8), null);
    
    System.out.println(sm.subMap(2, 5));
    System.out.println(sm.headMap(3));
    System.out.println(sm.tailMap(4));
    System.out.println(sm.firstKey());
    Iterator<Entry<Integer,String>> itr = sm.entrySet().iterator();
    while(itr.hasNext()){
    	Entry<Integer,String> ent = itr.next();
    	Integer key = ent.getKey();
    	String value = ent.getValue();
    	System.out.println(key+" "+value);
    }

	}

}
