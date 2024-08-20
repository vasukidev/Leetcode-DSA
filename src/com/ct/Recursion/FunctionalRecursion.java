package com.ct.Recursion;

public class FunctionalRecursion {
	
	public static void main(String[] args) {
		
		// whatever parameter we are passing we need the output of only that integer.
		//System.out.println(funcRecursion(3));
		
		
		System.out.println(findFactorial(4));
		
	}
	
	public static int funcRecursion(int n) {
		
		if(n==0) {
			
			return 0;
		}
		//System.out.println(n+funcRecursion(n-1));
		return n + funcRecursion(n-1);
	}
	
	
	public static int findFactorial(int n) {
	
		if(n==1) {
			
			return 1;		
		}
		
		return findFactorial(n-1)*n;
	}

}
