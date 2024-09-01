package com.ct.Trees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.ct.Trees.LevelOrderTraversal.TreeNode;

public class ZigZagTraversal {
	
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
	
	public static List<List<Integer>>  levelOrder(TreeNode node){
		
		List<List<Integer>> arr = new ArrayList<>();
		//the queue tree
		Queue<TreeNode> q = new LinkedList<>();
		
		
		
		if(node==null) return arr;
		q.add(node);
		boolean flag = true;
		while(!q.isEmpty()) {
			
			int qsize = q.size();
			
			ArrayList<Integer> temp = new ArrayList<Integer>();
			
			for(int i =0;i<qsize;i++) {
				TreeNode treeNode = q.remove();
				if(treeNode.left!=null)q.add(treeNode.left);
				if(treeNode.right!=null)q.add(treeNode.right);
				temp.add(treeNode.val);
			}
			
			
			if(flag==true) {
				arr.add(temp);
				flag=false;
				
			}
			
			else {
				
				Collections.reverse(temp);
				arr.add(temp);
				flag = true;
			}
			
			
			
		}
		
		return arr;
	
	}

}
