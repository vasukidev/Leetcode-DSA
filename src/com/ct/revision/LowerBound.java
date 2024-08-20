package com.ct.revision;

public class LowerBound {
	
	// return the highest element index or the number itself
	
	public static void main(String[] args) {
		
		
      int arr[] = {3,5,8,15,19};
		
		int target = 15;
		
		System.out.println(lowerBound(arr, target));
		
	}
	
	
	public static int lowerBound(int [] arr , int target) {
		
	 int start = 0;
	 int end = arr.length-1;
	 
	 int ans = 0;
	 
	 
	 while(start<=end) {
		 
		 int mid = start + (end-start)/2;
		 
		 if(arr[mid]>=target) {
			 
			 ans = mid;
			 
			 end = start-1;		 
		 }
		 
		 else {
			 
			 start = mid +1;
		 }
	 }
		

		
	return ans;	
		
	}

}
