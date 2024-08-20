package com.ct.sortsearch;

import java.util.Arrays;

// Tc average & worst - O(n2)
// Sc - O(1)
// Best TC O(n) swaps/count of swaps 

public class BubbleSort {
	
	// ascending and descending
	
	
	public static void main(String[] args) {
		
		// bubble sort using  integers
		
		int arr [] = {36,19,29,12,5,20};
		
		String str [] = {"vasuki","divya","ponduri"};
		
		int temp = 0;
		
		for(int i = 0;i<arr.length-1;i++) {
			// need to explain
			for(int j = 0;j<arr.length-1-i;j++) {
				
				// for descending <
				if(arr[j]>arr[j+1]) {
					
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		// bubble sort using string
		String temp1= null;
		for(int i = 0;i<str.length-1;i++) {
			
			for(int j = 0;j<str.length-i-1;i++) {
				
				int res = str[j].compareTo(str[j+1]);
				// compare to method return 0 if both strings are equal
				if(res>0) {
					
					temp1= str[j];
					str[j] =str[j+1];
					str[j+1] = temp1;
				}
				
				/*
				 * else {
				 * 
				 * System.out.println(" they're equal"); }
				 */
				
				
				
			}
		}
		
		System.out.println(Arrays.toString(str));
		
	}
	
	// bubble sort best time complexity
	
	
	
	
	

}
