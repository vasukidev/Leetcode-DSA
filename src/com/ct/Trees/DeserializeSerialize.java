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
		
		if(root==null) return null;
		
		// separates the nodes 
		StringBuilder str = new StringBuilder("^");
		
		str.append(root.val);
		str.append(serialize(root.left));
		str.append(serialize(root.right));
		
		
		return str.toString();
	}
	
	public TreeNode deserialize(String data) {
		
		String[] split = data.split(",");
		
		List<String> asList = Arrays.asList(split);
		
		Queue<String> q = new LinkedList<>(asList);
		
	     return deserializeHelper(q);
		
		
	}
	
	
	public TreeNode deserializeHelper(Queue<String> q) {
		
		// q.poll will look for the val in the queue
		String val = q.remove();
		
		if(val==null) {
			return null;
			}
		
		else {
		TreeNode root = new TreeNode(Integer.parseInt(val));
		
		root.left = deserializeHelper(q);
		root.right = deserializeHelper(q);
		
		return root;
		}
	}

}
