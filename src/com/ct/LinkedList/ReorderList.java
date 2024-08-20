package com.ct.LinkedList;

public class ReorderList {
	
	// LC 143
	
	class ListNode{
		
		int val;
		ListNode next;
		
		ListNode(int x){
			
			x=val;
			next=null;
		}
	}
	
	
	public void reOrder(ListNode head) {
		
		if(head==null || head.next==null) {
			
			
			return;
			
			
		}
		
		
		// floyd warshall algorithm
		// p1 will reach middle point
		ListNode p1 = head;
		ListNode p2= head;
		
		while(p2.next!=null && p2.next.next!=null) {
			
			p1= p1.next;
			p2=p2.next.next;
			
		}
		
		
		// reverse the list from mid to end
		// end to mid
		ListNode premiddle = p1;
		ListNode precurrent = p1.next;
		
		while(precurrent.next!=null) {
			
			ListNode current = precurrent.next;
			precurrent.next=current.next;
			current.next=premiddle.next;
			premiddle.next=current;
		}
		
		// reorder all the nodes 
		// need to understand
		
		p1=head;
		p2=premiddle.next;
		
		while(p1!=premiddle) {
			
			premiddle.next=p2.next;
			p2.next=p1.next;
			p1.next=p2;
			p1=p2.next;
			p2=premiddle.next;
		}
		
		
	}
	
	

}
