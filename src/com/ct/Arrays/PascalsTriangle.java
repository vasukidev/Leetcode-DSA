package com.ct.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	
	// LC 118.
	// Submitted
	
	public static void main(String[] args) {
		
		
		System.out.print(generateTriangle(5));
		
	}
	
	
	public static List<List<Integer>> generateTriangle(int noOfrows){
		
		
		List<List<Integer>> result = new ArrayList();
		
		if(noOfrows==0) {
			
			
			return result;
			
		}
				
		List firstrow = new ArrayList<Integer>();	
		firstrow.add(1);		
		result.add(firstrow);
			
		
		
		if(noOfrows==1) {
			
			return result;
		}
		
		
		for(int i =1;i<noOfrows;i++) {
			
            List<Integer> prevRow = result.get(i-1);
				
			ArrayList<Integer> newRow = new ArrayList();
			
			newRow.add(1);
			
			for(int j = 0;j<i-1;j++) {		
			
			newRow.add(prevRow.get(j) + prevRow.get(j+1));
			}
			
			newRow.add(1);
			
			result.add(newRow);
		}
		
		return result;
	
	}

}
