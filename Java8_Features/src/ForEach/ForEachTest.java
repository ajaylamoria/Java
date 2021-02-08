package ForEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachTest {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList();
         li.add("Ajay");
         li.add("Amit");
         li.forEach(str ->{System.out.println(str);});
         
         Map<Integer,String> map = new HashMap();
         map.put(10, "Ajay");
         
         map.forEach((key,value)->{System.out.println(key+" "+value);});
	}

}
