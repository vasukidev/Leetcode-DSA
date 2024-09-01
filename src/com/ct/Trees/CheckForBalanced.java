package com.ct.Trees;

import com.ct.Trees.MinDepth.TreeNode;

public class CheckForBalanced {
	
	public static void main(String[] args) {
		
	}
class TreeNode{
		
		int data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int data){
			
			this.data=data;
		}
	}
	
	public static boolean balance(TreeNode node) {
		
		return depth(node)!=-1;
		
		
		
		
	}
	
	
	public static int depth(TreeNode node) {
		
		if(node==null) return 0;
		
		
		int left = depth(node.left);
		
		if(left==-1) return -1;
		int right = depth(node.right);
		if(right==-1) return -1;
		
		
		if(Math.abs(left-right)>1) return -1;
		
		return Math.max(left, right)+1;
		
	}

}
