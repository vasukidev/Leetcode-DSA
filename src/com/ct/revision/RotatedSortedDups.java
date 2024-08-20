package com.ct.revision;

public class RotatedSortedDups {
	
	public static void main(String[] args) {
		
        int arr[] = {3, 3, 3, 1, 2, 3};
		
		int target = 3;
		
		System.out.println(rotatedDuplicates(arr, target));		
	}
	
	public static int rotatedDuplicates(int arr [] , int target) {
		
		int low = 0;
		int high = arr.length-1;
		int ans = 0;
		while(low<=high) {
			
			int mid = low + (high-low)/2;
			
			
               if(arr[mid] == target) {
				
				ans = mid;
				
				return mid;
		
			}
			
			// main condition to avoid duplicates and trim the array
			if(arr[low]==arr[mid] && arr[mid] == arr[high]) {
				
				low ++;
				high--;
				
			}	
			
			else if(arr[low]<=arr[mid]) {
				
				if(arr[low]<=target && arr[mid]>=target) {
					
					high = mid -1;
				}
				
				else {
					
					low = mid +1;
				}
			}
			
			else {
				
				if(arr[mid]<=target && arr[high]>=target) {
					
					low = mid +1;
				}
				
				else{
					
					high = mid -1;
	
				}
			}
		}
		
		return ans;
		
		
	}

}
