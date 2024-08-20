package com.ct.revision;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleRev {
	
	public static void main(String[] args) {
		
		
		System.out.println(generate(5));
		
	}
	
	
	public static List<List<Integer>> generate(int numRows){
			
		List<List<Integer>> result = new ArrayList();
	
		if(numRows == 0) {
			
			return result;
		}
		
		
		List row = new ArrayList<Integer>();
		
		row.add(1);		
		result.add(row);
		
		
		for(int i =1;i<numRows;i++) {
			
			List<Integer> newRow = new ArrayList<Integer>();
			newRow.add(1);
			
			List<Integer> prevRow = result.get(i-1);
			
			for(int j = 0;j<i-1;j++) {
				
				newRow.add(prevRow.get(j)+ prevRow.get(j+1));
			}
			
			newRow.add(1);
			
			result.add(newRow);
		}
		
		
		return result;
		
		
	}

}
