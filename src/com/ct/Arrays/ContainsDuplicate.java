package com.ct.Arrays;

import java.util.HashSet;

public class ContainsDuplicate {
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3};
		
		containsDuplicate(arr);
		
		
		
	}
	
	public static  boolean containsDuplicate(int [] arr) {

		//int [] arr = {1,2,3,1};		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int num :arr) {
			
			if(hs.contains(num)){
				
				System.out.println("yes it has duplicates");
				
				return true;				
			}
			
			hs.add(num);					
		}
		
		System.out.println(" it doesn't have duplicates");
		
		return false;
		
		
		
		
	}
	
	

}
