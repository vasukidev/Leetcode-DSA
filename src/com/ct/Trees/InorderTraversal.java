package com.ct.Trees;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
	
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
	
	public static List<Integer> inOrder(Node root){
		
		List inOrder = new ArrayList<Integer>();
		
		if(root==null) {
			return inOrder;
		}
		
		else {
			
		      inOrderTraversal(root, inOrder);
			return inOrder;
		}
		
		
	}
	
	
	public static void inOrderTraversal(Node node, List<Integer> inorderTraversalList) {
		
		if(node==null) {
			
			return;
		}
		
		inOrderTraversal(node.left, inorderTraversalList);
		inorderTraversalList.add(node.data);
		inOrderTraversal(node.right,inorderTraversalList);
		
		
	}

}
