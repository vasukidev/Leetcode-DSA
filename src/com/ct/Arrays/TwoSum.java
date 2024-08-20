package com.ct.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
	// LC 1 
	// submitted 
	
	public static void main(String[] args) {
		int arr [] = {3,4,5,1,2,7};
		int target = 6;
		
		System.out.println(twoSum(arr, target));
		
	}
	
	public static int[] twoSum(int [] arr, int target) {
		
		HashMap<Integer, Integer> hm = new HashMap();
		
		for(int i=0;i<arr.length;i++) {
			
			int complement = target-arr[i];
			
			if(hm.containsKey(complement)) {
				
				int newArr [] = {hm.get(complement),i};
				
				System.out.println(" The result is " + Arrays.toString(newArr));
				
				return newArr;
			}
			
			hm.put(arr[i], i);
		}
		
		
		return null;
	}

}
