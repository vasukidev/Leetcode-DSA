package com.ct.BST;

public class RangeSum {
	
	// LC 938
	
	public static void main(String[] args) {
		
	}
	
	public static int rangeSum(TreeNode root, int low, int high) {
		if(root==null) return 0;
		
		int sum = 0;
		
		// explore the left sub tree
		if(root.val>low) {
			
			sum+= rangeSum(root.left, low, high);
		}
		
		// if the value is in the range then dd to the sum
		if(root.val>=low && root.val<=high) {
			
			sum+= root.val;
		}
		
		// explore the right sub tree
		if(root.val<high) {
			
			sum+= rangeSum(root.right, low, high);
		}
		return sum;	
	}
	
	

}
