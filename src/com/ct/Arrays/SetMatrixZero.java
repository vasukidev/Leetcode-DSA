package com.ct.Arrays;

public class SetMatrixZero {
	
	//LC 73
	
	// TC O(m*n) traversing through entire matrix based on number of rows and cols
	
	
	public static void main(String[] args) {
		
		int [][]matrix = {{1,1,1},{1,0,1},{1,1,1}};
		
	}
	
	public static void setMatrixZero(int matrix[][]) {
		
		  boolean firstRow=false,firstCol=false;
		
		  
		  // set markers in the first row and first col
		for(int i=0;i<matrix.length;i++) 
			
			for(int j =0;j<matrix[0].length;j++) 
				
				// if the first row and col of the matrix has zeroes
				if(matrix[i][j]==0) {
					// assign markers
					if(i==0) firstRow=true;
					if(j==0) firstCol=true;
					// replacing the zeroes based on inner matrix values 
					matrix[0][j]=0;
					matrix[i][0]=0;
				}
				
		
		// replace inner matrix 
		for(int i=1;i<matrix.length;i++) 
			
			for(int j=1;j<matrix[0].length;j++)
				// if there is any zero in the row or col index
				if(matrix[0][j]==0||matrix[i][0]==0)
					// replace the inner matrix entire row and col as zero
					matrix[i][j]=0;
		
		// last remaining checks
		// make  remaining elements 0s in the first row and first col
	        if(firstRow)
			for(int j=0;j<matrix[0].length;j++)
				matrix[0][j]=0;
		
	        if(firstCol)
			for(int i=0;i<matrix.length;i++)
				matrix[i][0]=0;
		


	}
	
}


		

