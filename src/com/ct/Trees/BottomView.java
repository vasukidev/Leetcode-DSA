package com.ct.Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*class TreeNode{
	
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val){
		
		this.val=val;
	}
}*/

public class BottomView {
	
	public static void main(String[] args) {
		
		
		TreeNode root = new TreeNode(10);
		
		root.left= new TreeNode(20);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(60);
		
		System.out.println(findBottom(root));
		
	}
	
	public static ArrayList<Integer> findBottom(TreeNode node) {
        ArrayList<Integer> bottomViewList = new ArrayList<>();
        if (node == null) {
            return bottomViewList;
        }

        // Use TreeMap to maintain sorted order of horizontal distances
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        
        helper(node, 0, 0, map);

        // Add values from the TreeMap to the list
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            bottomViewList.add(entry.getValue());
        }

        return bottomViewList;
    }
	
	
	public static void helper(TreeNode node, int level,int col, TreeMap<Integer, Integer> hm) {
		
		if(!hm.containsKey(col) || level>= hm.get(col)) {
			
			hm.put(col, node.val);
		}
		
		if(node.left!=null) {
			
			helper(node.left,level+1,col-1,hm);
		}
		
		if(node.right!=null) {
			
			helper(node.right,level+1,col+1,hm);
		}
		
		
	}

}
