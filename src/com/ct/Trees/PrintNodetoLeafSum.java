package com.ct.Trees;

import java.util.ArrayList;


/*Expected Time Complexity: O(N).
Expected Auxiliary Space: O(H).
Note: H is the height of the tree.
*/
public class PrintNodetoLeafSum {
	
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
		
		helper(node,ans,al,0);
		
		return al;
	}
	
	public static boolean helper(TreeNode node , ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp, int sum) {
		
		if(node==null) return false;
		// adding the data to temp list 
		temp.add(node.val);
		
		// check for leaf node
		if(node.left==null && node.right==null) {
			// adding temp to the list
			ArrayList<Integer> list = new ArrayList<Integer>(temp);
			// add the final root to leaf to the ans list
			ans.add(list);
			
		}
		
		if(sum==7) {
			return true;	
		}
		
		// add all the values of the nodes from root to leaf
		sum+=node.val;
		helper(node.left,ans, temp,sum);
		helper(node.right,ans,temp,sum); 
		sum-=node.val;
		// we will remove the last element
		
		temp.remove(temp.size()-1);
		
		
		
		return false;
	}

}
