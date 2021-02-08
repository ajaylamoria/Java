package Tree;
import java.util.*;
public class PathSum2 {

	public static void preOrder(List<List<Integer>> paths,List<Integer> path,TreeNode root, int sum){
		if(root==null){
			return;
		}
		sum = sum-root.val;
		path.add(root.val);
		if(root.right==null && root.left==null && sum==0){
			paths.add(path);
			
		}
		preOrder(paths, new ArrayList<>(path), root.left, sum);
		preOrder(paths, new ArrayList<>(path), root.right, sum);
	}
	
	 public static List<List<Integer>> pathSum(TreeNode root, int sum) {
	        List<List<Integer>> paths = new ArrayList<>();
	        List<Integer> path = new ArrayList<>();
	        
	        if(root==null){
	        	return paths;
	        }
	        
	        preOrder(paths, path, root, sum);
	        return paths;
	        
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
			List<List<Integer>> paths = pathSum(tree.root, 8);
			System.out.println(paths);

	}

}
