package com.ct.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartioning {
	
	/*
	 * Time Complexity: O( (2^n) *k*(n/2) )
	 * 
	 * Reason: O(2^n) to generate every substring and O(n/2) to check if the
	 * substring generated is a palindrome. O(k) is for inserting the palindromes in
	 * another data structure, where k is the average length of the palindrome list.
	 * 
	 * Space Complexity: O(k * x)
	 * 
	 * Reason: The space complexity can vary depending upon the length of the
	 * answer. k is the average length of the list of palindromes and if we have x
	 * such list of palindromes in our final answer. The depth of the recursion tree
	 * is n, so the auxiliary space required is equal to the O(n).
	 */
	
	public static void main(String[] args) {
		
	}
	
	public static List<List<String>> partition(String s){
		
		List<List<String>> result = new ArrayList<>();
		
		getPartition(s, 0, new ArrayList<String>(), result);
		
		return result;
		
		
	}
	
	
	
	public static void getPartition(String str,int curr,List<String> temp,List<List<String>> ans){
		
		if(curr==str.length()) {
			
			ans.add(new ArrayList<>(temp));
			
			return;
		}
		
		for(int i =curr;i<str.length();i++) {
			
			if(isPalindrome(str, curr, i)==true) {
				
				temp.add(str.substring(curr, i+1));
				
				getPartition(str, curr+1, temp, ans);
				temp.remove(temp.size()-1);
				
				
			}
			
		}
		
	}
	
	public static boolean isPalindrome(String str,int start,int end) {
		
		while(start<end) {
		
		if(str.charAt(start++)!=str.charAt(end--)) {
			
			return false;
		}
		
		
	}
		
		return true;
	}

}
