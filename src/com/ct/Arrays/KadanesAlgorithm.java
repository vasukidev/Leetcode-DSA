package com.ct.Arrays;

public class KadanesAlgorithm {
	
	// max sum sub array
	
	// TC O(n)// LC 238
	// Not submitted
	
	
	public static void main(String[] args) {
		
		
		//int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		int [] arr = {-1};
		
		int negans = Integer.MIN_VALUE;
		
		int sum = 0;
		int count = 0;
		
		int max_sum = Integer.MIN_VALUE;
		
		for(int i =0;i<arr.length;i++) {
			
			sum = sum + arr[i];
			
			if(sum<0) {
				
				sum = 0;
			}
			
			else {
				
				 max_sum = Math.max(sum, max_sum);
			}
			
			
			// handling exception
			if(arr[i]<=0) {
				
				count++;
				
				negans = Math.max(negans, arr[i]);
			}
			
			
		}
		
		if(count==arr.length) {
			
			System.out.println(" tha negans is " + negans);
			
			
		}
		
		else {
			System.out.println(" tha max sum is " + max_sum);		
			
			
		}
				
		
	}

}
