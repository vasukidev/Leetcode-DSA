package com.ct.revision;

public class RotatedSorted {
	
	public static void main(String[] args) {
		int arr [] = {7,8,9,0,1,2,3,4,5,6};
		int target = 2;
				
		System.out.println(searchRotated(arr, target));
	}
	
	public static int searchRotated(int [] arr, int target) {
		
		int low = 0;
		int end = arr.length-1;	
		int ans = 0;
		
		
		while(low<=end) {
			
			int mid = low + (end-low)/2;
			
			if(arr[mid] == target) {
				
			     ans = mid ;
				
				return mid;
			}
			
			if(arr[low]<=arr[mid]) {
				
				
				if(arr[low]<=target && arr[mid]>=target) {
					
					end = mid-1;
				}
				
				else {
					
					low = mid +1;
				}
			}
			
			else if(arr[mid]<=arr[end]) {
				
				
				if(arr[mid]<=target && arr[end]>=target) {
					
					low = mid +1;
					
				}
				
				else {
					
					end = mid-1;
				}
				
			}
		}	
				return ans;
				
			}
		
	}


