package com.ct.Strings;

public class ValidPalindrome {
	
	// LC 125 
	// LC 9 for numbers 
	
	public static void main(String[] args) {
		
		//String s = "A man, a plan, a canal: Panama";
		
		String s = "race a car";
		
		System.out.println(isPalindrome(s));
		
	}
	
	/*
	 * public static String replaceSpecial(String s) {
	 * 
	 * String pattern = "[^a-zA-Z0-9\\s]";
	 * 
	 * s=s.replace(pattern, "");
	 * 
	 * return s; }
	 */
	public static boolean isPalindrome(String s) {
		
		//if(s.length()==0) return false;
		
		
		s= s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		//s = s.replace(" ", "");
		//s = replaceSpecial(s);
		
		int left = 0;
		int right = s.length()-1;
		
		while(left<=right) {
			
			if(s.charAt(left)!=s.charAt(right)) {
				
				return false;
			
			}	
			

			left++;
			right--;	
			
			
		}
		
		return true;
	
	}

}
