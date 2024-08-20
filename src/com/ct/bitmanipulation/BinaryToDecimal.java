package com.ct.bitmanipulation;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" enter the binary: ");
		
		int binary = sc.nextInt();
		
		int i = 0;
		
		int t = binary;
		
		int decimal = 0;
		
		while(t>0) {
			
			// %10 gives remainder 
			int r = t%10;
			
		  // System.out.print(" the remainder % 10 " + r);
			
			// gives quotient 
			t=t/10;
			
			//System.out.print(" the quotient /10 " + t);
			// Math.pow gives double so convert into int 
			decimal += r * (int)Math.pow(2, i++);
		}
		
		System.out.println(" the decimal value is " + decimal);
		
		
		
	}

}
