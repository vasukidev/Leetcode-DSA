package com.ct.LinkedList;

public class MergeTwolists {
	
	public static void main(String[] args) {
		
	}
	
	
	// definition of linked list
	class ListNode{
		
		int val;
		ListNode next;
		
		ListNode(int val,ListNode next){
			
			this.val=val;
			this.next=next;
		}
		
		ListNode(int val) {
			
			this.val=val;
		}
	}
	
	public ListNode mergeTwoList(ListNode l1, ListNode l2) {
		
		// create  a result List	
		ListNode resultNode = new ListNode(Integer.MIN_VALUE);
		
		// create a copy of this node to iterate while solving the prob
		
		ListNode head = resultNode;
		
		if(head==null && head.next== null) {
			
			return null;
		}
		// null checks for nodes
		while(l1!=null && l2!=null) {
			
			if(l1.val<l2.val) {
				
				resultNode.next=l1;
				l1=l1.next;
				
			}
			
			else  {
				
				resultNode.next=l2;
				l2=l2.next;
			}
			
			// keep moving the result node pointer till the list is filled
			resultNode= resultNode.next;
		}
			
			// remaining nodes add them to the result node
		// null checks for nodes
			
			if(l1==null) {
				
				resultNode.next=l2;
			}
			
			else if(l2==null) {
				
				resultNode.next=l1;
			}
		
		
		return head.next;
	}

}
