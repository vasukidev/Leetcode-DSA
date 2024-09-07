package com.ct.Trees;

import java.util.ArrayList;


/*Expected Time Complexity: O(N).
Expected Auxiliary Space: O(H).
Note: H is the height of the tree.
*/
public class PrintNodetoLeaf {
	
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
	
	
	public static ArrayList<Integer> findPath(TreeNode node){
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		helper(node,ans,al);
		
		return al;
	}
	
	public static void helper(TreeNode node , ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp) {
		
		if(node==null) return;
		// adding the data to temp list 
		temp.add(node.val);
		
		// check for leaf node
		if(node.left==null && node.right==null) {
			// adding temp to the list
			ArrayList<Integer> list = new ArrayList<Integer>(temp);
			// add the final root to leaf to the ans list
			ans.add(list);
			
		}
		helper(node.left,ans, temp);
		helper(node.right, ans,temp);
		// we will remove the last element
		
		temp.remove(temp.size()-1);
		
		
	}

}
