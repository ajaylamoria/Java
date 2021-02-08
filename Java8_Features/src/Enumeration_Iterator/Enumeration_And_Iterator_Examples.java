package Enumeration_Iterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Enumeration_And_Iterator_Examples {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(50);
		
		Enumeration<Integer> enu = v.elements();
		while(enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}
		System.out.println();	
		
	List<Integer> li = new ArrayList<Integer>();
	li.add(30);
	li.add(50);
	li.add(60);
	li.add(80);
	
	Iterator<Integer> it = li.iterator();
	while(it.hasNext()){
		Integer i = it.next();
		it.remove();
		System.out.println(i);
	}

	}

}
