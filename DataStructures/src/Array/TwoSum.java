package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class TwoSum {

	public static int[] twoSum(int[] ar,int target) {
		
		Map<Integer,Integer> map = new HashMap();
		
		for(int i =0;i<ar.length;i++) {
			int diff = target-ar[i];
			if(map.containsKey(diff)) {
				return new int[] {map.get(diff),i};
			}else {
				map.put(ar[i], i);
			}
		}
		throw new IllegalArgumentException("No two sum solution");
		
	}
	
	public static void main(String[] args) {
		int ar[] = new int[] {3,2,4};
		int[] res =twoSum(ar, 6);
		for(int i :res) {
			System.out.print(" "+i);
		}

	}

}
