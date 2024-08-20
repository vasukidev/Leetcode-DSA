package com.ct.Arrays;

public class FIndDuplFloyd {
	
	// linked list concept
	
	public static void main(String[] args) {
		
		
		
		int [] arr = {2,1,3,4,5,6,6};
		
		System.out.println(findDupl(arr));
		
	}
	
	public static int findDupl(int [] arr) {
		
		int slow = 0;
		int fast = 0;
		
		do {
			
		slow = arr[slow];
		fast = arr[arr[fast]];
		} while(slow!=fast);
		
		
		// do this until both the pointers meet 
		// once they meet traverse in the same speed
		
		
		slow = 0;
		while(slow!=fast) {
			
			slow= arr[slow];
			fast = arr[fast];
			
			
		}
		
		return slow;
	}

}
