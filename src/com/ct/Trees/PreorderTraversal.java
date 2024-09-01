package com.ct.Trees;

import java.util.ArrayList;
import java.util.List;



public class PreorderTraversal {
	
	public static void main(String[] args) {
		
	}
	
	class Node{
		
		int data;
		Node left;
		Node right;
		
		Node(int data){
			
			this.data=data;
		}
	}
	
	public static List<Integer> preorder(Node root){
		
		List<Integer> preorderList = new ArrayList<Integer>();
		
		if(root==null) {
			
			return preorderList;
			
			
		}
		
		else {
			
			traversal(root, preorderList);
			
			return preorderList;
			
			
		}
		
		
	}
	
	public static void traversal(Node node, List<Integer> preorderTraversal ) {
		
		if(node==null) return;
		
		preorderTraversal.add(node.data);
		traversal(node.left, preorderTraversal);
		traversal(node.right, preorderTraversal);
	}

}
