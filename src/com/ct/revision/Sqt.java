package com.ct.revision;

public class Sqt {
	
	public static void main(String[] args) {
		
		
		int x = 8;
		
		System.out.println(findSqrt(x));
		
	}
	
	
	public static int findSqrt(int x ) {
		
		int start = 1;
		int end = x;
		
		int ans = 0;
		
		
		while(start<=end) {
			
			int mid = start + (end-start)/2;
			
			if(mid*mid<=x) {
				
				ans = mid;				
				
			}
			
			if(mid*mid>x) {
				end = mid -1;
				
			}
			
			else {
				start = mid +1;
				
			}
		}
		
return ans;	
		
	}
}
