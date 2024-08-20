package com.ct.sortsearch;

public class BinarySearchStrings {
	
	public static void main(String[] args) {
		
		// alphabetically
		String [] str = {"Divya","Ponduri","Tab"};
		
		
		String target = "Tab";
		
		
		int res = binarySearch(str, target);
		
		
		System.out.println(res);
		
	}
	
	
	static int binarySearch(String [] str, String target) {
		
		
		
		int low = 0;
		int high = str.length-1;
		
		while(low<=high) {
			
			
			int mid = low+(high-low)/2;
			
			
			
			
			int res = target.compareTo(str[mid]);
			
			// if the res is greater than 0 then search for the target in the 2nd part else high = mid-1 
			//if res == 0 return mid
			
			if(res==0) {
				
				return mid;
			}
			
			
			else if (res>0) {
				
				low = mid +1;
				
				
				
				
			}
			
			else {
				
				high = mid -1;
			}
			
		}
		
		return -1;
	}

}
