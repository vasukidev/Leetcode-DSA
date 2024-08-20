package com.ct.BinarySearch;

public class CountRotationsIterative {
	
	public static void main(String[] args) {
		
		int arr [] = {5,1, 2, 3, 4};
		
		
		System.out.println(countRotated(arr));
				
	}
	
	
	static int countRotated(int arr[]) {
		
		int start = 0;
		int end = arr.length-1;
		int min = Integer.MAX_VALUE;
		int ans = 0;
		
		while(start<=end) {
			
			if(arr[start]<=arr[end]) {
				
				ans = Math.min(arr[start], min);
				break;
			}
			
			
			int mid = start+(end-start)/2;
			if(arr[start]<=arr[mid]) {
				
				ans = Math.min(arr[start], min);
				
				start = mid+1;
			}
			else {
				ans = Math.min(arr[mid], min);
				end = mid-1;
			}
			
			
			
		}
		
		
		return ans;
	}
	
		
		}

	


