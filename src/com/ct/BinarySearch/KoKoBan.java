package com.ct.BinarySearch;

public class KoKoBan {
	
	// LC 875
	
	public static void main(String[] args) {
		
		int [] piles = {3,6,7,11};
		
		int h = 8;
		
		System.out.println(findSpeed(piles, h));
		
	}
	
	
	public static int findSpeed(int [] piles, int h) {
		
		
		int start = 0;
		int end = piles[0];
		
		int ans = 0;
		
		for(int pile:piles) {
			
			end = Math.max(pile, end);
		}
		
		while(start<=end) {
			
			int mid = start + (end-start)/2;
			
			if(helper(piles, mid)<=h) {
				
				
				end = mid-1;
				ans = mid;
				
			}
			
			else {
				
				start = mid +1;
			}
		}
		
		return ans;
		
	}
	
	
	public static int helper(int [] piles,int mid) {
		
		long hours = 0;
		
		for(int pile:piles) {
			
			hours += pile/mid;
			
			if(pile%mid!=0) {
				
				hours++;
			}
		}
		
		return (int)hours;
	}

}

