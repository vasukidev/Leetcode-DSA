package com.ct.revision;

public class BinarySearchIterative {
	
	public static void main(String[] args) {
		int [] arrr = {1,3,4,5,7};
		
		int target = 7;
		
		
		int start = 0;
		int end = arrr.length-1;
		
		System.out.println(binaryIterative(arrr, start, end, target));
	}

	
	public static int binaryIterative(int arr[] , int start, int end, int target) {
		
		int res = 0;
		
		while(start<=end) {
			
			
			int mid = start+ (end-start)/2;
			
			if(arr[mid]==target) {
				
				res=mid;
				return mid;
			}
			
			
			else if (arr[mid]<=target) {
				
				start = mid +1;
				
			}
			
			
			else {
				
				end = mid-1;
				
			}
		}
		
		return res;
	}
}
