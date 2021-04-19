package String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		boolean flag= false;
		String s= "anagram";
		String t= "nagaram";
		char srr[] = s.toCharArray();
		char trr[] = t.toCharArray();
        Arrays.sort(srr);
        Arrays.sort(trr);
        String k = srr.toString();
        String m = trr.toString();
        if(k.length()!=m.length()){
            //return flag;
            flag= false;
         }
       else if(k.equals(m)){
            flag= true;
           // return flag;
        }
      //  return flag;

	}

}
