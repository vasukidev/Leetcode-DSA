package com.ct.sortsearch;

import java.util.Arrays;


//TC = O(n2) Best,worst and Avg
//sc = O(1)


public class SelectionSort {
	
	public static void main(String[] args) {
		
		int arr [] = {9,19,12,4,5};
		
		for(int i = 0;i<arr.length-1;i++) {
			
			int min_index = i;
			
			for(int j = i+1;j<arr.length;j++) {
				
				if(arr[j]<arr[min_index]) {
					
					min_index = j;
				}
				
				
				int temp = arr[min_index];
				arr[min_index] = arr[i];
				arr[i] = temp;
				
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
