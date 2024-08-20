package com.ct.LinkedList;

import org.w3c.dom.Node;

public class CycleDetect {
	
	// apply floyd warshall algorithm 
	
	public static void main(String[] args) {
		
	}
	
	
	// definition of SLL
	class ListNode{
		
		int val;
		ListNode next;
		
		ListNode(int x){
			val=x;
			next=null;
		}
		
		
	}
	
	public static boolean cycleDetect(ListNode head) {
		
		
		// floyd warshall
		// slow = x
		// fast = 2x
		ListNode slowptr = head;
		ListNode fastptr = head;
		
		while(slowptr!=null && fastptr!= null && fastptr.next!=null) {
			
			slowptr = slowptr.next;
			fastptr = fastptr.next.next;
			
			if(slowptr==fastptr) {
				
				return true;
			}
		}
		
		return false;
		
		
	}

}
