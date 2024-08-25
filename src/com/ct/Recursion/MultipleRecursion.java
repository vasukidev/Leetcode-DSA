package com.ct.Recursion;

public class MultipleRecursion {
	
	// Fibonnaci
	
	public static void main(String[] args) {
		
		int n = 4;
		
		// Loop to print the Fibonacci series up to the specified number
		  for(int i=0;i<n;i++) {
		  
		  System.out.print(fibonacci(i) + " "); 
		  }
		 
		System.out.println();
		System.out.print("The final value after adding the two preceedents "+fibonacci(n));
	}
	
	public static int fibonacci(int n) {
		
		if(n<=1) return n;
		
		
		  int prev = fibonacci(n-1); 
		  int prevPrev = fibonacci(n-2);
		  
		  
		  System.out.println(" adding if all the two values " + prev+prev);
		  return prev+prevPrev;
		 
		
		// Recursive case: Calculate Fibonacci by summing the two preceding numbers
		//return fibonacci(n-1)+fibonacci(n-2);
		
		
	}

}
