package com.ct.Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
	
	// LC 3
	
	// https://leetcode.com/problems/longest-substring-without-repeating-characters/
	
	public static void main(String[] args) {
		
		String str = "abcdefghab";
		
		//System.out.println(lenOfLong(str));
		
		System.out.println(lenOfSubStr(str));
		
	}
	
	// 1st approach
	// brute force approach
	// TC O(n2) - 2 loops
	// Sp O(n) Hash set for storing chars 
	public static int lenOfLong(String str) {
		
		int maxLen = Integer.MIN_VALUE;
		
		for(int i=0;i<str.length();i++) {
			
			// create a set to add j unique chars
			Set<Character> hs = new HashSet<Character>();
			
			for(int j=i;j<str.length();j++) {
				// we should check with the char at jth index so charAt
				if(hs.contains(str.charAt(j))) {
					
					maxLen = Math.max(j-i, maxLen);
					// it's imp to break the loop
					break;
				}
				
				hs.add(str.charAt(j));
			}
		}
		
		return maxLen;
	}
	
	// 2nd approach
	// optimized approach using Hash set
	// TC O(n) - only one loop SC O(n) - Using Hash set
	//We will have two pointers left and right. Pointer ‘left’ is used for maintaining the starting point of the substring while
	//‘right’ will maintain the endpoint of the substring.’ right’ pointer will move forward and check for the duplicate 
	//occurrence of the current element if found then the ‘left’ pointer will be 
	//shifted ahead so as to delete the duplicate elements.
	public static int lenOfSubStr(String str) {
		
		if(str.length()==0) return 0;
		
		int l = 0;
		int maxLen = Integer.MIN_VALUE;
		
		Set<Character> set = new HashSet<Character>();

		for(int r=0;r<str.length();r++) {
			
			
			// if condition 
			if(set.contains(str.charAt(r))) {
				
				// while loop again 
				
				while(l<r && set.contains(str.charAt(r))) {
					
					// remove  l if duplicate if found
					set.remove(str.charAt(l));
					// as soon as duplicate is found will move left pointer
					l++;
					
					
				}
			}
			// if not present add
			set.add(str.charAt(r));
			//  keep updating the max length as we move forward without duplicates 
			maxLen = Math.max(maxLen, r-l+1);
		}
		
		return maxLen;
		
		
	}
	
	// 3rd approach
	//In this approach, we will make a map that will take care of counting the elements and maintaining 
	//the frequency of each and every element as a unity by taking the latest index of every element.
	// doubt https://takeuforward.org/data-structure/length-of-longest-substring-without-any-repeating-character/
	public static int lengOfSubStr(String str) {
		
		
		return 0;
		
	}

}
