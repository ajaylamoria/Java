package Array;

public class RemoveFromArray {

	static int remove(int arr[], int n) 
    { 
        if (n == 0 || n == 1) 
            return n; 
       
        // To store index of next unique element 
        int j = 0; 
       
        // Doing same as done in Method 1 
        // Just maintaining another updated index i.e. j 
        for (int i = 0; i < arr.length; i++) 
            if (arr[i] != n) {
            	 arr[j++] = arr[i]; 	
            } 
               
       
       // arr[j++] = arr[n-1]; 
       
        return j; 
    } 
	
	public static void main(String[] args) {
		int arr[] = {1,4,7,9,7}; 
        int n = 7;
          
        n = remove(arr, n); 
   
        // Print updated array 
        for (int i=0; i<n; i++) 
           System.out.print(arr[i]+" "); 

	}

}
