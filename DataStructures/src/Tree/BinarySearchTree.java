package Tree;

public class BinarySearchTree {

	public static void main(String[] args) {
       BinaryTree tree = new BinaryTree();
		
		tree.root = new TreeNode(8);
		tree.root.left = new TreeNode(3);
		tree.root.left.right = new TreeNode(6);
		tree.root.left.left = new TreeNode(1);
		tree.root.left.right.left = new TreeNode(4);
		tree.root.left.right.right = new TreeNode(7);
		tree.root.right = new TreeNode(10);
		tree.root.right.right = new TreeNode(14);
		tree.root.right.right.left = new TreeNode(13);
		
		System.out.println(search(tree.root,0));
		insert(tree.root, 9);
		System.out.println(search(tree.root,9));
		delete(tree.root,9);
		System.out.println(search(tree.root,9));
	}
	
	public static int search(TreeNode root, int data){
		
		if(root==null){
			System.out.println("Tree is Empty");
		}
		while(root!=null){
			if(root.val == data){
				return root.val;
			}
			else if(data<root.val && root.left !=null){
				root = root.left;
			}
			else if(data>root.val && root.right !=null){
				root = root.right;
			}
			else{
				root = null;
			}
		}
		return -1;
	}
	
public static void delete(TreeNode root, int data){
		
		if(root==null){
			System.out.println("Tree is Empty");
		}
		while(root!=null){
			if(root.val == data){
				root= null;
				break;
			}
			else if(data<root.val && root.left !=null){
				root = root.left;
			}
			else if(data>root.val && root.right !=null){
				root = root.right;
			}
			else{
				root = null;
			}
		}
	
	}
	
	public static void insert(TreeNode root, int data){
      if(root==null){
    	  root = new TreeNode(data);
    	  }
      while(true){
    	  
    	  if(data<root.val){
    		  if(root.left==null){
    			  root.left =new TreeNode(data);
    			  break;
    		  }
    		  root = root.left;
    	  }else if(data>root.val){
    		  if(root.right==null){
    			  root.right =new TreeNode(data);
    			  break;
    		  }
    		  root = root.right;
    	  }
    	  
      }
      }
	
}
