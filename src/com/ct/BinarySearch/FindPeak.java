package com.ct.BinarySearch;

public class FindPeak {
	
	// explain constraints
	
	// Submitted LC-162
	
	public static void main(String[] args) {
		
		//int arr [] = {1,2,3,1};
	
		// why not the first element
		int arr [] = {1,2,1,3,5,6,4};
		
		System.out.println(findPeak(arr));
		
	}
	
	
	static int findPeak(int [] arr) {
		
		
		int n  = arr.length;
		
		if(n==1) {
			
			// if the array has only 1 integer then there is nothing to compare return 0
			
			return 0;
		}
		if(arr[0]> arr[1]) {
			
			// if the first ele is greater than the 2nd return ele at 0th index as peak
			
			return 0;
		}
		
		else if (arr[n-1]>arr[n-2]) {
			
			// if last ele > 2nd last return last element as peak
			
			return n-1;
		}
		
		
		int low = 1;
		int high = n-2;
		
		
		while(low<=high) {
			
			int mid = low + (high-low)/2;
			
			
			// check the neighbours of mid and return mid as peak
			
			if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]) {
				
				return mid;
			}
			
			
			
			if (arr[mid]>arr[mid-1]) {
				
				low = mid +1;
			}
			
			else {
				
				high = mid -1;
			}
		}
		
		
		
		
		return -1;
	}

}
