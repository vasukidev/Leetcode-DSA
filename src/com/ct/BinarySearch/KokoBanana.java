package com.ct.BinarySearch;

public class KokoBanana {
	
	public static void main(String[] args) {
		
		int [] piles = {3,6,7,11};
							
				int h = 8;
		System.out.println(minEatingSpeed(piles, h));
		
	}
	
	public static int minEatingSpeed(int piles [] , int h) {
		
		int low = 0;
		int high =piles[0];
		int ans = 0;
		
		for(int pile:piles) {
			
			high = Math.max(pile, high);
			
			
		}
		System.out.println(" the highest value is " + high);
		
		while(low<=high) {
			
			int mid = low + (high-low)/2;
			
			if(helper(piles, mid)<=h) {
				
				high = mid-1;
				ans = mid;
				
			}
			
			else {
				
				low = mid +1;
			}
		}
		
		return ans;
	}
	
	
	
	public static long helper(int piles[],int mid) {
		
		long hrs = 0;
		
		for(int pile:piles) {
			
			hrs+=pile/mid;
			
			
			if(pile%mid!=0) {
				
				hrs++;
			}
		}
		
		return hrs;
	}

}
