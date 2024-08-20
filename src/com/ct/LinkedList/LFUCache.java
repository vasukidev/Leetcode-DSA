package com.ct.LinkedList;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;


/*Design and implement a data structure for a Least Frequently Used (LFU) cache.

Implement the LFUCache class:

LFUCache(int capacity) Initializes the object with the capacity of the data structure.
int get(int key) Gets the value of the key if the key exists in the cache. Otherwise, returns -1.
void put(int key, int value) Update the value of the key if present, or inserts the key if not already present. When the cache reaches its capacity, it should invalidate and remove the least frequently used key before inserting a new item. For this problem, when there is a tie (i.e., two or more keys with the same frequency), the least recently used key would be invalidated.
To determine the least frequently used key, a use counter is maintained for each key in the cache. The key with the smallest use counter is the least frequently used key.

When a key is first inserted into the cache, its use counter is set to 1 (due to the put operation). The use counter for a key in the cache is incremented either a get or put operation is called on it.

The functions get and put must each run in O(1) average time complexity.*/

public class LFUCache {
	
	// create a cache map to store key as key and pair of f,v as value
   private Map<Integer, Pair<Integer,Integer>> cache;
	
	private Map<Integer,LinkedHashSet<Integer>> frequencies;
	
	int minf;
	int capacity;
	
	
	// custom pair class for freq and value as pair in the cache map as value
	class Pair<K,V>{
		
		int key;
		int val;
				
		
		Pair(int key,int val){
			
			this.key=key;
			this.val=val;
			
			
		}
		
		// add setter and getter methods to get the key
		public int getKey() {
			return key;
		}

		public void setKey(int key) {
			this.key = key;
		}

		public int getVal() {
			return val;
		}

		public void setVal(int val) {
			this.val = val;
		}


	}
	
	
	// define a hashmap with key as key and value as frequency and value
	
	
	public static void main(String[] args) {
		
	}
	
	
	// create constructor and initialize all the required values
	public LFUCache(int capacity) {
			
		cache = new HashMap<Integer, Pair<Integer,Integer>>();
		frequencies = new HashMap<Integer, LinkedHashSet<Integer>>();
		
		minf=0;
		
		this.capacity=capacity;
		
		
	}
	
	// insert function is for updating the new frequency and value that you get from put and get functions
	public void insert(int key,int frequency, int val) {
		
		// update the key and it's new frequency and value
		cache.put(key, new Pair<>(frequency,val));
		// to handle null pointer exception
		// putIfAbsent is pre defined method in map
		frequencies.putIfAbsent(frequency, new LinkedHashSet<Integer>());
		// add frequency as key
		frequencies.get(frequency).add(key);
		
		
	}
	
	// get function to get the frequency and update the table with new frequency 
	// return type should return the corresponding main value
	// input as key because from key we will get all the values 
	public int get(int key) {
		
		Pair<Integer,Integer> frequencyAndValue = cache.get(key);
		
		// key has no freq and value 
		if(frequencyAndValue==null) {
			return -1;
		}
		
		// if key has value
		int frequency = frequencyAndValue.getKey();
		
		Set<Integer> keys = frequencies.get(frequency);
		
		keys.remove(key);
		
		if(minf==frequency && keys.isEmpty()) {
			
			++minf;
		}
		
		// get the value from the pair 
		int value= frequencyAndValue.getVal();
		insert(key, frequency+1, value);
		return value;
			
			
	}
	
	// we will put two things key and value 

	public void put(int key, int value) {
		
		// if capacity is less than or equal to 0
		//return the control
		if(capacity<=0) {
			
			return;
		}
		
		
		// get the key 
		Pair<Integer,Integer> frequencyAndVal = cache.get(key);
		
		// if it's not null the update the cache map and update the frequency 
		
		if(frequencyAndVal!=null) {
			// in this step we are getting the key which is frequency that's already put and putting the corresponding value
			// and putting the key
			cache.put(key, new Pair<>(frequencyAndVal.getKey(),value));
			
			// by calling get we are trying to update the min frequency in the frequencies table
			get(key);
			
			return;
			
		}
		
		
		// delete 
		if(capacity==cache.size()) {
			
			 
			// get the keys through minf
			// to remove the main key from both the maps 
			
			Set<Integer> keys = frequencies.get(minf);
			
			int keytoDelete = keys.iterator().next();
			
			keys.remove(key);
			cache.remove(key);
			
			
		}
		
		minf=1;
		insert(key, 1, value);
		
		
	}
	
}
