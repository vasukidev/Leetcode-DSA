package com.ct.LinkedList;

public class RemoveNthNode {
	
	// remove nth node from the end of the list 
	// LC 19
	
	class ListNode{
		
		int val;
		ListNode next;
		
		ListNode(int val,ListNode next){
			
			this.val=val;
			this.next=null;
		
		}
		
		ListNode(int val){
			
			this.val=val;
		}
		
	}
		
		public ListNode removeNthnode(ListNode head, int n) {
			
			// create a dummy node
			
			ListNode dummy = new ListNode(-1);
			dummy.next=head;
			
			ListNode firstptr = dummy;
			ListNode secondptr= dummy;
			
			// move the second pointer n spaces ahead of first
			
			for(int i=0;i<n;i++) {
				
				secondptr = secondptr.next;
			}
			
			// now move each ptr until second ptr.next reaches null(end of the node)
			
			
			
			while(secondptr.next!=null) {
				
				firstptr = firstptr.next;
				secondptr= secondptr.next;
			}
			
			// now remove the element next to first ptr which is the nth node
			
			firstptr.next=firstptr.next.next;
			
			return dummy.next;
			
		}
	}
	
	
	
		
	


