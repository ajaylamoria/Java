package Functional_Interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {

	
	public static void main(String[] args) {
		  String[] str={"ad","aa","ab","as"};
		
//1. Compare Using Local Class
		class StringSort implements Comparator<String>{

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		}
		Arrays.sort(str, new StringSort());
		
		
//2. Sort Using Anonymous Inner Class
		
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		});
		
//3. Sort Using Lambda Expression 
		
		Arrays.sort(str,(String o1,String o2) ->{ 
			return o1.compareTo(o2);
		}
	  );
		
// More Simplified 
		Arrays.sort(str ,(a,b)-> a.compareTo(b));
		
		

	}

}
