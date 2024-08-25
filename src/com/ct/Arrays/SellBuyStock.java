package com.ct.Arrays;

public class SellBuyStock {
	
	// lc 121
	
	public static void main(String[] args) {
		
		int [] prices = {7,1,5,3,6,4};
		
		findMax(prices);
			  
		// Brute force
		/*
		 * for(int i = 0;i<prices.length-1;i++) {
		 * 
		 * for(int j =i+1;j<prices.length;j++) {
		 * 
		 * //int profit = ;
		 * 
		 * ans = Math.max(ans, prices[j]-prices[i]);
		 * 
		 * 
		 * }
		 * 
		 * 
		 * } if(ans<0) return 0;
		 * 
		 * System.out.println(" the max profit is " + ans); return ans;
		 */
		  
		 
		
	}
	
	 public static int findMax(int [] prices) {
		 
		   int maxprofit = Integer.MIN_VALUE;
			 
			 int buy_price = prices[0];
			 
			 for(int i =1;i<prices.length;i++) {
				 
				 if(prices[i]<buy_price) {
					 
					 buy_price=prices[i];
					 
					 
				 }
				// the current profit will be updated when the new value is more than the buying price 
				// so that we can calculate the profit
				// hence we write in else condition

	             else{

	                int current_profit = prices[i]-buy_price;
					 
					 maxprofit = Math.max(current_profit, maxprofit);
	             }
			 }
			 
			 
			if(maxprofit<=0) return 0;
				return maxprofit;
	  }
	

}
