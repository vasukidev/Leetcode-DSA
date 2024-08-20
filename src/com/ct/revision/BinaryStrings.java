package com.ct.revision;

public class BinaryStrings {
	
	
	
	public static void main(String[] args) {
		
		
		String [] arr = {"Vasuki","Divi","sukii","zzzzzzzzzzz"};
		
		String target = "sukii";
		
		int start = 0;
		int end = arr.length-1;
		
		System.out.println(binaryStrings(arr, start, end, target));
		
		
	}
	
	public static int binaryStrings(String arr[], int start, int end , String target) {
		
		while(start<=end) {
			
			int mid = start + (end-start)/2;
			
			int res = target.compareTo(arr[mid]);
			
			if(res==0) {
				
				return mid;
			}
			
			else if(res>0) {
				
				start = mid +1;
			}
			
			else {
				
				end = mid-1;
			}
		}
		
		return -1;
	}
	
}
