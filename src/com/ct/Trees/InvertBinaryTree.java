package com.ct.Trees;

import java.util.ArrayList;
class TreeNode{
	
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val){
		
		this.val=val;
	}
}

public class InvertBinaryTree {
	

	
	public static void main(String[] args) {
		
		
		  TreeNode root = new TreeNode(4); 
		  root.left = new TreeNode(2); 
		  root.right = new TreeNode(7); 
		  root.left.left = new TreeNode(1); 
		  root.left.right = new TreeNode(3); 
		  root.right.left = new TreeNode(6); 
		  root.right.right = new TreeNode(9);
		 
		
		System.out.println(invertBt(root));
		
		
	}
	
	
	public static TreeNode invertBt(TreeNode root){
		
		
		
		if(root==null) return null;
		
		
		TreeNode left = invertBt(root.left);
		TreeNode right = invertBt(root.right);
		
		// swap
		root.left=right;
		root.right=left;
		
		
		return root;
		
	
		
	}

}
