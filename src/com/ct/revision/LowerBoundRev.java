package com.ct.revision;

public class LowerBoundRev {
	
	// the given number is greater than or equal to the number at the index
	public static void main(String[] args) {
		
		int arr[] = {3,5,8,15,19};
		
		int target = 16;
		
		int start = 0;
		int end = arr.length-1;
		
		System.out.println(lowerBound(arr, target, start, end));
		
	}
	
	
	public static int lowerBound(int arr[], int target, int start, int end) {
		int ans = arr.length;
		
		while(start<=end) {
			
			int mid = start + (end-start)/2;
			
			
			if(arr[mid]>=target) {
				
				ans = mid;
				end = mid-1;
				
				
				return mid;
				//return arr[mid];
			}
			
		
			
			else {
				
				start = mid +1;
			}
		}
		
		
	return ans;	
		
		
	}

}
