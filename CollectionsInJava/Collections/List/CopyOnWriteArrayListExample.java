package List;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

	public static void main(String[] args) {
		List<Integer> list= new CopyOnWriteArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		for(Integer i:list){
			 System.out.print(list);
			list.add(50);
			 System.out.print(list);
		}
		System.out.println();
     System.out.println(list);
	}

}
