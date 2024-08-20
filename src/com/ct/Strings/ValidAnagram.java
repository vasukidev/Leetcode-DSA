package com.ct.Strings;

public class ValidAnagram {
	
	// LC 242
	
	public static void main(String[] args) {
		
		String s = "anagram";
		String t = "nagaram";
		
		System.out.println(isAnagram(s, t));
		
	}
	
	
	public static boolean isAnagram(String s, String t) {
		
		
		boolean flag = false;
		// convert to lower case to ignore case match
		s = s.toLowerCase();
		 t = t.toLowerCase();
		 
		 
		 // remove spaces to handle phrases as inputs
		 s = s.replace(" ", "");
		t= t.replace(" ", "");
		
		
		// intialise bucket array for all the alphabet chars
		int [] counts = new int[26];
		
		
		// fill up the bucket ++
		for(int i = 0;i<s.length();i++) {
			
			counts[s.charAt(i)-'a']++;
			
			
		}
		
		// empty the bucket --
		for(int i=0;i<t.length();i++) {
			
			counts[t.charAt(i)-'a']--;
					
		}
		
		// calc the count of every element after emptying it should be zero
		for (int count : counts) {
			
			// if not equal to 0 then return false
			if(count!=0) {
				
				return false;
			}
					
		}
			
		return true;
		
		
		
	}

}
