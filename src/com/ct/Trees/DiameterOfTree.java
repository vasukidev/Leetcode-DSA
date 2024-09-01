package com.ct.Trees;

class TreeNode{
	
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data){
		
		this.data=data;
	}
}

public class DiameterOfTree {
	
	static int diameter = 0;
	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
	    root.left = new TreeNode(2);
	    root.right = new TreeNode(3);
	    root.left.left = new TreeNode(4);
	    root.left.right = new TreeNode(5);
	    
	    
		System.out.println(diameterOfBinaryTree(root));
		

	}
	
	public static int diameterOfBinaryTree(TreeNode root) {

        calcDiameter(root);

        return diameter;
        
    }

    public static int calcDiameter(TreeNode node) {
		
		
		
		if(node==null) return 0;
		
		int left = calcDiameter(node.left);
		int right = calcDiameter(node.right);
		
		diameter = Math.max(diameter, left+right);
		
		return Math.max(left, right) +1;
	}

}
