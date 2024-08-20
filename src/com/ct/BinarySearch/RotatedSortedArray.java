package com.ct.BinarySearch;

public class RotatedSortedArray {
	
	// apply binary search
	//O(logn) time complexity
	
	// explain constraints
	// search in a rotated sorted array
	// lc 33
	
	public static void main(String[] args) {
		
		
		int arr [] = {7,8,9,0,1,2,3,4,5,6};
		
		//int arr [] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int low = 0;
		int high = arr.length-1;
		
		int target = 12;
		
		System.out.println(searchRotatedArray(arr, target,low,high));
	}
	
	
	static int searchRotatedArray(int [] arr, int target, int low , int high) {
		
		//System.out.println("inside method");
		
		
		while(low<=high) {
			
			
			
			int mid = low +(high-low)/2;
			
			if(arr[mid]==target) {
				
				return mid;
			}
			
			else if(arr[low]<=arr[mid]) {
				if(arr[low]<=target && arr[mid]>=target) {
					
					high = mid -1;
				}
				
				else {
					
					low = mid +1;
				}
			}
			
			else {
				
				if(arr[mid]<=target && arr[high]>= target) {
					
					low = mid +1;
				}
				else {
					
					high = mid -1;
				}
			}
			
			
		
	}
		return -1;

}
	
}
