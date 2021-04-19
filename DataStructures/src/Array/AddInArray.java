package Array;

public class AddInArray {

	public static void main(String[] args) {
		int ar[] = new int[] {2,5,6};
		printResult(addLast(8, ar));
		printResult(addAfterIndex(7,2, ar));
		
		
		

	}
	
	public static void printResult(int ar[]) {
		for(int i:ar) {
			System.out.print(" "+i);
		}
	}
	
	public static int[] addLast(int ele,int ar[]) {
		
		int newArr[] = new int[ar.length+1];
		for(int i=0;i<ar.length;i++) {
			newArr[i] =ar[i];
		}
		//newArr = ar;
		newArr[newArr.length-1]=ele;
		return newArr;
	}
	
public static int[] addAfterIndex(int ele, int index,int ar[]) {
		
		int newArr[] = new int[ar.length+1];
		for(int i=0;i<ar.length;i++) {
			if(i==index) {
				newArr[i] = ar[i];
				newArr[i+1]= ele;
			}else {
				newArr[i] =ar[i];
			}
			
		}
		
		return newArr;
	}

}
