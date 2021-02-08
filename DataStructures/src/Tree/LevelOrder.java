package Tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

	public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
		
		tree.root = new TreeNode(3);
		tree.root.right = new TreeNode(20);
		tree.root.left = new TreeNode(9);
		
		tree.root.right.left = new TreeNode(15);
		tree.root.right.right = new TreeNode(7);
		List<List<Integer>> level =levelOrder(tree.root);
		Iterator<List<Integer>> itr = level.iterator();
		List<Integer> sub = new ArrayList<>();
		List<Double> result = new ArrayList<>();
		while(itr.hasNext()){
			double avg;
			sub = itr.next();
			int sum = 0;
			for(int i=0;i<sub.size();i++){
				//avg= sub.get(i)\
						sum = sum+sub.get(i);
			}
			avg= sum/sub.size();
			result.add(avg);
			
		}
		
		
		
		
		/*List<Integer> list = rightView(tree.root);
		Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
        	System.out.println(" "+itr.next());
        }*/
	}
	
	public void nextRight(TreeNode root){
		Integer null_value = new Integer(null); 
		List<List<Integer>> list = levelOrder(root);
		Iterator<List<Integer>> itr = list.iterator();
		List<Integer> sub = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		while(itr.hasNext()){
			
			sub = itr.next();
		
			for(int i=0;i<sub.size();i++){
				if(i==sub.size()-1){
					result.add(sub.get(i));
					result.add(null_value);
				}else{
					result.add(sub.get(i));
				}
			}
			
			
		}
		
	}
	
	 public static List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> main = new ArrayList<>();
	        List<Integer> sub = null;
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.add(root);
	        while(!queue.isEmpty()){
	        	int size = queue.size();
	        	sub = new ArrayList<>();
	        	for(int i = 0; i<size;i++){
	        		
	        		root = queue.remove();
	        		if(root!=null){
	        			if(root.left!=null){
			        		queue.add(root.left);
			        	}
			        	if(root.right!=null){
			        		queue.add(root.right);
			        	}
			        	sub.add(root.val);	
	        		}
		        	
	        	}
	        	
	        	main.add(sub);
	        	
	        }
	        return main;
	    }
	 
	 public static List<Integer> levelOrderWithOneList(TreeNode root) {
	        List<List<Integer>> main = new ArrayList<>();
	        List<Integer> sub = new ArrayList<>();;
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.add(root);
	        while(!queue.isEmpty()){
	        	int size = queue.size();
	        	//sub = new ArrayList<>();
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
	        	
	        	//main.add(sub);
	        	
	        }
	        return sub;
	    }
	 
	 public static List<Integer> rightView(TreeNode root) {
	        List<Integer> main = new ArrayList<>();
	        List<Integer> sub = null;
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.add(root);
	        while(!queue.isEmpty()){
	        	int size = queue.size();
	        	sub = new ArrayList<>();
	        	for(int i = 0; i<size;i++){
	        		
	        		root = queue.remove();
	        		if(root!=null){
		        	if(root.left!=null){
		        		queue.add(root.left);
		        	}
		        	if(root.right!=null){
		        		queue.add(root.right);
		        	}
		        	sub.add(root.val);
	        		}
	        	}
	        	if(sub.size() >0){
	        		main.add(sub.get(size-1));
	        	}
	        	
	        	
	        }
	        return main;
	    }

}
