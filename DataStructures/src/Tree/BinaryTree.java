package Tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public class BinaryTree {

   TreeNode root;
	
	public BinaryTree() {
		this.root =null;
	}
	
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.root = new TreeNode(10);
		tree.root.right = new TreeNode(30);
		tree.root.left = new TreeNode(20);
		
		tree.root.left.left = new TreeNode(40);
		tree.root.left.right = new TreeNode(50);
		
		inOrder(tree.root);
		System.out.println("In Order Interative");
		inOrderItr(tree.root);
		preOrder(tree.root);
		System.out.println("Pre Order Interative");
		preOrderItr(tree.root);
		System.out.println("Post Order Recursive");
		postOrder(tree.root);
		System.out.println("Post Order Interative");
		postOrderItr(tree.root);
		Map<Integer,Integer> map = new HashMap<>();
		map.put(10, 10);
		
		for(Entry<Integer,Integer> entry:map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	
	public static void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.val);
		inOrder(root.right);
	}
	
	public static void preOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.println(root.val);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void postOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.val);
	}
	
	public static void inOrderItr(TreeNode root){
		if(root==null){
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		while(true){       // true means there must be a break statement in while loop
			if(root!=null){
				stack.push(root);
				root = root.left;
			}else{
				if(stack.isEmpty()){
					break;
				}
				root = stack.pop();
				System.out.println(" "+root.val);
				root = root.right;
			}
			
		}
		
	}
	
	public static void preOrderItr(TreeNode root){
		if(root==null){
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()){
			root = stack.pop();
			System.out.println(" "+root.val);
			if(root.right!=null){
				stack.push(root.right);
			}
			if(root.left!=null){
				stack.push(root.left);
			}
			
		}
	}
	

	public static List<Integer> postOrderItr(TreeNode root) {
		LinkedList<Integer> ans = new LinkedList<>();
		Stack<TreeNode> stack = new Stack<>();
		if (root == null) return ans;
		
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode cur = stack.pop();
			ans.addFirst(cur.val);
			if (cur.left != null) {
				stack.push(cur.left);
			}
			if (cur.right != null) {
				stack.push(cur.right);
			} 
		}
		Iterator<Integer> its = ans.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		return ans;	
	}

}
