package com.ct.Arrays;

public class MajorityELement {
	
	// n/2
	
	// moore's voting
	// most optimized 
	
	// LC 169
	
	
	public static void main(String[] args) {
		
		
		int [] nums = {2,2,1,1,1,3,5};
		
		System.out.println(findMajority(nums));
	}
	
	
	public static int findMajority(int [] nums) {
		
		int majority = nums[0];
		int votes = 1;
		
		for(int i =1;i<nums.length;i++) {
			
			
			if(votes==0) {
				
				votes++;
				majority=nums[i];
			} else if (majority==nums[i]) {
				
				votes++;
			}
			
			else {
				
				votes--;
			}
		}
		
		
		return majority; 
	}

}
