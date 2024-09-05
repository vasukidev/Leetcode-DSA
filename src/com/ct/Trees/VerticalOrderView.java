package com.ct.Trees;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

import com.ct.Trees.LeftRightView.TreeNode;

public class VerticalOrderView {
	
class TreeNode{
		
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val){
			
			this.val=val;
		}
	}

	
	public static void main(String[] args) {
		
	}
	
	public static List<List<Integer>> findVertical() {
		
		return null;
	}
	

	
	public static void findView(TreeNode node, int col, int level) {
		
		TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> tm = new TreeMap<>();

		
		Queue<Integer> q = new PriorityQueue();
		
	
}
}
