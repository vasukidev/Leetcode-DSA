package com.ct.BST;



class TreeNode{
	
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val){
		
		//this.val==val;
	}
}

// riddhi's approach
public class SearchBST {
	
	// LC 700. Search in a Binary Search Tree
	public static void main(String[] args) {
		
	}
	
	public TreeNode search(TreeNode root, int x) {
		
		while(root!=null && root.val!=x) {
			
			root = (x<root.val)?root.left:root.right;
					
		}
		
		return root;

}
	// gfg
	//Search a node in BST

	public boolean searchNode(TreeNode root, int x) {
        // Your code here
        
     
        
        while(root!=null && root.val!=x){
            
          root = (x<root.val)?root.left:root.right;
          
        }
         if(root==null) return false;
        return root.val==x;
        
    }
	
}
