package com.ct.BST;

public class LCA {
	
	// Striverz Approach
	// LC 230
	
	public static void main(String[] args) {
		
	}
	
	
	// recursive approach
	// O(h)
	// SC O(n) due to recursive stack space
	public TreeNode lowestCommon(TreeNode root, TreeNode p, TreeNode q) {
		
		if(root==null) return null;
		
		int cur = root.val;
		
		if(p.val<cur && q.val<cur) {
			
			return lowestCommon(root.left, p, q);
		}
		
		else if(p.val> cur && q.val>cur) {
			return lowestCommon(root.right, p, q);
		}
		
	return root;	
}
	
	// iterative approach
	// better SPace complexity O(1)
	// TC O(h) height of the tree
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		if(root==null) return root;
		
		
		
		while(root!=null) {
			int cur = root.val;
			
			// if both are less then traverse left
			if(p.val<cur && q.val<cur) {
				
				root = root.left;
			}
			// if both are less then traverse right
			else if(p.val> cur && q.val>cur) {
				root = root.right;
			}
			
			// we found the split return the root
			else {
				
				return root;
			}
		}
		
		return root;
	}
	
}
