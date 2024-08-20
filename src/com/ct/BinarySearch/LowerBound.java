package com.ct.BinarySearch;

public class LowerBound {
	
	public static void main(String[] args) {
		// it's called lower bound because if we have duplicate targets then it returns the lower index
		
		int arr[] = {2,3,4,5,6,7,7,9,9,9,9,9};
		int target = 7;
		
		int n = arr.length;
		
		System.out.println(lowerBound(arr, target, n));
		
	}
	
	// find ceil or lower bound which means finding the number itself or the next highest index
	static int lowerBound(int arr[], int target, int n) {
		
		
		int low = 0;
		int high = n-1;	
		int ans = n;
		while(low<=high) {
			
			
			int mid = low+(high-low)/2;
			
			
			if(arr[mid]>=target) {
				
				// target is small so go to left
				
				ans = mid;
				high = mid-1;			
								
			}		
			else {		
				
				// target is big so go to right
				low = mid +1;
			}		
		}
		// in worst case you'll return the length of the array
		return ans;
		
		
		
		
	}

}
