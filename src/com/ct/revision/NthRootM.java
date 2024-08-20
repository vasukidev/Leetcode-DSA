package com.ct.revision;

public class NthRootM {
	
	
	public static void main(String[] args) {
		
		int n = 2;
		int m = 9;
		
		
		System.out.println(findRoot(n, m));
		
		
		
		
	}
	
	public static int findRoot(int n , int m) {
		
		
		int start =1;
		int end = m;
		
	
		
		while(start<=end) {
			
			int mid = start + (end-start)/2;
			
			int temp = findNRoot(mid, n, m);
			
			if(temp==0) {
				
				
				return mid;
			}
			
			else if(temp==1) {
				
				start = mid +1;
				
			}
			
			else {
				
				end = mid -1;
			}
			
		
		
	}
		
		return -1;
	}
		
	public static int findNRoot(int mid, int n, int m) {
		
		int ans  = 1;
		
		for(int i=1;i<=n;i++) {
			
			
			ans = ans*mid;
			
		}
		
		if(ans>m) {
			
			return 2;
		}
		
		return (m==(int)ans)?0:1;

	}

}
