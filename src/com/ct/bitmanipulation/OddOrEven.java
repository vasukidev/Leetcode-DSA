package com.ct.bitmanipulation;

public class OddOrEven {
	
	// Time and Space Complexity O(1)
	
	public static void main(String[] args) {
		
		
		int num = 9;
		System.out.println(oddOrEven(num));
		
	}
	
	public static String oddOrEven(int number) {
		
		int val = number&1;
		
		if((number&1)==0) {
			
			
			
			System.out.println(" the 10th place of binary " + val);
			
			return " number is even";
			
			
		}
		
		else {
			
			
			System.out.println(" the 10th place of binary " + val);
			
			return "number is false";
		}
		
		
	}

}
