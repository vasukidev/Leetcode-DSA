package com.ct.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	
	int size;
	int currentSize;
	
	
	// declaring hashmap to store key and reference of the node as value i.e ListNode
	 Map<Integer,ListNode> map;
	
	
	
	// constructor with pre defined size and
	public LRUCache(int capacity) {
		
		this.size=capacity;	
		map = new HashMap<Integer, ListNode>();
		
	}
	
	
	// list node definition
	class ListNode{
		
		int key;
		int val;
		
		// can assign the values later
		ListNode next;
		ListNode prev;
		
		
		ListNode(int key,int val){
			
			this.key=key;
			this.val=val;
		}
	}
		
		
		public  int get(int key) {
					
			int temp =-1;
			
			if(map.containsKey(key)==false) {
				
				return temp;	
			}
			
			ListNode getNode = map.get(key);
			
			
			// test case if getNode is head
			if(getNode==head) {
				
				temp=head.val;
				
			}
			
			
			// test case if get node is tail
			else if(getNode==tail) {
				
				ListNode tailp = tail.prev;
				
				tail=tail.prev;
				tail.prev.next=null;
				tail.prev=null;
				tail.next=null;
				
				tail.next=head;
				head.prev=tail;
				head=tail;
				// update temp value always
				temp=head.val;
				// make sure the tail is also updated 
				tail=tailp;			
			}
			
			// test case if getNode is in between
			else {
				
				ListNode p = null;
				ListNode n = null;
				
				p=getNode.prev;
				n=getNode.next;
				
				p.next=n;
				n.prev=p;
				
				getNode.prev=null;
				getNode.next=null;
				
				getNode.next=head;
				head.prev=getNode;
				head=getNode;
				
				temp=head.val;
				
				
			}
			
			return temp;
			
			
		}
		
		ListNode tail=null;
		ListNode head=null;
		
		public  void put(int key, int val,int capacity) {
			
			// if key is already present then update it's value and move it to the top of hashmap/linkedlist
			
			    if(map.containsKey(key)==true) {
				ListNode update = map.get(key);
				
				update.val=val;
				
				get(key);// this get key will bring the key to the beginning of the hash map
				
				return;
				
				
			}
				
			ListNode newNode = new ListNode(key, val);
			// if current size is 0 and adding only one element then head tail both are pointing to the same
			if(currentSize==0) {
				
				newNode=head=tail;
				// increase the size first
				currentSize++;
		// finally put in map the queried key
				map.put(key, newNode);
				
				
				
				
			}
			
			else if(currentSize>=size) {
				
				if(currentSize==1) {
					
					// since size is one clear and then add
					
					
					head=tail=newNode;
					// first clear
					map.clear();
					// finally put in map the queried key
					map.put(key, newNode);
					
					
				}
				
				else {
					
					// if size is more remove/evict from the end
					// and move the newnode to the front and make it head
					
					map.remove(tail.key);
					
					tail=tail.prev;
					tail.next=null;
					newNode.next=head;
					head.prev=newNode;
					head=newNode;
					// finally put in map the queried key
					map.put(key, newNode);
					
					
				}
				
				
			} //else if ends
			
			else {
				// adding node in the front
				
				newNode.next=head;
				head.prev=newNode;
				head=newNode;
				// finally put in map the queried key
				map.put(key, newNode);
				
				currentSize++;
				
				
				
				
			} // else ends
			
			
		} // put ends
		public static void main(String[] args) {
			
			LRUCache cache = new LRUCache(4);
			
		}
	

}

