package com.ct.Strings;

import java.util.Stack;

public class ValidParentheses {
	
	// LC - 20
	// TC O(n) tarverse once 
	// SC O(n) using extra space to store characters
	
	public static void main(String[] args) {
		
		String s = "]()";
		
		System.out.println(validParentheses(s));
		
	}
	
	
	public static boolean validParentheses(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char c:s.toCharArray()) {
			
			if(c=='(') {
				stack.push(')');
			} else if(c=='{') {	
				stack.push('}');
			} else if(c=='[') {		
				stack.push(']');
			}
			
			
			// pop will look for top element and remove it 
			// is string starts with open bracket and pop is not equal to c and stakc is empty still it should return false
			//We are doing this to check if the stack becomes empty without matching all the brackets
			else if(stack.isEmpty() || stack.pop()!=c) {
				
				
				return false;
				
			}
		}
		
		return stack.isEmpty();
		
		
	}

}
