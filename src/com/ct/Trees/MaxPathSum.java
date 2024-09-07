package com.ct.Trees;

public class MaxPathSum {
	
	public static void main(String[] args) {
		
	}
	
	class TreeNode{
		
		
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val){
			
			this.val=val;
		}
		
	}
	
	
	public static int findMaxPath(TreeNode node, int [] d){
		
		if(node == null) return 0;
		
		// if the value less than 0 i.e. negative ignore don't send above 
		int left = Math.max(0, findMaxPath(node.left, d));
		int right = Math.max(0, findMaxPath(node.right, d));
		
	
		d[0] = Math.max(d[0], left+right+node.val);
		
		// finally at the root we will return the max of both sides of the root and add it self
		
		return Math.max(left, right) + node.val;
		
		
	}
	
	
	public static int findSum(TreeNode node) {
		
		int [] d = new int[1];
		// at 0th index placing the min value
		d[0] = Integer.MIN_VALUE;
		// passing the min value
		findMaxPath(node, d);
		
		// finally return the left + right + node.val itself 
		return d[0];
		
		
	}
	
	

}
