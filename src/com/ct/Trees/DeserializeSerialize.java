package com.ct.Trees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DeserializeSerialize {
	
	public static void main(String[] args) {
		
	}
	
	
	// serialization
	public String serialize(TreeNode root) {
		
		
		// use sb for 
		StringBuilder sb = new StringBuilder();
		serializehelper(sb,root);
		return sb.toString();
	}
	
	public String serializehelper(StringBuilder sb, TreeNode root) {
		
		// null check 
		if(root==null) {
			
			// delimiter ","
			sb.append("N").append(",");
		}
		
		
		else {
			sb.append(root.val).append(",");
			// apply recursion on left node 
			serializehelper(sb, root.left);
			serializehelper(sb, root.right);
		}
		
		return sb.toString();
		
	}
	
	public TreeNode deserialize(String data) {
		
		String[] split = data.split(",");
		
		List<String> asList = Arrays.asList(split);
		
		// deserialize into list and place the values into queue
		// because tree has underlying Data structure of queue 
		Queue<String> q = new LinkedList<>(asList);
		
	     return deserializeHelper(q);
		
		
	}
	
	
	public TreeNode deserializeHelper(Queue<String> q) {
		
		//  keep removing from queue as you traverse through their left and right 
		String val = q.remove();
		
		if(val.equalsIgnoreCase("N")) {
			return null;
			}
		
		else {
			// if you find value immeditaley create a tree node 
		TreeNode root = new TreeNode(Integer.parseInt(val));
		// keep traversing left and right
		root.left = deserializeHelper(q);
		root.right = deserializeHelper(q);
		
		// return tree root 
		return root;
		}
	}

}
