package com.ct.Arrays;

import java.util.Arrays;

public class RotateImage90 {
	
	//LC 48
	// Submitted 
	
	public static void main(String[] args) {
		int [] [] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		int n = matrix.length;
		
		System.out.println(" the len of the matrix is " + n);
		
		/*
		 * int i = (n+1)/2;
		 * 
		 * System.out.println(" the len of i is " + i);
		 * 
		 * 
		 */
		
		
		rotateTransposition(matrix, n);
		
		for(int i =0;i<matrix.length;i++) {
			
			for(int j = 0;j<matrix[i].length;j++) {
				
				System.out.print(matrix[i][j]);
			}
			
			System.out.println();
		}
	}
	
	public static void rotateTransposition(int [] [] matrix, int n) {
		
		int temp =0;
		
		for(int i =0;i<(n+1)/2;i++) {
			
			for(int j =0;j<n/2;j++) {
				
				
				// temp = bottom left
				temp = matrix[n-1-j][i];
				
				// bottom left = bottom right
				matrix[n-1-j][i]= matrix[n-1-i][n-j-1];
				
				// bottom right = top right
				matrix[n-1-i][n-j-1] = matrix[j][n-1-i];
				
				// top right = top left
				matrix[j][n-1-i] = matrix[i][j];
				
				//top left = temp				
				matrix[i][j] = temp;
								
			}
			
			
		}
	}

}
