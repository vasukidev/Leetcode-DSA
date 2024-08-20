package com.ct.sortsearch;

public class BinarySearchUsingChars {
	
	public static void main(String[] args) {
		
		
		
		char [] chrs = {'a','o','p'};
		char target = 'a';
		
		
		System.out.println(binarySearch(chrs, target));
		
	}
	
	
	static int binarySearch(char [] array , char target) {
		
		
		int low = 0;
		int high = array.length-1;
		
		
		while(low<=high) {
			
			int mid = low + (high-low)/2;
			
			
			if(target==array[mid]) {
				
				return mid;
			}
			
			if(array[mid]<target) {
				
				low = mid +1;
				
				
			}
			
			else {
				
				high = mid -1;
			}
			
			
		}
		
		return -1;
	}

}
