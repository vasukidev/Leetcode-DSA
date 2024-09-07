package com.ct.Trees;

public class SubTreeOrNot {
	

/*guys who ever is confused with '^' in Stringbuilder    it is to handle below kind of tree node
 
TreeNode root = new TreeNode(12);
TreeNode subRoot = new TreeNode(2);


where 12 (twelve)  will be  treated as 1,2 subtree as 2 it gives true  

to figure out item or data in node we are using ^ as seperator */
	
	public static void main(String[] args) {
		
	}
	
	public String preOrder(TreeNode root) {
		
		
		if(root==null) return null;
		
		// added as separator 
		StringBuilder str = new StringBuilder("^");
		
		// Ro,L ,R
		str.append(root.val);
		str.append(preOrder(root.left));
		str.append(preOrder(root.right));
		
		return str.toString();
		
		
	}
	
	
	public boolean isSubTree(TreeNode root,TreeNode subRoot) {
		
		
		String mainTree = preOrder(root);
		String subTree = preOrder(subRoot);

	     return mainTree.contains(subTree);
		
		
	}

}
