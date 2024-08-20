package com.ct.revision;

public class FindPeakRev {

	
	
	public static void main(String[] args) {
		int arr [] = {1,2,1,3,5,6,4};
		
		System.out.println(findPeak(arr));
	}
	
	public static int findPeak(int arr[]) {
		
		int low = 1;
		int high = arr.length-2;
		
		int n = arr.length;
		
		if(n==1) {
			
			return 0;
		}
		
		else if(arr[0]>arr[1]) {
			
			return 0;
		}
		
		
		else if (arr[n-1]>arr[n-2]) {
			
			return n-1;
		}
		
		
		while(low<=high) {
			
			int mid = low+(high-low)/2;
			
			
			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
				
				return mid;
			}
			
			
			if(arr[mid]>arr[mid-1]) {
				
				low = mid +1;
			}
			
			else {
				
				high = mid -1;
			}
			
			
		}
		
		return -1;
	}
}
