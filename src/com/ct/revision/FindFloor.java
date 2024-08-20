package com.ct.revision;

public class FindFloor {
	
	public static void main(String[] args) {
		
		int arr [] = {3,5,7,8,9};
		
		int target = 6;
		
		System.out.println(findFloor(arr, target));
		
	}
	
	public static int findFloor(int arr [] , int target) {
		
		int start = 0;
		int end = arr.length-1;
		int ans = 0;
		
		while(start<=end) {
			
			int mid = start + (end-start)/2;
			
			if(arr[mid]<=target) {
				
				ans = mid;
				
				start = mid+1;
				
				
			}
			
			else {
				
				end = mid -1;
			}
		}
		
		return ans;

}
}
