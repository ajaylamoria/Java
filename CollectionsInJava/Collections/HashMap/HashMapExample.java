package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer ,String> map = new HashMap<Integer,String>();
		
	map.put(null,"10");
		System.out.println(map.get(10));
		/*Map<Integer ,Student> map = new HashMap<Integer,Student>();
        Student s1= new Student(10, "AJay",100);
        Student s2= new Student(40, "Rajiv",300);
        Student s3= new Student(30, "Amit",500);
        
        map.put(2, s1);
        map.put(2, s2);
        map.put(3, s3);
        Iterator<Entry<Integer,Student>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
        	Entry<Integer,Student> ent= (Entry<Integer, Student>) itr.next();
        	Integer key = ent.getKey();
        	Student s = ent.getValue();
        	
        	System.out.println(key+" "+s.getId()+" "+s.getName());
        }
       // System.out.println(map);
	}
*/
		
		Integer ar[]={1,2,2,4,2,4,3,1,4,4,2,2};
		Map<Integer,Integer> hm = new HashMap<>();
		int degree =0;
		for(int i= 0;i<ar.length;i++){
			int count=0;
			if(hm.containsKey(ar[i])){
				hm.put(ar[i], hm.get(ar[i])+1);
			}
			else{
				hm.put(ar[i], count+1);
			}
			
			if(hm.get(ar[i]) > degree){
				degree = hm.get(ar[i]);
			}
			
			
		}
		
		System.out.println(degree);
		
		Iterator<Entry<Integer,Integer>> it = hm.entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		/*Map<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(null, null);
		hm.put(10, null);
		Iterator<Entry<Integer,String>> it = hm.entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
	}
}
