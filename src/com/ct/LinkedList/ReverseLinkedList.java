package com.ct.LinkedList;

public class ReverseLinkedList {
	
public static void main(String[] args) {
	
	// LC 206
		
	}
	

// definition of SLL
	class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	      val = x;
	      next = null;
	     }
	 }
	
	ListNode reverseWithoutextraSpace(ListNode head) {
		
		if(head==null) {
			
			return null;
		}
		
		if(head.next==null) {
			
			return head;
		}
		
		ListNode  prevNode=null;
		ListNode currentNode = head;
		
		while(currentNode!=null) {
			
			ListNode nextNode = currentNode.next;
			currentNode.next= prevNode;
			prevNode = currentNode;
			currentNode=nextNode;
		}
		
		head = prevNode;
		return head;
	}
	
	
	
	

}
