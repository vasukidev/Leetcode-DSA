package com.ct.Arrays;

public class TwoDArrayTraverse {
	
	
	public static void main(String[] args) {
		
		
		// 2*3 matrix array
		int [][] twod = {{1,2,3},{4,5,6}};
		
		//trvaerseTwoD(twod);
		
		traverseTwoArray(twod);
		
	}
	
	// through for  loop
	public static void trvaerseTwoD(int [] [] twoD) {
		
		// traverse through rows first
		for(int i=0;i<twoD.length;i++) {
			
			for(int j=0;j<twoD[i].length;j++) {
				
				System.out.print(twoD[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		
	}
	
	// for each loop
	public static void traverseTwoArray(int [] [] twoD) {
		
		// for every row in the array
		for(int [] row: twoD) {			
			// for every val in the row
			for(int val:row) {
				
				System.out.print(val+" ");
				
				
			}
			
			System.out.println();
		
		}
	}

}
