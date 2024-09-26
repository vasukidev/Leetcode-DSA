package com.ct.Trees;

public class MaxPathSum {
	
	// 124. Binary Tree Maximum Path Sum
	
	public static void main(String[] args) {
		
	}
	
	/*class TreeNode{
		
		
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val){
			
			this.val=val;
		}
		
	}*/
	
	
	public int maxPathSum(TreeNode node) {
		
		 // We use an array 'd' of size 1 to store the maximum path sum found so far.
	    // This is done because primitive values in Java are passed by value, 
	    // and using an array allows us to update its content within the helper function.

        int [] d = new int[1];
		// at 0th index placing the min value
		d[0] = Integer.MIN_VALUE;
		// passing the min value
		findMaxPath(node, d);
		
		// finally return the left + right + node.val itself 
		return d[0];
        
    }

    public  int findMaxPath(TreeNode node, int [] d){
		
		if(node == null) return 0;
		
		// if the value less than 0 i.e. negative ignore don't send above 
		int left = Math.max(0, findMaxPath(node.left, d));
		int right = Math.max(0, findMaxPath(node.right, d));
		
		 // Now that we have the maximum path sums from the left and right subtrees,
	    // we calculate the total path sum that passes through the current node.
	    // This sum includes the current node's value plus the left and right subtree sums.
	    // We then compare this total sum with the current maximum stored in d[0],
	    // and update d[0] if this path sum is larger.
		d[0] = Math.max(d[0], left+right+node.val);
		
		// finally at the root we will return the max of both sides of the root and add it self
		// We will send the value up only if it's greater than 0
		// less than 0 then send 0 no negatives 
	    // To continue the recursion, return the maximum sum of either the left or right
	    // path, plus the value of the current node. This value represents the maximum
	    // contribution of the current node to the path that includes it.
		return Math.max(left, right) + node.val;
		
		
	}
    
}
	
	


