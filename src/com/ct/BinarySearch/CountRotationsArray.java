package com.ct.BinarySearch;

public class CountRotationsArray {
	
	// explain constraints
	
	// merge sort
	
	// gfg
	
	static int min = Integer.MAX_VALUE;
	static int ans = 0;
	
	
	public static void main(String[] args) {
		
		
		System.out.println(KRotation());
		
		
		
	}
	
	
	static int KRotation() {
	int arr[] =  {5, 1, 2, 3, 4};
		//int arr[] =  { 1, 2, 3, 4,5};
	
	int start = 0;
	
	int end = arr.length-1;
	
	
	
	if(arr[start]<=arr[end]) 
		return 0;
	
	    ans = 0;
	    // need to understand
	min = Integer.MAX_VALUE;
	
	binarySearch(arr, start, end);
	
	return ans;
	}
	
	
	static void binarySearch(int arr[], int start, int end) {
		
	
		// need to understand
		if(start> end) {
			return;
			
		}
		 int mid = start+(end-start)/2;
		if(arr[start]<=arr[mid]) {
		if(arr[start]<min) {
			
			
			ans = start;
			min = arr[start];
			
			
			
			
		}
		binarySearch(arr, mid+1, end);
		}
		else {
			
			if(arr[mid]<min) {
				
				ans = mid;
				min = arr[mid];
				
				
				
			}
			binarySearch(arr, start, mid-1);
		}
	}

}
