package com.ct.Recursion;

public class ParamRecursion {
	
	public static void main(String[] args) {
		
		//paramRecursion(3, 0);
		
		findFactorial(1, 4);
		
	}
	// sum
	public static void paramRecursion(int n , int sum) {
		
		if(n==0) {
		// print totat sum when n==0 i.e. 6 and return the control
		System.out.println(" the sum is " + sum);
		
		return;
		}
		
		paramRecursion(n-1, sum+n); // executes for funct(2,3) funct(1,5) funct(0,6)
		
		
		
	}
	
	// factorial
	public static void findFactorial(int mul,int n) {
		
		if(n==1) {
			
			System.out.println(" the fact of a given number is " + mul);
			
			return;
		}
		
		
		findFactorial(mul*n, n-1);
		
		
	}

}
