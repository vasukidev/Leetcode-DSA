package com.ct.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementHashMap {
	
	public static void main(String[] args) {
		
		int [] nums = {2,2,1,1,1,3,5};
		
		System.out.println(findMajority(nums));
		
	}
	
	
	public static Map<Integer, Integer> findMajority(int [] nums) {
		
		Map<Integer, Integer> hm = new HashMap();
		
		int count =0;
		
		for(int i =0;i<nums.length;i++) {
			
			if(hm.containsKey(nums[i])) {
				
				count++;
			}
			
			hm.put(nums[i], count);
			
		}
		
		return hm;
	}
}
