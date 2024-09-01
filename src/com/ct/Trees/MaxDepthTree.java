package com.ct.Trees;

import com.ct.Trees.InorderTraversal.Node;

public class MaxDepthTree {
	
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

	
	public static int maxDepth(TreeNode node) {
		
		return depth(node);
	}
	
	public static int depth(TreeNode node) {
		
		if(node==null) return 0;
		
		int leftdepth = depth(node.left);
		int rightdepth = depth(node.right);
		
		return Math.max(leftdepth, rightdepth)+1;
	}
}
