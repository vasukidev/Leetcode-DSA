package com.ct.Trees;

import com.ct.Trees.InorderTraversal.Node;

public class MinDepth {
	
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
	
	  public int minDepth(TreeNode root) {

	        return depth(root);
	        
	    }

	    public int depth(TreeNode node){

	        if(node==null){

	            return 0;
	        }

	        int left = depth(node.left);
	        int right = depth(node.right);
	        if(left==0 || right==0){
	        return Math.max(left,right) +1;
	           }
	    return Math.min(left,right) +1;
	    }

}
