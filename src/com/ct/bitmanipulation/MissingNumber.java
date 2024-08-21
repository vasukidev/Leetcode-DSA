package com.ct.bitmanipulation;

import java.util.Arrays;

public class MissingNumber {
	
	// LC 268
	
	// reference https://www.youtube.com/watch?v=iCrQG_kbuP0
	
	public static void main(String[] args) {
		
		


}

	  public int missingNumber(int[] nums) {

	        int xorAll = 0;

	        // xor all the numbers in [0,n] range

	        for(int i =0;i<=nums.length;i++){
	            xorAll= xorAll^i;


	        }

	        // now XOr the numbers in the given input

	        for(int num:nums){

	            xorAll = xorAll^num;
	        }

	        return xorAll;
	        
	    }
	
}
