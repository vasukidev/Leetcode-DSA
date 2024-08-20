package com.ct.Arrays;

public class MissingRepeating {

	
	// LC 645
	// pending
	
	public static void main(String[] args) {
		 int [] arr = {1, 3, 3};
		 
		 int n = arr.length;
	}
	
	
	public static void find(int [] arr, int n) {
		
		int sumOfN = (n*(n+1))/2;
		
		int sum = 0;
		
		int sumOfsquares = 0;
		
		for(int i =0;i<n;i++) {
			
			sum+=i;
			
			sumOfsquares += i*i;
			
			
		}
		
		int x = sum;
		
		int y = sumOfN;
		
		int xSquare = sumOfsquares;
		
		
	}
}
