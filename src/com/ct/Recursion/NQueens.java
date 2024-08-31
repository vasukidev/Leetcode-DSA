package com.ct.Recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
	
	public static void main(String[] args) {
		
	}
	
	// from the give input n create a board of char array n*n
	// fill up '.' initially in the entire grid
	public static List<List<String>> solveQueens(int n){
		
		
		
		char board [][] = new char[n][n];
		
		for(int i =0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				board[i][j]= '.';
			}
		}
		
		List<List<String>> res = new ArrayList<List<String>>();	
		// start with 0 
		//pass the char board to evaluate 
		// and the res
		dfs(0, board, res);
		// get the res from the above method
		return res;
		
	}
	
	
	public static void dfs(int col,char[][] board,List<List<String>> res) {
		// base condition if col exceeds
		if(col==board.length) {
			
			res.add(construct(board));
			return;
		}
		
		
		
	// traverse through the row and validate and place the Q acc
		for(int row=0;row<board.length;row++) {
			
			if(validate(board,row,col)) {
				board[row][col]='Q';
				// recursive call to go to next col and fill Q
				dfs(col+1, board, res);
				// will start removing back tracking
				board[row][col]='.';
				
				
			}
		
			
	}
	}
	
	
	// construct a char board to make every value as string
	// so when result is added it returns string
	public static List<String> construct(char[][] board){
		
		List<String> res = new ArrayList<String>();
		
		for(int i=0;i<board.length;i++) {
			
			String str = new String(board[i]);
			
			res.add(str);	
			
		}
		return res;
		
	}
		
		
	
	
	public static boolean validate(char[][] board,int row,int col) {
		
		int duprow = row;
		int dupcol = col;
		
		// diagonally upwards
		while(row>=0 && col>=0) {
			
			if(board[row][col]=='Q') return false;
			// both will decrease
			row--;
			col--;
		}
		
		//
		row = duprow;
        col = dupcol;
     // diagonally downwards
		while(col>=0 && row<board.length) {
			
			if(board[row][col]=='Q') return false;
			col--;
			row++;
	
		}
		
		//
		row = duprow;
        col = dupcol;
     // straight backwards
		while(col>=0) {
			
			if(board[row][col]=='Q') return false;
			col--;
		}
		
		
		return true;
		
	}

}
