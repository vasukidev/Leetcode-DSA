package com.ct.Trees;

import java.util.HashSet;

public class LowestCA {
	
	
	
	// Definition for a Node.
	class Node {
	    public int val;
	    public Node left;
	    public Node right;
	    public Node parent;
	};
	
	
	// LC 1650
	
	
	public static void main(String[] args) {
		
	}
	
	public Node lowestCA(Node p, Node q) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		System.out.println(hs.toArray());
		
		while(p!=null) {
			
			hs.add(p.val);
			
			p=p.parent;		
		}	
		while(q!=null) {
			
			if(hs.contains(q.val)) {
				
				return q;
			}
			
			q=q.parent;
		}
		
		
		return null;
		
		
	}
	
	
	

}
