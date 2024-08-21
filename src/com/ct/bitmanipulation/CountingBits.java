package com.ct.bitmanipulation;

import java.util.Arrays;

public class CountingBits {
	
	// LC 338
	
	
	public static void main(String[] args) {
		
		
		int n = 2;
		
		System.out.println(countingBits(n));
		
	}
	
	public static int[] countingBits(int n) {
		
		int [] arr = new int[n+1];
		
		for(int i=0;i<=n;i++) {
			
			// bits are the no of 1s that we need to add in an array and return like a count 
			int bits=0;
			int mask=1; // to & with 1
			
			for(int j =0;j<32;j++) {
				
				if((mask&i)!=0) {
					bits++;
	
			}
			
			mask<<=1;
			
			
		}
			
			arr[i]=bits;
		
	}
		
		System.out.println(Arrays.toString(arr));

	return arr;
	
}
}
