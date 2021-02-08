package Tree;

import java.util.ArrayList;
import java.util.List;

public class LeafNode {
	  public  static List<Integer> list = new ArrayList();
		public static void leafNode(TreeNode root){
	      
	        if(root==null){
	        	return;
	        }
	        if(root.left==null && root.right==null){
	            list.add(root.val);
	        }
	        leafNode(root.left);
	        leafNode(root.right);
	        
	       
	    }
	    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
	        leafNode(root1);
	        List<Integer> list1 =list;
	        list = new ArrayList<>();
	         leafNode(root2);
	        List<Integer> list2 =list;
	        if(list1.equals(list2)){
	            return true;
	        }else{
	            return false;
	        }
	    }
	
	public static void main(String[] args) {
		 BinaryTree tree = new BinaryTree();
		 tree.root = new TreeNode(1);
		 BinaryTree tree2 = new BinaryTree();
		 tree2.root = new TreeNode(2);
		 System.out.println(leafSimilar(tree.root,tree2.root));
			/*tree.root = new TreeNode(3);
			tree.root.right = new TreeNode(20);
			tree.root.left = new TreeNode(9);
			
			tree.root.right.left = new TreeNode(15);
			tree.root.right.right = new TreeNode(7);
			 leafNode(tree.root);
			 System.out.println(list);
			 list.clear();
			 System.out.println(list);*/
	}

}
