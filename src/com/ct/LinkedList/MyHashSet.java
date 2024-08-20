package com.ct.LinkedList;

import java.util.HashSet;
import java.util.LinkedList;

public class MyHashSet {
	
	LinkedList<Entry> [] set;
	
	
	private final int size = 769;
	
	
	
	public MyHashSet() {
		
		set = new LinkedList[size];
				
	}
	
	
	// hash set add
	public void add(int key) {
		
		int bucket = key%size;
		
		LinkedList<Entry> ll;
		
		
		// if bucket is null
		// create a new LL and add entry
		if(set[bucket]==null) {
			
			set[bucket] = new LinkedList<Entry>();
			
			set[bucket].add(new Entry(key));
					
			return;
		}
		
		else {
			
			for(Entry entry:set[bucket]) {
				
				if(entry.key==key) {
				
				entry.key=key;			
			}
			}
		}
		
		set[bucket].add(new Entry(key));
	}
	
	// Hash set remove
	public void remove(int key) {
		
        int bucket = key%size;
		
		if(set[bucket]==null) {
			
			return;
			
			
		}
		
		else {
			
			Entry toremove=null;
			for(Entry entry: set[bucket]) {
				
				if(entry.key==key) {
					
					toremove=entry;
					
					
				}
			}
		}
		
		
	}
	
	
	// hash set contains
	public boolean containsKey(int key) {
		
		boolean flag = false;
		
		
		int bucket = key%size;
		
		if(set[bucket]==null) {
			
			return flag;
			
			
		}
		
		else {
			
			for(Entry entry: set[bucket]) {
				
				if(entry.key==key) {
					
					flag = true;
					
					return flag;
				}
			}
		}
		
		return flag;
	}
	
	
	class Entry{
		
		int key;
		
		public Entry(int key) {
			
			this.key=key;
			
			
		}
	}

}
