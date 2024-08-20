package com.ct.BinarySearch;

public class SearchRotatedDupl {
	
	public static void main(String[] args) {
		
		
		int arr[] = {3, 3, 3, 1, 2, 3};
		
		int target = 3;
		
		int low = 0;
		int high = arr.length-1;
		
		System.out.println(searchRotated(arr, target, low, high));
	}
	
	
	static int searchRotated(int [] arr, int target, int low, int high) {
		
		
		// apply binary search 
		while(low<=high) {
			
			int mid = low+(high-low)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			// main condition 
			if(arr[low]==arr[mid] && arr[mid]==arr[high]) {
				
				
				// trimming the array
				low++;
				high--;
				continue;
				
				
			}
			
			// left array
			else if(arr[low]<=arr[mid]){
				
				
				if(arr[low]<=target && arr[mid]>= target) {
				
				
				high = mid - 1;
			}
				else  {
					
					low = mid +1;
				}
				
			}
			
			// right array 
			else {
				
				
				if(arr[mid]<=target && arr[high]>=target) {
					
					low = mid +1;
					
				}
				else {
					
					high = mid -1;
				}
		}
		
		
	}

		
		return -1;
}
}
