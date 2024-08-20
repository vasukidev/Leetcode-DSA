package com.ct.sortsearch;

import java.util.Arrays;

// TC = O(n) Best
// TC = O(n2) - Worst&Average
// SC = O(1)
// all the elements will be pushed left side for sorting

public class InsertionSort {

	
	public static void main(String[] args) {
		
		
		int arr [] = {3,4,2,5,6};
		
		
		
		for(int i =0;i<arr.length-1;i++) {
			
			for(int j = i+1;j>0;j--) {
				
				
				if(arr[j-1]>arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				}
				else {
					
					break;
				}
				
			}
		}
		
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	
}
