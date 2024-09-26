package com.ct.BST;

public class InsertIntoBST {

	// LC 701
	public static void main(String[] args) {
		
	}
	
	
	// Recursive Approach
	// recursive stack space 
	// WC - TC O(h) height of the tree
	// Avg - O(logn) 
	// Wc - O(h) in case of skewed tree
	public TreeNode insertNodeRec(TreeNode root, int key) {
		
		// create a new node with given key data
		TreeNode newNode = new TreeNode(key);
		
		// base cond'n
		if(root==null) {
			
			return newNode;
		}
		
		if(root.val>key) {
			
			root.left=insertNode(root.left, key);
		}
		
		else {
			
			root.right=insertNode(root.right, key);
		}
		
		return root;
		
	}
	
	// iterative // efficient due to SC
	// TC O(logn)
	// SC O(1)
	public TreeNode insertNode(TreeNode root, int key) {
		
		TreeNode newNode = new TreeNode(key);
		// create a parent pointer
		TreeNode parent = null;
		// create a cur node and assign to the root
		TreeNode cur = root;
		
		
		// while loop for only traverse left and right
		while(cur!=null) {
			parent = cur;
		if(key<cur.val) 
			
			cur = cur.left;
		else 
			cur = cur.right;	
	}
		
		// assign the new node to the parent node
		if(parent==null){
			parent =  newNode;
	        return newNode;
	    }
	else if(parent.val==key) {
		return root;
	}
	else if(key<parent.val) {
		
		parent.left=newNode;
	}
	else {
		
		parent.right=newNode;
	}
	
	return root;
	}

}
