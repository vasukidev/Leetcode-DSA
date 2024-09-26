package com.ct.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	
	public static void main(String[] args) {
		
	}
	
	class TreeNode{
		
		int data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int data){
			
			this.data=data;
		}
	}
	
	public static List<List<Integer>>  levelOrder(TreeNode node){
		
		List<List<Integer>> arr = new ArrayList<>();
		//the queue tree
		Queue<TreeNode> q = new LinkedList<>();
		// edge case 
		if(node==null) return arr;
		// always add or print after the base condition
		q.add(node);
		while(!q.isEmpty()) {
			
			int qsize = q.size();
			
			ArrayList<Integer> temp = new ArrayList<Integer>();
			
			for(int i =0;i<qsize;i++) {
				TreeNode treeNode = q.remove();
				if(treeNode.left!=null)q.add(treeNode.left);
				if(treeNode.right!=null)q.add(treeNode.right);
				temp.add(treeNode.data);
			}
			
			arr.add(temp);
			
			
		}
		
		return arr;
		
	
	}

}
