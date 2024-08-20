package com.ct.sortsearch;

public class BinarySearchRecursive {
	
	
	public static void main(String[] args) {
		
		
		/*
		 * public static int bs(int arr[], int target, int start, int end) {
		 * 
		 * 
		 * arr[] = {2,3,4,1,5,6}; int start = 0; int end = arr.length-1;
		 * 
		 * binarySearch(arr, target, start, end);
		 * 
		 * 
		 * }
		 */
		  int [] arrr = {1,3,4,5,7,8,9};
			
			int target = 7;
			
			
			int start = 0;
			int end = arrr.length-1;
			
			System.out.println(binarySearch(arrr, target, start, end));
		
		
		
	}
	
	public static int binarySearch(int arr[],int target,int start, int end) {
		
	if(start>end) {
		
		return -1;
	}
	
	
	else {
		
		int mid = start+(end-start)/2;
		
		if(arr[mid]==target) {
			
			return mid;
		}
		
		else if(arr[mid]<=target) {
			
			binarySearch(arr, target, mid+1, end);
		}
		
		else {
			
			binarySearch(arr, target, start, mid-1);
		}
	}
		
		
		return 0;
		
		
	}

}
