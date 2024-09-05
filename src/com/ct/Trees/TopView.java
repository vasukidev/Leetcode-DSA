package com.ct.Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class TreeNode{
	
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val) {
		this.val=val;
		
	}
}
public class TopView {
	
	public static void main(String[] args) {
		
        TreeNode root = new TreeNode(10);
		root.left= new TreeNode(20);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(60);
		System.out.println(findTopView(root));
	}
	
	public static ArrayList<Integer> findTopView(TreeNode node){
		
		ArrayList<Integer> listView = new ArrayList<Integer>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		//int col = 0;
		if(node==null) return listView;
		helper(node,listView,0,hm);
		
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
			listView.add(entry.getValue());
			
		}
		return listView;
		
	}
	
	public static void helper(TreeNode node, List list,int col,HashMap<Integer,Integer> hm) {
		
		if(node==null) return;
		if(!hm.containsValue(node.val)) {	
			hm.put(col, node.val);	
		}
		
		if(node.left!=null) {
		helper(node.left, list, col-1,hm);
		}
		if(node.right!=null) {
		helper(node.right, list, col+1,hm);
		}
			
		
	}

}
