package com.ct.BST;

import java.util.ArrayList;
import java.util.List;

public class KthSmallest {
	
	private int count = 0;
	
	private int ans = -1;
	
	 public int kthSmallest(TreeNode root, int k) {
	        ArrayList list = new ArrayList<Integer>();
			
			
			if(root==null) {
				
				return ans;
				}
		
				inOrderTraversal(root, list);
				// list is zero based indexing
				// but k is 1 based
				// so k-1 to fetch the right node data 
			       ans = (int)list.get(k-1);

	               return ans;
			
	        
	    }
	    public  void  inOrderTraversal(TreeNode root, ArrayList<Integer> list) {

	        if(root==null) return;
			
			
			inOrderTraversal(root.left,list);
			list.add(root.val);
			inOrderTraversal(root.right,list);
			
			
		}
	    
	    // using count variable
	    // for better SC not using list
	    
	    public int kthSmall(TreeNode root, int k) {

	        
	    	inOrder(root, k);
	    	return ans;
        
    }

      public void inOrder(TreeNode root, int k) {
	    	
	    	
	    	if(root==null) return;
	    	
	    	
	    	inOrder(root.left, k);
	    	count++;
	    	
	    	if(count==k) {
	    		
	    		ans=root.val;
	    		return;
	    	}
	    	
	    	inOrder(root.right, k);
	    }
	    
	   

}
