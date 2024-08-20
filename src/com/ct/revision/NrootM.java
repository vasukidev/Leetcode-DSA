package com.ct.revision;

public class NrootM {
	
	public static void main(String[] args) {
		
		
		int n = 2;
		int m = 9;
		
		System.out.println(findNthroot(n, m));
		
	}
		
	public static int findNthroot(int n , int m) {
		
		int start = 1;
		int end = m;
		
		while(start<=end) {
			
			int mid = start + (end-start)/2;
			
			int temp = findPow(mid, n, m);
			
			if(temp==0) {
				
				return mid;
			}
			
			else if(temp==1) {
				
				start = mid+1;						
				
			}
			
			else {
				
				end = mid-1;
			}
		}
		
		return -1;		
	}
				
	public static int findPow(int x , int n , int m) {
		
		
		long ans = 1;
		
		for(int i =1;i<=n;i++) {
			
			ans = ans * x;
			
			if(ans>m) {
				
				return 2;
			}
			
			
		}
		
		
		//System.out.println(" the ans is " + ans);
		return (m==(int)ans)?0:1;
	}
}
	
	


