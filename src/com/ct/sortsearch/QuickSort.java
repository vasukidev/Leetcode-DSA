package com.ct.sortsearch;

public class QuickSort {
	
	// best TC = O(nlogn)
	// Average = O(nlogn)
	// worst O(n2)
	// space O(logn)
	
	// diff between nlog and logn
	
	public static void main(String[] args) {
		
	}
	
	
	public static void quickSort(int arr[], int start, int end) {
		
		
		if(start>end) return ;
		
		while(start<=end) {
			
			int mid = start + (end-start)/2;
			int pivot = arr[mid];
			
			if(start<=pivot) {
				
				
			}
			
			
		}
		
		
	}

}
