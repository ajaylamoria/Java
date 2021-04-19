package ForEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ForEachTest {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList();
         li.add("Ajay");
         li.add("Amit");
         li.forEach(str ->{System.out.println(str);});
         
         Map<Integer,String> map = new HashMap();
         map.put(10, "Ajay");
         
         Iterator<Entry<Integer,String>> itr =  map.entrySet().iterator();
         
         while(itr.hasNext()) {
        	 System.out.println(itr.next());
         }
         
        // map.forEach((key,value)->{System.out.println(key+" "+value);});
	}

}
