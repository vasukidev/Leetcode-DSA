package com.ct.Strings;

public class LongestPalindSubStr {

	public static void main(String[] args) {

		String s = "babad";

		// String s = "cbbd";

		int n = s.length();

		int[][] array = new int[n][n];

		//System.out.println(longesPalindromicSub(s));

	}

	/*
	 * public static String longesPalindromicSub(String str) {
	 * 
	 * str=str.toLowerCase();
	 * 
	 * int left = 0; int right = str.length()-1;
	 * 
	 * int maxLen = Integer.MIN_VALUE;
	 * 
	 * StringBuilder palin = new StringBuilder();
	 * 
	 * while(left<right) {
	 * 
	 * 
	 * 
	 * if(str.charAt(left)==str.charAt(right)) {
	 * 
	 * maxLen = Math.max(maxLen, right-left+1);
	 * 
	 * System.out.println(" tha max len is of the palin " + maxLen);
	 * 
	 * 
	 * palin.append(str.charAt(left)); palin.append(str.charAt(right));
	 * 
	 * 
	 * //palin.append(str.charAt(right));
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * left++; right--;
	 * 
	 * 
	 * }
	 * 
	 * return palin.toString(); }
	 */
	
	

}
