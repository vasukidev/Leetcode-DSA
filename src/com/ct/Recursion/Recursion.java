package com.ct.Recursion;

public class Recursion {
	
	// Recursion 
	// Statements only before the function call are executed
	// Since there are no stmts after the function call all these executed functions will automatically come out of stack 
	
	
	private static int count = 0;
	private static int i = 0;
	private static int n = 5;
	
	public static void main(String[] args) {
		
		recrusiveCall();
		
		
		linearPrinting(i, n);
		
		linearPrint(n);
		
		
		
	}
	
	// count 0-4
	  public static void recrusiveCall() {
	  
	  System.out.println("******Recursion.recrusiveCall()******");
	  
	  if(count==4) return;
	  
	  System.out.println(" the count is " + count); count++;
	  
	  recrusiveCall();
	  
	  
	  }
	 
	// linear printing
	public static void linearPrinting(int i, int n) {
		
		System.out.println("Recursion.linearPrinting()");
		
		
		if(i>n) return ;
		
		System.out.println(" the value of " + i);
		
		linearPrinting(i+1, n);

}
	// linear descending print 5-0
	public static void linearPrint(int n) {
		
		if(n==0) return;
		
		System.out.println(" the value of " + n);
		
		linearPrint(n-1);
	}
	
}
