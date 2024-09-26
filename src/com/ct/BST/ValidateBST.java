package com.ct.BST;

public class ValidateBST {
	
	public static void main(String[] args) {
		
	}
	
	/*
	 * Using Integer.MIN_VALUE as the initial min value and Integer.MAX_VALUE as the
	 * initial max value may cause issues. Specifically, if a node has the value
	 * Integer.MIN_VALUE or Integer.MAX_VALUE, the comparison logic can fail because
	 * it treats those values as bounds instead of valid values for the tree.
	 * 
	 * The solution is to change the data type of min and max to long so that you
	 * avoid overflow and comparison issues. This is a common approach when dealing
	 * with boundary problems in a binary search tree (BST) validation.
	 */
	
	// riddhi's approach
	public boolean isValidBST(TreeNode root) {

        //if(root==null) return false;

       long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
 

      return helper(root,min,max);
        
    }

    public boolean helper(TreeNode root, long min, long max){
      if(root==null) return true;
        
        if(min<root.val && root.val<max){
            boolean left = helper(root.left,min,root.val);
            boolean right = helper(root.right,root.val,max);
            return left && right;
        }
        
        else{
            return false;
        }


    }

}
