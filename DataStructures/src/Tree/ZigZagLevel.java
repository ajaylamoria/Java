package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagLevel {

	public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> main = new ArrayList<>();
        boolean isReverse = true;
        List<Integer> sub = null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
        	int size = queue.size();
        	sub = new ArrayList<>();
        	for(int i = 0; i<size;i++){
        		
        		root = queue.remove();
	        	if(root.left!=null){
	        		queue.add(root.left);
	        	}
	        	if(root.right!=null){
	        		queue.add(root.right);
	        	}
	        	sub.add(root.val);
        	}
        	if(isReverse==false){
        		Collections.reverse(sub);
        		isReverse = true;
        	}else{
        		isReverse = false;
        	}
        	
        	main.add(sub);
        	
        }
        return main;
    }
	
	public static void main(String[] args) {
		 BinaryTree tree = new BinaryTree();
			
			tree.root = new TreeNode(3);
			tree.root.right = new TreeNode(20);
			tree.root.left = new TreeNode(9);
			
			tree.root.right.left = new TreeNode(15);
			tree.root.right.right = new TreeNode(7);
			List<List<Integer>> level =levelOrder(tree.root);

	}

}
