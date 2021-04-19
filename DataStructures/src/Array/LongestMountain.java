package Array;

public class LongestMountain {
	public static int longestMountain(int[] A) {
	       if(A.length < 3) return 0;
	        int longest = 0, current = 1;
	        boolean increasingFound = false, decreasingFound = false;
	        
	        for(int i = 1; i < A.length; i++) {
	            if(A[i] == A[i - 1]) {
	              current = 1;
	              increasingFound = false;
	              decreasingFound = false;
	            } else if(A[i] > A[i - 1] && !decreasingFound) {
	                current++;
	                increasingFound = true;
	            } else if(A[i] > A[i - 1] && decreasingFound) {
	                current = 2;
	                increasingFound = true;
	                decreasingFound = false;
	            } else if (A[i] < A[i - 1] && increasingFound) {
	                current++;
	                decreasingFound = true;
	                if(current >= 3) longest = Math.max(longest, current);
	            } else if (A[i] < A[i - 1] && !increasingFound) {
	                current = 1;
	                decreasingFound = false;
	                increasingFound = false;
	            }
	        }
	        
	        return longest; 
	    }
	public static void main(String[] args) {
		

	}

}
