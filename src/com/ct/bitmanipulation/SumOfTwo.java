package com.ct.bitmanipulation;

public class SumOfTwo {
	
	
	public static void main(String[] args) {
		
		
		int a = 9;
		int b = 11;
		
		System.out.println(sumOfTwo(a, b));
		
	}
	
	public static int sumOfTwo(int a , int b) {
		
		while(b!=0) {
			
			int temp = (a&b)<<1;
			
			a=a^b;
			b= temp;
		}
		
		return a;
	}

}
