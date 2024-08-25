package com.ct.BinarySearch;

public class FindMinInRotatedSortedArray {
	
	public static void main(String[] args) {
		
		
		int [] nums = {3,4,5,1,2};
		
		System.out.println(findMin(nums));
	}
	
	public static int findMin(int nums []) {
		int low = 0;
		int high = nums.length-1;
		
		while(low<high) {
			
			int mid = low + (high-low)/2;
			
			
			// to get rid off half of the sorted array
			//check if the mid element is greater than the right
			// and search accordingly
			if(nums[mid]>nums[high]) {
				
				low = mid +1;
				
				
			}
			
			else {
				
				// otherwise search in the first half 
				high = mid;
				
			}
			
			
		}
		
		return nums[low];
		
		
		
		
		
	}

}
