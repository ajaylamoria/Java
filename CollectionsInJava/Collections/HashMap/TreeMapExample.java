package HashMap;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Student, Integer> tree_map 
        = new TreeMap<Student, Integer>(new StudentCompare()); 
    
		tree_map.put(new Student(10, "Ajay",500),10);
		tree_map.put(new Student(20, "Rajiv",300),20);
		tree_map.put(new Student(40, "DJ",100),0);
		
		Iterator<Entry<Student,Integer>> itr = tree_map.entrySet().iterator();
		while(itr.hasNext()){
			Entry<Student,Integer> ent = itr.next();
			Student s= ent.getKey();
			Integer val = ent.getValue();
			System.out.println(s.getName()+" "+val);
		}
	}
	
	

}
