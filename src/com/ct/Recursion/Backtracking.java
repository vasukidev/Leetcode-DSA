package com.ct.Recursion;

public class Backtracking {
	
	// stmts after function call will be executed for all teh test cases apart from the base condition 
	
	public static void main(String[] args) {
		
		int n = 5;
		
		
		//linearPrint(n);
		linearPrinting(1, 5);
		
	}
	
		public static void linearPrint(int n) {
			
			System.out.println("Backtracking.linearPrint()");
			
			if(n==0) return;
			
			linearPrint(n-1);
			
			System.out.println(" the value of " + n);
		}
		// 5-1
		public static void linearPrinting(int i , int n) {
			
			System.out.println("Backtracking.linearPrinting()");
			
			if(i>n) return;
			
			linearPrinting(i+1, n); // start storing in the stack first 
			
			System.out.println(" the value of i is " + i); // and then print in the end from top to bottom (LIFO) Last in first out
		}
		
	

}
