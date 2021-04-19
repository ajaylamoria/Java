package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	 public static List<List<Integer>> threeSum(int[] nums) {
	        Arrays.sort(nums);
	        List<List<Integer>> res = new ArrayList<>();
	        for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
	            if (i == 0 || nums[i - 1] != nums[i]) {
	                twoSum(nums, i, res);
	            }
	        return res;
	    }
	  public static  void twoSum(int[] nums, int i, List<List<Integer>> res) {
	        Set<Integer> seen = new HashSet<Integer>();
	        for (int j = i + 1; j < nums.length; ++j) {
	            int complement = -nums[i] - nums[j];
	            if (seen.contains(complement)) {
	                res.add(Arrays.asList(nums[i], nums[j], complement));
	                while (j + 1 < nums.length && nums[j] == nums[j + 1])
	                    ++j;
	            }
	            seen.add(nums[j]);
	        }
	    }
	public static void main(String[] args) {
		int ar[] = new int[] {-1,0,1,2,-1,-4};
		System.out.println(threeSum(ar));

	}

}
