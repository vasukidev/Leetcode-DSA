package com.ct.BinarySearch;

public class FindSingleELement {
	
	// LC 540
	
	public static void main(String[] args) {
		
		
		int [] arr = {1,1,2,3,3,4,4,8,8};
		
		System.out.println(findSingleELement(arr));
	}
	
	
	static int findSingleELement(int [] nums) {
		
		int start = 0;
		int len = nums.length;
		int end = nums.length-1;
		// basic conditions 
		if(len==1) {
			
			return nums[0];
		}
		
		if(nums[0]!=nums[1]) {
			
			return nums[0];
		}
		
		if(nums[len-1] != nums[len-2]) {
			
			return nums[len-1];
		}
		
		
		while(start<=end) {
			
			int mid = start +(end-start)/2;
			
			if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])return nums[mid];
			
			
			if(mid%2==1 && nums[mid]==nums[mid-1]) {
				
				start = mid +1;
			}
			
			else if(mid%2==1) {
				
				end = mid -1;
			}
			
			else if(mid%2==0 && nums[mid] == nums[mid-1]) {
				
				end = mid -2;
			}
			
			else {
				
				start = mid +1;
			}
		}
		
		
		return 0;
	}

}
