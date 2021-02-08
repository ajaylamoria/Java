package Tree;

import java.util.ArrayList;
import java.util.List;

public class TopView {
	public static List<Integer> levelOrder = null;
	public static void main(String[] args) {
		 BinaryTree tree = new BinaryTree();
			
			tree.root = new TreeNode(1);
			tree.root.right = new TreeNode(2);
			tree.root.right.right = new TreeNode(5);
			
			tree.root.right.right.left = new TreeNode(3);
			tree.root.right.right.left.right = new TreeNode(4);
			tree.root.right.right.right = new TreeNode(6);
			VerticalOrder obj = new VerticalOrder();
			LevelOrder level = new LevelOrder();
		   levelOrder = level.levelOrderWithOneList(tree.root);
			
			List<List<Integer>> verticalOrder = obj.verticalTraversal(tree.root);
			List<Integer> topView = new ArrayList<>();
			for(int i=0;i<verticalOrder.size();i++){
				List<Integer> sub = verticalOrder.get(i);
				for(int j=0; j< sub.size();i++){
					if(sub.size()>1){
						int small=0;
						int x = compare(sub.get(j));
						small = x;
						
					}
				}
			}
			
			
	}
	
	public static int compare(Integer val){
		
			
			for(int j=0;j<levelOrder.size();j++){
				if(val.equals(levelOrder.get(j))){
					return j;
				}
			}
		
		return -0;
	}
}
