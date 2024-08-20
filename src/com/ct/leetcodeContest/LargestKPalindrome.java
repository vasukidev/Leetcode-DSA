package com.ct.leetcodeContest;

public class LargestKPalindrome {
	
	
	// hard 
	// LC contest 
	
	
	/*
	 * You are given two positive integers n and k.
	 * 
	 * An integer x is called k-palindromic if:
	 * 
	 * x is a palindrome . x is divisible by k. Return the largest integer having n
	 * digits (as a string) that is k-palindromic.
	 * 
	 * Note that the integer must not have leading zeros.
	 */
	
	/*
	 * Example 1:
	 * 
	 * Input: n = 3, k = 5
	 * 
	 * Output: "595"
	 * 
	 * Explanation:
	 * 
	 * 595 is the largest k-palindromic integer with 3 digits.
	 * 
	 * Example 2:
	 * 
	 * Input: n = 1, k = 4
	 * 
	 * Output: "8"
	 * 
	 * Explanation:
	 * 
	 * 4 and 8 are the only k-palindromic integers with 1 digit.
	 */




	    public static String largestKPalindromic(int n, int k) {
	        // Step 1: Generate the largest n-digit number
	        int upperLimit = (int) Math.pow(10, n) - 1;
	        int lowerLimit = (int) Math.pow(10, n - 1);

	        // Step 2: Iterate from upperLimit downwards
	        for (int i = upperLimit; i >= lowerLimit; i--) {
	            if (isPalindrome(i) && i % k == 0) {
	                return String.valueOf(i);
	            }
	        }

	        // Step 3: If no k-palindromic number found, return empty string
	        return "";
	    }

	    private static boolean isPalindrome(int num) {
	        String str = String.valueOf(num);
	        int len = str.length();
	        for (int i = 0; i < len / 2; i++) {
	            if (str.charAt(i) != str.charAt(len - 1 - i)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        int n = 3;
	        int k = 11;
	        String result = largestKPalindromic(n, k);
	        System.out.println("The largest " + k + "-palindromic number with " + n + " digits is: " + result);
	    }
	

	
	/*
	 * public String largestPalindrome(int n, int k) {
	 * 
	 * String x = null;
	 * 
	 * char c [] = x.toCharArray();
	 * 
	 * c = new char[n];
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
}
