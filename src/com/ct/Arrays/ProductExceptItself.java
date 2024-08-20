package com.ct.Arrays;

import java.util.Arrays;

// LC 238
// submitted

public class ProductExceptItself {
	
	public static void main(String[] args) {
		
		int arr [] = {2,1,3,4};
		
		System.out.println(findProduct(arr));
		
		
		
	}
	
	public static String findProduct(int [] nums) {
		
		
		// create two arrays to store the right and left elements
		int [] left = new int[nums.length];
		int [] right = new int[nums.length];
		
	
		
		// left position 
		left[0]=1;
		for(int i =1;i<nums.length;i++) {
			
			left[i] = left[i-1]*nums[i-1];
			
			
		}
		
		// right position
		right[nums.length-1]=1;
		for(int i=nums.length-2;i>-1;i--) {
			
			right[i]=right[i+1]*nums[i+1];
		}
		
		
		// product of the right and left elements in its position
		
		// create an ans array to store all the product elements
		int [] ans = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			
			ans[i] = left[i]*right[i];
		}
		
		
		return Arrays.toString(ans);
		
	}

}
