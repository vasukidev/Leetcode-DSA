package com.ct.revision;

public class BinaryRecursive {
	
	public static void main(String[] args) {
		
		
        int [] arrr = {1,3,4,5,7};
		
		int target = 7;
		
		
		int start = 0;
		int end = arrr.length-1;
		
		System.out.println(binaryRecursive(arrr, target, start, end));
		
	}
	
	
	
	public static int binaryRecursive(int arr[] , int target , int start, int end) {
		
		
		if(start>end) {
			
			return -1;
		}
		

			
			
			int mid = (start + end)/2;
			
		//	System.out.println(" the mid " + mid);
			
			if(arr[mid]==target) {
				
				//System.out.println(" target mid " + mid);
				
				return mid;
			}
			
			else if(arr[mid]<=target) {
				
				return binaryRecursive(arr, target, mid+1, end);
			}
			
			else {
				
				return binaryRecursive(arr, target, start, mid-1);
			}
		
		
	

}
	
}
