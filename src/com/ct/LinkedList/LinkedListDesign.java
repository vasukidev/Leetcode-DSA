package com.ct.LinkedList;



public class LinkedListDesign {
	
	//SLL Design
	
	// create pointers to access
	
	Node start;
	Node last;
	Node temp;
	
	
	// create node structure standard
	class Node{
		
		int  data; // value
		Node next; // reference 
		
		Node(int data){			
			this.data = data;		
			this.next = null;
		}
		
		
	}
	
	
	// check if the LL is empty or not
	public void isEmpty() {
		
		if(start==null) {
			
			System.out.println(" The list is empty");
		}
		
		else {
			
			System.out.println(" the list is not empty");
		}
	}
	
	// O(n) TC because we are traversing from the start
	public void addStart(int data) {
		
		Node node = new Node(data);
		
		// fill start
		if(start==null) {
			
			start=node;
		}
		
		
		// if start is not null then traverse
		else {
			
			temp=start;
			
			while(start!=null) {
				
				temp=temp.next;
			
			}
			temp.next=node;
		}
	}
	
	// O(1) TC because we need not traverse from the beginning
	// create last ptr
	public void addLast(int data) {
		
		Node node = new Node(data);
		
		if(start==null) {
			
			// both start/last ptrs are pointing the one new node
			
			start=node;
			last = node;
		}
		
		
		// if there is already a new node
		else {
			
			temp=last;
			temp.next=node;
			temp=temp.next;
			last=temp;
			
			
		}
		
		
	}
	
	// O(n) TC because we need to know position 
	public void addPos(int data,int pos) {
		
		
		Node temp1;
		Node node = new Node(data);
		
		if(pos==1) {
			
			temp=start;
			start=node;
			start.next=temp;
		}
		
		else {
			
			temp=start;
			
			try {
			// ex pos = 3 goes until pos-1=2
			// take another temp1 point to prev temp next
			for(int i=1;i<pos-1;i++) {
				
				temp1=temp.next;
				temp.next=node;
				node.next=temp1;
				
			}
						
		}
			catch(NullPointerException e) {
				
				System.out.println("Posiiton not found");
			}
		}
	}
	
	
	public void delete(int pos) {
		
		Node temp1= start.next;
		temp=start;
		
		
		if(pos==1) {
			
			start=start.next; // start ptr to temp1 now 
		}
		
		else {
			
			
			temp=start;
			try {
			
			for(int i=1;i<pos-1;i++) {
				
				temp=temp.next;
				temp1=temp1.next;
			}
			
			// the element at position will be dleeted by poiting it's prev to next 
			temp.next=temp1.next;
		}
			
			catch (NullPointerException e) {
				System.out.println("Position not found");
			}
		}
	}
	
	public void search(int key) {
		
		
		int flag = 0;		
		int data=0;	
		temp=start;
		
	        while(temp!=null) {
			
			if(temp.data==key) {
				
				flag=1;		
				System.out.println(" Key found");
				break;				
				
			}
			
			temp=temp.next;	// move to the next like i++ increment		
		}
	
	if(flag==0) {
		
		System.out.println("Key not found");
	}
		
		
	}
	
	public void display() {
		
		
		temp = start;
		
		while(temp!=null) {
			
			System.out.print(" print values " + temp.data);
			
			temp=temp.next; // move to the next like i++ increment
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		LinkedListDesign ll = new LinkedListDesign();
		
		// call all the methods and perform 
		
	}
	
	

}
