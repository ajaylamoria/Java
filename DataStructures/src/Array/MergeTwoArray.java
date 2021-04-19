package Array;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		 int ar1[]= {3,5,6,7,1};
		 int ar2[]= {5,4,8,0,2};
		 
		 Arrays.sort(ar1);
		 Arrays.sort(ar2);
	
		 System.out.println(ar1);
		 
		 int ar3[]= new int[ar1.length+ar2.length];
		 //ar3.length = ar1.length+ar2.length;
		 int i=0,j=0,k=0;
		 while(i<ar1.length || j<ar2.length) {
			 if(i<ar1.length && j<ar2.length) {
				 if(ar1[i]<=ar2[j]) {
					 ar3[k] = ar1[i];
					 k++;
					 i++;
				 }else if(ar2[j]<=ar2[i]) {
					 ar3[k]=ar2[j];
					 k++;
					 j++;
				 }
			 }else {
				 if(i<ar1.length) {
					 ar3[k] = ar1[i];
					 k++;
					 i++;
				 }else if(j<ar2.length) {
					 ar3[k]=ar2[j];
					 k++;
					 j++;
				 } 
			 }
			 
		 }
		 
		 for(int res:ar3) {
			 System.out.println(res);
		 }

	}

}
