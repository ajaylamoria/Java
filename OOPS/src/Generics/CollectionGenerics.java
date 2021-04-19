package Generics;

import java.util.ArrayList;
import java.util.List;

public class CollectionGenerics {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add("Ajay");
		
		System.out.println(list.get(1));
		
		String obj =  (String) list.get(1);  // Explicitly cast
		
		

	}

}
