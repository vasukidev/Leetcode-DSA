package com.ct.Strings;

public class CountPalindromeSubs {
	
	public static void main(String[] args) {
		
	}
	
	
public static int longPalindrome(String s) {
		
		
		int count = 0;
		
        int n = s.length();
		
		int [][] arr = new int[n][n];
		
		int maxlen = Integer.MIN_VALUE;
		
		String palin = "";
		
		// outer loop
		
		for(int diff=0;diff<n;diff++) {
			// inner loop
			for(int i=0,j=i+diff;j<n;i++,j++) {
				// single character condition
				if(i==j) {
					
					arr[i][j]=1; // if len is 1 for all single characters palindrome // 1st diagonal
				} 
				// 2 characters condition
				else if(diff==1) {
					
					
					// if the characters at i and j are same then len is 2 otherwise 0 // 2nd diagonal
					arr[i][j]=(s.charAt(i)==s.charAt(j))?2:0;
				}
				
				else {
					
					// outer characters i and j and inner sub string palindrome or not i+1 and j-1 gives inner sub string
					if(s.charAt(i)==s.charAt(j)&& arr[i+1][j-1]>0) {
						
						
						//the position at diagonal + 2 characters will give us the len of the string
						arr[i][j]=arr[i+1][j-1]+2;
					}
				}
				
				
				// if the position of j and j in an array is greater than 0
				// then find the length 
				if(arr[i][j]>0) {
					
					count++;
					
					if(j-i+1>maxlen) {
						
						// for ex: bab - i starts at 0 and j ends at 2 so 2-0+1 = 3 
						maxlen = j-i+1;
					// need to understand this
					palin=s.substring(i,j+1);
				}
				}
				
				
			}
			
			
		}
		
		System.out.println(" the number of palindromes " + count);
		
		return count;
		
		
		
	}

}
