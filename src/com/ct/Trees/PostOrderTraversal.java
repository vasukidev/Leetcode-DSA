package com.ct.Trees;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
	
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
	
	public static List<Integer> postOrder(Node root){
		
		List<Integer> postOrder = new ArrayList<>();
		
		if(root==null) {
			
			return postOrder;
		}
		
		else {
			
			postOrderTraversal(root, postOrder);
			return postOrder;
			
			
		}
	}
	
	public static void postOrderTraversal(Node node, List<Integer> postOrderList) {
		
		if(node==null) {
			
			return;
		}
		
		postOrderTraversal(node.left, postOrderList);
		postOrderTraversal(node.right, postOrderList);
		postOrderList.add(node.data); // root
		
		
	}

}
