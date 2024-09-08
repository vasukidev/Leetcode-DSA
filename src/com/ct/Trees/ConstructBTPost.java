package com.ct.Trees;

import java.util.HashMap;

public class ConstructBTPost {
	
	// LC 106 construct-binary-tree-from-inorder-and-postorder-traversal/
	
	public static void main(String[] args) {
		
	}
	
	
	public TreeNode constructBT(int [] inorder, int [] postorder) {
		
		HashMap<Integer,Integer> inorderMap = new HashMap<>();
		
		for(int i =0;i<inorder.length;i++) {
			
			inorderMap.put(inorder[i], i);
		}
		
		return splitTree(postorder, inorderMap, postorder.length-1, 0, inorder.length-1);
	}
	
	private TreeNode splitTree(int[] postorder, HashMap<Integer, Integer> inorderMap, int rootIndex, int left, int right) {
        // Base case: if left index exceeds right, no tree can be formed
        if (left > right) {
            return null;
        }

        // The current root is the value at the current rootIndex of postorder
        TreeNode root = new TreeNode(postorder[rootIndex]);

        // Get the index of the root in the inorder array
        int mid = inorderMap.get(postorder[rootIndex]);

        // Decrement rootIndex for next recursion, as postorder processes roots from the back
        rootIndex--;

        // Recursively build the right subtree first (because we are going backward in postorder)
        root.right = splitTree(postorder, inorderMap, rootIndex, mid + 1, right);

        // Update rootIndex by subtracting the number of elements in the right subtree
        // This is required because rootIndex was decremented by one for the right subtree
        rootIndex -= (right - mid);

        // Recursively build the left subtree
        root.left = splitTree(postorder, inorderMap, rootIndex, left, mid - 1);

        return root;
    
		
	}

}
