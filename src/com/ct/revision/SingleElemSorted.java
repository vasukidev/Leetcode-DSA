package com.ct.revision;

public class SingleElemSorted {
	
	public static void main(String[] args) {
		
		int [] arr = {3,3,7,7,10,11,11};
		
		//int [] arr = {1,1,2,3,3,4,4,8,8};
		
		System.out.println(findSingle(arr));
		
	}
		
	public static int findSingle(int [] arr ) {
		
		
		int start = 0;
		
		int n = arr.length;
		int end = arr.length-1;
		
		if(start<end) {
			
			if(n==1) {
				
				return arr[0];
			}
			
			if(arr[0]>arr[1] ){
				
				return arr[0];
			}
			
			if(arr[n-1]>arr[n-2]) {
				
				return arr[n-1];
			}
			
			while(start<=end) {
				
				int mid = start + (end-start)/2;
				
				
				if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) {
					
					return arr[mid];
				}
				
				
				if(mid%2==1 && arr[mid]==arr[mid-1]) {
					
					start = mid +1;
					
					
				}
				
				else if (mid%2==1) {
					
					end = mid -1;
				}
				
				if(mid%2==0 && arr[mid]==arr[mid-1]) {
					
					end = mid -2;
				}
				
				else if(mid%2==0) {
					
					start = mid +1;
				}
			}
			
			
			
		}
		
		return -1;
	}

}
