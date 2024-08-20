package com.ct.revision;

public class Sqrt {
	
	public static void main(String[] args) {
		
		int x = 8;	
		
		System.out.println(findSqRoot(x));
		
	}
	
	
	
	public static int findSqRoot(int x) {
		
		System.out.println(" inside sq root method ");
		
		
		int start = 0;
		int end = x;
		
		long ans = 1;
		
		while(start<=end) {
						
			
			long mid = start + (end-start)/2;
			
			if(mid*mid<=x) {
				
				ans = mid;
				
				
			}
			
		if (mid*mid>x) {
				
				end = (int)mid -1;
				
				
			}
			
			else {
				start = (int)mid +1;
				
			}
		}
		
		return (int) ans;
	}

}
