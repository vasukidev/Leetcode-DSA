package com.ct.BST;

public class FloorCeilBST {
	// Anuj's approach
	class Node{
		
		int data;
		Node left;
		Node right;
		
		Node(int data){
			
			this.data=data;
		}
	}
	
	public static void main(String[] args) {
		
	}

// find ceil // gfg
	 int findCeil(Node root, int key) {
	        if (root == null) return -1;
	        // Code here
	        // take -1
	        int ans = -1;
	        
	        // iterative aproach
	        while(root!=null){
	            
	            if(root.data==key){
	                
	                return root.data;
	            }
	        if(root.data>key){
	            ans = root.data;
	            root=root.left;
	        } 
	       else{
	           root=root.right;
	           
	           
	       }

	      
	        }
	          return ans;
	    }
	 
	 
	 // find floor
	 int findFloor(Node root,int key) {
		 // take plus infinite
		 int floorMax = Integer.MAX_VALUE;
		 
		 while(root!=null) {
		 if(root.data==key) {
			 
			 return root.data;
		 }
		 
		 if(root.data> key) {
			 
			 root = root.right;
		 }
		 
		 else {
			 
			 floorMax = root.data;
			 root = root.left;
		 }
	 }
		 
		 return floorMax;
	 }
}
