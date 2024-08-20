package com.ct.BinarySearch;

public class UpperBound {
	
	
	// TC = O(log2n)
	
	// next greater not the number itself
	
	public static void main(String[] args) {

		int arr[] = {2,3,4,5,6,9};
		int target = 3;
		
		int n = arr.length;
		
		System.out.println(upperBound(arr, target, n));
	}

	
	// only finding the 
static int upperBound(int arr[], int target, int n) {
		
		
		int low = 0;
		int high = n-1;	
		int ans = n;
		while(low<=high) {
			
			
			int mid = low+(high-low)/2;
			
			
			if(arr[mid]>target) {
				
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
