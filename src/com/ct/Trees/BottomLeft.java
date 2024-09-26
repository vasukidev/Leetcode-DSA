package com.ct.Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BottomLeft {
	
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	
	    public int findBottomLeftValue(TreeNode root) {
	        HashMap<Integer,Integer> hm = new HashMap<>();
	           List<Integer> list = new ArrayList<>();
	        if(root==null) return 0;

	          helper(root,hm,0);
	          // Find the maximum level in the map, which corresponds to the bottom-most level
	         int maxLevel = Integer.MIN_VALUE;
	        for (int level : hm.keySet()) {
	            if (level > maxLevel) {
	                maxLevel = level;
	            }
	        }
	        
	        // Return the leftmost value at the bottom-most level
	        return hm.get(maxLevel);
	        
	        
	    }

	    public void helper(TreeNode node, HashMap<Integer,Integer> hm,int level){
	                       

	                       if(node==null) return;
	                          
	                           if(!hm.containsKey(level)){
	                            hm.put(level,node.val);
	                           }
	                          helper(node.left,hm,level+1);
	                          helper(node.right,hm,level+1);


	    }





	}


