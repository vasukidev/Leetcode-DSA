package com.ct.LinkedList;
import java.util.LinkedList;

public class MyHashMap {
	
	// Design HashMap
	
	
	LinkedList<Entry>[] map; // LinkedList of type Entry so that we can add k.v
	
	private final static int size = 769;
	
	public MyHashMap() {
		
		map = new LinkedList[769];
		
	}
	
	
	// put function
	public void put(int key,int value) {
		
		int bucket = key%size;
		
		if(map[bucket]==null) {
			
			map[bucket] = new LinkedList();
			map[bucket].add(new Entry(key,value)); // list so add function
			
			
		}else {
			
			for(Entry entry:map[bucket]) {
				
				if(entry.key==key) {
					
					entry.value=value;
					
					return;
				}
			}
			
			
			map[bucket].add(new Entry(key,value));
			
		}
		
		
	}
	// get function 
	public int get(int key) {
		
		int bucket = key%size;
		
		LinkedList<Entry> ll = map[bucket];
		
		if(ll==null) {
			
			return -1;
		}
		
		for(Entry entry: ll) {
			
			if(entry.key==key) {
				
				return entry.value;
			}
			
		}
		
		return -1;
	}
	
	// remove fucntion
	public void remove(int key) {
		
		int bucket = key%size;
		
		LinkedList<Entry> ll = map[bucket];
		
		if(ll==null) {
			
			return;
		}
		
		else {
		
		for(Entry entry:ll) {
			
			if(entry.key==key) {
				
				ll.remove(entry);
				return;
			}
			
			
		}
		}
	}
	
	// custom Entry class to put k,v pair
	class Entry {
		
		int key;
		int value;
		
		Entry(int key, int value){
			
			this.key=key;
			this.value=value;
			
			
		}
	}

}
