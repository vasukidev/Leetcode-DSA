package com.ct.Recursion;

public class SwapRecursion {
	
	// Recursions
	
	public static void main(String[] args) {
		
		int [] arr = {2,3,4,5,1};
		
		int left = 0;
		int right = arr.length-1;
		
		swapValues(left, right, arr);
		
		for(int i =0;i<=arr.length-1;i++) {
			
			System.out.print(arr[i]);
		}
		
		
	}
	
	
	public static void  swapValues(int left,int right,int arr[]) {
		
		int temp = 0;
		
		// doubt
		// swapping until half way only 
        // doubt why =
		if(left>=right) return;
		//swap
		temp = arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		
		// incrementing the index from left
		// decrementing the index from right
		swapValues(left+1, right-1, arr);
		
		
	}

}
