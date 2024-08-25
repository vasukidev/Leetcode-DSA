package com.ct.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
	
	// LC 17
	// TC is O(digits to the power of max letters)
	// in this case O(2n)
	// this is only recursion not back tracking
	private static final  String[] keys = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		
	
	public static void main(String[] args) {
		
		System.out.println(letterCombinations("23"));

		
	}
	
	 public static List<String> letterCombinations(String digits) {

		   List<String> result = new ArrayList<>();
		   // basic null check
		   // check inputs given in the question
			if(digits==null || digits.length()==0) {
				
				return result;
			}
			
			combination("", digits, 0, result);
			
			return result;

	     
	    	}
	
    public static void combination(String prefix, String digits, int index, List<String> result) {
    	
		// base condition to add all the combinations to the list
    	//if exceeds the index of digits
	if(index>=digits.length()) {
		result.add(prefix);
		
		return;	
	}
	// get letters at each digit for ex at 2 digit we've "abc"
	// because we don't have anything in 0 index so exclude index 0
	String letters = keys[digits.charAt(index)-'0'];
	
	System.out.println(" the letters at the digit are " + letters);
	    // iterate over each letter 
	    for(int i =0;i<letters.length();i++) {
		// append each letter to the empty prefix string to form combinations
		// increments index of the digits
		combination(prefix+letters.charAt(i), digits, index+1, result);
		
	
	}
}

}
