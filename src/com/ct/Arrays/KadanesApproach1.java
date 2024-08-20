package com.ct.Arrays;

public class KadanesApproach1 {
	
	// O(n3)
	
	public static void main(String[] args) {
	
	
		
		
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		int sum = 0;
		
		
		for(int i =0;i<arr.length;i++) {
			
			for(int j = i;j<arr.length;j++) {
				
				for(int k =i;k<=j;k++) {
					
					System.out.print(arr[k]+" ");
					
					
				
				System.out.println();
			}
		}
			
		}
	}
}
		
		
		
	


