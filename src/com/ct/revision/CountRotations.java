package com.ct.revision;

public class CountRotations {
	
	public static void main(String[] args) {
		
		int arr [] = {6,1, 2, 3, 4,5};
		
		System.out.println(countRotations(arr));
		
	}
	
	public static int countRotations(int arr []) {
		
		int min = Integer.MAX_VALUE;
		
		int start = 0;
		int end = arr.length-1;
		
		//int ans = 0;
		
		
		while(start<=end) {
			
			int mid = start + (end-start)/2;
			
			
			if(arr[start]<=arr[end]) {
				
				min = Math.min(arr[start], min);
				break;
			}
			
			
			if(arr[start]<=arr[mid]) {
				
				min = Math.min(min,arr[start]);
				
				start = mid +1;
			}
			else {
			
				min = Math.min(min,arr[mid]);
				
				end = mid-1;
			}
			
			
		}
		
		return min;
	}

}
