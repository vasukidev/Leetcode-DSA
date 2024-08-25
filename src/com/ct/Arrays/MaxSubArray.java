package com.ct.Arrays;

public class MaxSubArray {
	
	// LC 53
	
	public static void main(String[] args) {
		
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		
		System.out.println(maxSubArray(nums));
	
		
	}
	
	   public static int maxSubArray(int[] nums) {

	       int current_sum = nums[0];
	       int max_sum = nums[0];

	       for(int i =1;i<nums.length;i++){

	        current_sum = Math.max(nums[i],nums[i]+current_sum);
	        max_sum = Math.max(current_sum,max_sum);


	       }

	       return max_sum;
	}

}
