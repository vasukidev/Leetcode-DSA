package com.ct.sortsearch;

public class BinarySearchIterative {
	
	//SC - O(1)
	//TC Average & Worst O(logn)
	//TC Best O(1)
	// Divide and conquer logerithemic approach
	// should be applied on sorted array
	
	public static void main(String[] args) {
			
		int [] arrr = {1,3,4,5,7};
		int start = 0;
		int end = arrr.length-1;
		
		int target = 7;
		
		System.out.println(binarysearch(arrr, target, start, end));
		
	}
	
	
	static int binarysearch(int [] arr, int target, int start, int end) {
		
	
		while(start<=end) {
			
			
			int mid = start+(end-start)/2;
			
			if(arr[mid]==target) {
			return mid;
			}
			
			
			else if(arr[mid]>target) {
				
				end = mid-1;
			}
			
			else {
				
				start = mid +1;
			}
		}
		
		
		
		return 0;
	}

}
