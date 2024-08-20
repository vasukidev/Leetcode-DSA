package com.ct.revision;

public class UpperBoundRev {
	
	// just greater than the target
	
	public static void main(String[] args) {
		
        int arr[] = {3,5,8,15,19};
		
		int target = 8;
		
		int start = 0;
		int end = arr.length-1;
		
		System.out.println(upperBound(arr, target, start, end));
		
	}
	
	public static int upperBound(int arr[], int target, int start, int end ) {
		
		int ans = arr.length;
				
		while(start<=end) {
			
			int mid = start+(end-start)/2;
			
			
			if(arr[mid]>target) {
				
				end = mid-1;
				
				return mid;
				
				
			}
			
			else {
				
				start = mid+1;
			}
		}
		
		return ans;
		
		
	}

}
