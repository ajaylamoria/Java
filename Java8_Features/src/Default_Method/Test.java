package Default_Method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {
static int MAX_CHAR = 26; 
    
    // function to return true if strings have  
    // common substring and no if strings have 
    // no common substring 
    static void twoStrings(List<String> list1, List<String> list2)  
    { 
    	
    	boolean result;
    	Iterator<String> it1 = list1.iterator();
    	Iterator<String> it2 = list2.iterator();

    	while (it1.hasNext() && it2.hasNext()) {
    		 System.out.println(compareTwoStrings(it1.next(), it2.next()));
    	}
    	      
    } 
    
    public static boolean compareTwoStrings(String s1 , String s2){
    	

    	//String s2 = getString(list2);
        // vector for storing character occurrences 
        boolean v[]=new boolean[MAX_CHAR]; 
        Arrays.fill(v,false); 
      
        // increment vector index for every 
        // character of str1 
        for (int i = 0; i < s1.length(); i++) 
            v[s1.charAt(i) - 'a'] = true; 
          
        // checking common substring of str2 in str1 
        for (int i = 0; i < s2.length(); i++)  
            if (v[s2.charAt(i) - 'a'])  
            return true; 
          
        return false;
    }
    
    public  static String getString(List<String> list){
    	String s1 = null;
    	Iterator<String> itr = list.iterator();
    			while(itr.hasNext()){
    				s1 = itr.next();
    			}
    	return s1;
    }
      
    // Driver code 
    public static void main (String[] args)  
    { 
        String str1 = "ab"; 
        String str2 = "rt"; 
        List<String> list1 = new ArrayList<>();
        list1.add("ab");
        list1.add("cd");
        list1.add("ef");
        List<String> list2 = new ArrayList<>();
        list2.add("af");
        list2.add("ee");
        list2.add("ef");
        twoStrings(list1,list2);
       
    } 
}
