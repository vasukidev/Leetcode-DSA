package com.ct.revision;

public class Kokobanana {
	
	public static void main(String[] args) {
		
		int [] piles = {3,6,7,11};
		int h = 8;
		
		System.out.println(findSpeed(piles, h));
		
	}
	
	
	public static int findSpeed(int [] piles,int h) {
		
		int low = 0;
		int high = piles[0];
		
		int ans = 0;
		
		
		// for cal low and high range
		for(int pile:piles) {
			high = Math.max(pile, high);
			
		}
		
		// apply binary search
		while(low<=high) {
			
			
			int mid = low + (high-low)/2;
			
			if(helper(piles, mid)<=h) {
				
				ans = mid ;
				high = mid-1;
				
				
			}
			
			else {
				
				low = mid +1;
			}
			
		}
		
		return ans;
		
	}
	
	
	public static int helper(int [] piles, int mid) {
		
		int hrs = 0;
		
		for(int pile:piles) {
			
			hrs+=pile/mid;
			
			if(pile%mid!=0) {
				
				hrs++;
			}
		}
		
		return hrs;
		
		
	}

}
