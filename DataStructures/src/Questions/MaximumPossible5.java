package Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumPossible5 {

	private static int solution(int N) {
        int flag = N >= 0 ? 1 : -1;
        N = Math.abs(N);
        String numStr = N + "";
        String[] numarr = numStr.split("");
        ArrayList<String> result = new ArrayList<>();
        boolean inserted = false;

        for (String tmpStr : numarr) {
            int tmp = Integer.parseInt(tmpStr);
            inserted = flag == 1 ? tmp < 5 : tmp > 5;
            if(inserted){
                result.add(50 + tmp + "");
                break;
            }
            result.add(tmpStr);
        }

        result.addAll(Arrays.asList(numarr).subList(result.size(), numarr.length));
        if (!inserted) result.add("5");
        return flag * Integer.parseInt(String.join("", result));
    }
	
	public static void main(String[] args) {
		System.out.println(solution(0));
		
		int [] arr = new int [] {1,-5,-2,3};  
        //Initialize min with first element of array.  
        int min = 0;  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with min  
           if(min >arr[i])  
               min = arr[i];  
        }  
        System.out.println("Smallest element present in given array: " + min);  
    }  

	

}
