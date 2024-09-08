package com.ct.Trees;

import java.util.HashMap;

public class ConstructBT {
	
	
	/* LC 105. Construct Binary Tree from Preorder and Inorder Traversal */
	
	public static void main(String[] args) {
		
	}

	
	public static TreeNode constructBt(int [] preorder,int [] inorder) {
		
		HashMap<Integer, Integer> inOrderHashMap = new HashMap<Integer, Integer>();
		
		for(int i =0;i<inorder.length;i++) {
			
			inOrderHashMap.put(inorder[i], i);
			
			
		}
		
		return splitTree(preorder,inOrderHashMap, 0, 0, inorder.length-1);
	}
	
	public static TreeNode splitTree(int [] preorder,HashMap<Integer, Integer> hm,int rootIndex,int left,int right) {
		
		
			// the first root of the BT construct BT
			TreeNode root = new TreeNode(preorder[rootIndex]);
			
			// traverse left side

			// from inorder map get the pre order root element index
            int mid = hm.get(preorder[rootIndex]);
            
            if(mid>left) {
            	
            	// calc the left bound
            	root.left = splitTree(preorder,hm, rootIndex+1, left, mid-1);
            	
            }
            if(mid<right) {
            	// calc the right bound
            	root.right = splitTree(preorder,hm, rootIndex+mid-left+1, mid+1, right);
            }
			
		
		return root;
		
	}

}
