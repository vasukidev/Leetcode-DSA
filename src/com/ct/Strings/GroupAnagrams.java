package com.ct.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	
	//LC 49
	
	
	
	public static void main(String[] args) {
		
		
		String [] strs = {"eat","tea","tan","ate","nat","bat"};
		
		System.out.println(categorizeBySorting(strs));
		
	}
	
	// Method 1 
	// TC O(nlogk) because of sorting 
	// SC O(n) HashMap DS 
	public static List<List<String>> categorizeBySorting(String [] strs){
		
		// basic null check 	
		if(strs.length==0 || strs == null) {
			
			return new ArrayList<>();
		}
			
		Map<String,List<String>> hashmap = new HashMap();
		
		for (String string : strs) {
			
			char c [] = string.toCharArray();
			
			// first sort the chars of the string 
			Arrays.sort(c);
			
			// after sorting each and every char array converting the primitive to String
			String key = String.valueOf(c);
			
			// if map doesn't contain then add the key and create a new empty array list
			if(!hashmap.containsKey(key)) {
				
				hashmap.put(key, new ArrayList<>());
			}
				
				// if map already contains the key then add the unsorted i.e. string iterated from the array of strings to the corresponding sorted value
				hashmap.get(key).add(string);	
			
		}
		
		List<List<String>> resultList = new ArrayList<List<String>>();
		// iterating over entry set over all the K,V pairs and getting value from each entry and adding those to the result list
		for(Map.Entry<String,List<String>> anagram: hashmap.entrySet()) {
			
			resultList.add(anagram.getValue());
			
			
		}
		
		return resultList;
	}
	
}


