package com.ct.Trees;

public class CountGoodNodes {
	
	// LC 1448. Count Good Nodes in Binary Tree
	
	public static void main(String[] args) {
		
	}
	
	

    int countGoodNodes = 0;
    public int goodNodes(TreeNode root) {
    int max_temp = Integer.MIN_VALUE;

     getNodes(root,max_temp);
     return countGoodNodes;           
    }


    public void getNodes(TreeNode root , int max_temp){

    	// base condition
         if(root==null) return;

        // main logic
        if(root.val>=max_temp){
            countGoodNodes++;
        }  
         
         // traverse left get the max val
        getNodes(root.left,Math.max(root.val,max_temp));
        // traverse right and get the max value
        getNodes(root.right,Math.max(root.val,max_temp));
    }

}
