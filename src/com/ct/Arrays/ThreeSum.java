package com.ct.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	
	// LC 15
	
	public static void main(String[] args) {
		
		int nums [] = {-1,0,1,2,-1,-4};
		
		
		System.out.println(find3Sum(nums));
	}
	
	public static List<List<Integer>> find3Sum(int [] arr){
		
		
		 // basic sanity check
         if(arr.length<3 || arr==null) {
			return new ArrayList<>();
		}
		
		 // sort the elements
		   Arrays.sort(arr);
		
		// create a Hash set  in order to add all the unique elements
	       Set<List<Integer>> result = new HashSet<>();
		
		// fix the first element and find the other two
		for(int i = 0;i<arr.length-2;i++) {
			
			int start = i +1;
			int end = arr.length-1;
			
			while(start<end) {	
			
			int sum = arr[i] + arr[start] + arr[end];
			
			if(sum==0) {
				
				// add the result and move to find other triplets
				
				result.add(Arrays.asList(arr[i],arr[start],arr[end]));
				

               start++;
               end--;
			}
			
			
			else if(sum<0) {
				
				start++;
			}
			else {
				
				end--;
			}
			
			
		}
		
		}
		
		return new ArrayList<>(result);
		
				
	}

}
