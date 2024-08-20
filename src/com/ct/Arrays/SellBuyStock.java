package com.ct.Arrays;

public class SellBuyStock {
	
	// lc 121
	
	public static void main(String[] args) {
		
		int [] prices = {7,1,5,3,6,4};
		
		
		  
		  int ans = Integer.MIN_VALUE;
		  
		  
		  for(int i = 0;i<prices.length;i++) {
		  
		  for(int j =i+1;j<prices.length;j++) {
		  
		  
		  ans = Math.max(ans, prices[i]-prices[j]);
		  
		  
		  } }
		  
		  System.out.println(" the max profit is " + ans);
		 
		
		
		
	}

}
