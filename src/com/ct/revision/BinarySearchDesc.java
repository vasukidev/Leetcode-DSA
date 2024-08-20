package com.ct.revision;

public class BinarySearchDesc {
	
	public static void main(String[] args) {
		
		
		int a[]= {15,11,7,4,3,1 };
		int target = 4;
		
		int start =0;
		int end = a.length-1;
		
		System.out.println(binarySearchDesc(a, target, start, end));
		
	}
	
	
	public static int binarySearchDesc(int arr[] , int target, int start, int end) {
		
		int res = 0;
		
		while(start<=end) {
			
			int mid = start+(end-start)/2;
			
			if(arr[mid]==target) {
				
				//res= mid;
				return mid;
			}
			
			
			// if descending i=mid > target
			else if(arr[mid]>=target) {
				
				start = mid+1;
				
			}
			
			else {
				
				end = mid-1;
			}
		}
		
		
		return res;
	}

}
