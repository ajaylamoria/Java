package Tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PathSum3 {
	public static int  sum3;
	public static void preOrder(List<List<Integer>> paths,List<Integer> path,TreeNode root, int sum,int inc, int arr[]){
		if(root==null){
			return;
		}
		/* if(root.val<=sum){
			 sum = sum-root.val;
			path.add(root.val);
	        }*/
		
		arr[inc]=root.val;
		//path.add(root.val);
		inc++;
		if(root.left==null && root.right==null){
		//	paths.add(new ArrayList<>(path));
			paths =addArray(arr,paths,inc);
			//path.clear();
			//path.remove(inc-1);
			
			
		}
		
		preOrder(paths, path, root.left, sum,inc,arr);
		preOrder(paths,path, root.right, sum,inc,arr);
	}
	
	 private static List<List<Integer>> addArray(int[] arr, List<List<Integer>> paths, int inc) {
		 List<Integer> list = new ArrayList<>();
		for(int i =0;i<inc;i++){
			list.add(arr[i]);
		}
		paths.add(new ArrayList<>(list));
		list.clear();
		return paths;
	}

	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
		 
	        List<List<Integer>> paths = new ArrayList<>();
	        List<Integer> path = new ArrayList<>();
	        int arr[] = new int[1000];
	        int inc = 0;
	        if(root==null){
	        	return paths;
	        }
	      
	        preOrder(paths, path, root, sum,inc,arr);
	        getPath(paths,sum);
	        return paths;
	        
	    }
	private static void getPath(List<List<Integer>> paths, int sum) {
		int counter=0;
		for(int i=0;i<paths.size();i++){
			
			for(int j=0;j<paths.get(i).size();j++){
				 if(paths.get(i).get(j)<=sum){
					sum = sum- paths.get(i).get(j);
				 }
				 if(sum == 0){
					 counter++;
				 }
				
			}
			sum =sum3;
		}
		System.out.println("The count is "+counter);
		
	}

	public static void main(String[] args) {
		 BinaryTree tree = new BinaryTree();
			
			tree.root = new TreeNode(10);
			tree.root.left = new TreeNode(5);
			tree.root.left.left = new TreeNode(3);
			tree.root.left.right = new TreeNode(2);
			tree.root.left.right.right = new TreeNode(1);
			tree.root.left.left.left = new TreeNode(3);
			
			tree.root.left.left.right = new TreeNode(-2);
			tree.root.right = new TreeNode(-3);
			
			tree.root.right.right = new TreeNode(11);
			
			sum3=8;
			List<List<Integer>> paths = pathSum(tree.root, sum3);
			System.out.println(paths);

	}
}
