package com.ct.BST;

public class DeleteNode {
	
	// LC 450
	
	public static void main(String[] args) {
		
	}
	
	
	public static TreeNode deleteNode(TreeNode root, int key) {
		
		// base cond
		// if given root is only null return the empty treenode root
		if(root==null) {
			
			return root;
		}
		
		// basic binary search conditions
		if(key<root.val) {
			
			// make sure you always set the deleted one to the root
			root.left = deleteNode(root.left, key);		
		}
		
		else if(key>root.val) {
			// make sure you always set the deleted one to the root
			root.right = deleteNode(root.right, key);
		}
		
		else {
			// if left side of the node to be deleted is null return it's right node to it's place
			if(root.left==null) {
				
				return root.right;
			}
			// similarly if the right side is null return left
			else if(root.right==null) {
				
				return root.left;
			}
				// another case to get the bottom left smallest element from the right
			// inorder successor 
				root.val = getMin(root.right);
				// now after getting the min value and replacing it with the node to be deleted
				// we will delete from it's prev position which is the bottom left
				// call root.right and delete directly the bottom left 
				root.right= deleteNode(root.right, root.val);
			
		}
		
		return root;
	}
	
	
	public static int getMin(TreeNode root) {
		
		int min = root.val;
		
		while(root.left!=null) {
			
			// keep updating the min val
			min = root.left.val;
			// keep traversing till the bottom left to find the inorder successor
			root=root.left;
					
		}
		
		return min;
	}
	
	

}
