package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class VerticalOrder {
	 Map<Integer,List<Integer>> map = new TreeMap<>();
	    public List<List<Integer>> verticalTraversal(TreeNode root) {
	        Queue<TreeNode> queue = new LinkedList<>();
	        List<Integer> set = new ArrayList<>();
	        queue.add(root);
	        int height = 0;
	        set.add(root.val);
	        map.put(height,set);
	        set = new ArrayList<>();
	        while(!queue.isEmpty()){
	            root = queue.poll();
	            if(root.left!=null){
	                height = getKey(root)-1;
	                int key = getKey(height);
	                if(set!=null && key==height){
	                	set = getValueFromKey(key);
	                	 set.add(root.left.val);
	                	 map.put(height,set);
	 	                queue.add(root.left);
	 	                set = new ArrayList<>();
	                }else{
	                	set.add(root.left.val);
		                map.put(height,set);
		                queue.add(root.left);
		                set = new ArrayList<>();
	                }
	                
	                
	            }
	            if(root.right!=null){
	                height = getKey(root)+1;
	                int key = getKey(height);
	                if(set!=null && key==height){
	                	set = getValueFromKey(key);
	                	 set.add(root.right.val);
	                	 map.put(height,set);
			             queue.add(root.right);
			             set = new ArrayList<>();
	                }else{
	                	set.add(root.right.val);
		                map.put(height,set);
		                queue.add(root.right);
		                set = new ArrayList<>();
	                }
	                
	            }
	        }
	        
	        List<List<Integer>> list = new ArrayList<>();
	        List<Integer> sub = new ArrayList<>();
	        List<Integer> set2 = new ArrayList<>();
	        for(Entry<Integer, List<Integer>> entry:map.entrySet()){
	        	set = entry.getValue();
	        	Iterator<Integer> i = set.iterator(); 
	            while (i.hasNext()) {
	            	sub.add(i.next());
	            }
	            list.add(sub);
	            sub = new ArrayList<>();
	        }
	        return list;
	        
	    }
	    
	    public int getKey(TreeNode root){
	    	int key=-000000;
	    	 List<Integer> set = new ArrayList<>();
	        for(Entry<Integer, List<Integer>> entry:map.entrySet()){
	        	set = entry.getValue();
	        	Iterator<Integer> i = set.iterator(); 
	            while (i.hasNext()) {
	             if(i.next()==Integer.valueOf(root.val)){
	                key = entry.getKey();
	            }
	            }
	        }
	        return key;
	    }
	    
	    public int getKey(int height){
	    	int key=-000000;
	    	 List<Integer> set = new ArrayList<>();
	        for(Entry<Integer, List<Integer>> entry:map.entrySet()){
	        	key = entry.getKey();
	        	if(key==height){
	        		key = height;
	        		return key;
	        	}
	        }
	        return key;
	    }
	    
	    public List<Integer> getValue(TreeNode root){
	    	 List<Integer> set = new ArrayList<>();
	    	for(Entry<Integer, List<Integer>> entry:map.entrySet()){
	        	set = entry.getValue();
	        	if(set.contains(root.val)){
	        		return set;
	        	}
	        	
	        }
	    	return null;
	    }
	    
	    public List<Integer> getValueFromKey(int key){
	    	int key1=-000000;
	    	 List<Integer> set = new ArrayList<>();
	    	for(Entry<Integer, List<Integer>> entry:map.entrySet()){
	    		key1 = entry.getKey();
	        	if(key1==key){
	        		
	        		return entry.getValue();
	        	}
	        	
	        }
	    	return null;
	    }
	public static void main(String[] args) {
       BinaryTree tree = new BinaryTree();
		
		tree.root = new TreeNode(3);
		tree.root.right = new TreeNode(20);
		tree.root.left = new TreeNode(9);
		
		tree.root.right.left = new TreeNode(15);
		tree.root.right.right = new TreeNode(7);
		VerticalOrder obj = new VerticalOrder();
		obj.verticalTraversal(tree.root);

	}

}
