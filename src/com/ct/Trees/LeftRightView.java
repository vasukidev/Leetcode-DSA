package com.ct.Trees;

import java.util.ArrayList;
import java.util.List;

public class LeftRightView {
	
	
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
	
	
	public static ArrayList<Integer> findView(TreeNode node){
		
		ArrayList<Integer> viewList = new ArrayList<Integer>();
		
		if(node==null) return viewList;
		
		
		helper(node, viewList, 0);
		
		return viewList;
		
	}
	
	
	public static void helper(TreeNode node,List<Integer> ans,int level) {
		
		if(node==null) return;
		
		if(level==ans.size())
		ans.add(node.val);
		if(node.left!=null)
		helper(node.left, ans, level+1);
		if(node.right!=null)
		helper(node.right, ans, level+1);
	}

}
