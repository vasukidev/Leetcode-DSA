package com.ct.Trees;

import java.util.ArrayList;
import java.util.Collections;

public class BoundaryTraversal {
	
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
	
	
	public static ArrayList<Integer> boundary(TreeNode node){
		
		// create an array list and add left side of the tree
		// over all list
		ArrayList<Integer> traversal = new ArrayList<Integer>();
		// add data
		traversal.add(node.val);
		
		
		if(node.left!=null) {
			
			leftTraversal(node.left, traversal);
			// add all the left side elements and remove the last node as it's a leaf node
			traversal.add(traversal.size()-1);
		}
		
		// create a list for right side of the tree 
		ArrayList<Integer> reverseTraversal = new ArrayList<Integer>();
		
		if(node.right!=null) {
			// call recursively and get the right list
			rightTraversal(node.right, reverseTraversal);
			// add right list get the right list and remove the last element
			reverseTraversal.add(reverseTraversal.size()-1);
			// reverse the list
			Collections.reverse(reverseTraversal);
			// add all the right list elements to final list
			traversal.addAll(reverseTraversal);
		}
		
		return traversal;
	}
	
	// left side of the tree
	public static void leftTraversal(TreeNode node,ArrayList<Integer> traversal) {
		// base condition
		if(node==null) return;
		traversal.add(node.val);
		// node left check
		if(node.left!=null) {
			
			leftTraversal(node.left,traversal);
		}
		// node right check
		else if(node.right!=null) {
			
			leftTraversal(node.right, traversal);
		}
	}
	
	
	// right side of the tree traversal
        public static void rightTraversal(TreeNode node,ArrayList<Integer> traversal) {
		// base condition
		if(node==null) return;
		
		traversal.add(node.val);
		if(node.right!=null) {
			
			rightTraversal(node.right,traversal);
		}
		else if(node.left!=null) {
			
			rightTraversal(node.left, traversal);
		}
		
		
	}
        
        //leaf node traversal
        public static void leafTraversal(TreeNode node,ArrayList<Integer> traversal) {
    		// base condition
    		if(node==null) return;
    		leafTraversal(node.left, traversal);
    		if(node.left==null && node.right==null) 
    			traversal.add(node.val);
    		leafTraversal(node.right, traversal);
    		
    	}

}
