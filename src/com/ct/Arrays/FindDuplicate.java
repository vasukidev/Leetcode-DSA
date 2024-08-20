package com.ct.Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
	
	// n+1 integers
	// LC - 287 
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,3};
		
		System.out.println(findDupl(arr));
		
	}
	
	public static int  findDupl(int [] arr) {
		
		
		Set<Integer> hs = new HashSet();
		
		// works with for each
		
		for(int num:arr) {
			
			if(hs.contains(num)) {
				
				return num;
				
				
			}
			hs.add(num);
		}
		
		return -1;
		
	}

}
