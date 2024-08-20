package com.ct.BinarySearch;

public class FloorCeil {
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		
		int target = 7;
		
		int n = arr.length;
		
		System.out.println(findFloor(arr, target, n));
		
	}
	
	
	// find floor which means the immediate lower index
	static int findFloor(int arr [] , int target , int n ) {
		
		int low = 0;
		int high = n-1;
		int ans = n;
		
		
		while(low<=high) {
			
			
			int mid = low + (high-low)/2;
			
			
			if(arr[mid]<=target) {
				
				ans = mid;
				
				low = mid+1;
				
				
			}
			
			else {
				
				high=mid-1;				
				
			}
		}
		
		return ans;
	}

}
