package com.ct.bitmanipulation;

import java.util.Scanner;

public class NumberOf1Bits {
	
	// LC 191
	
	public static void main(String[] args) {
		
		int n = 2147483645;
		
		System.out.println(countBits(n));
		
	}
	
	public static int countBits(int decimal) {
		
		
		 int binary[] = new int[100]; // Array to store binary digits, assuming a maximum size of 100
		    
		    int count = 0;

	        int i = 0; // Index to track the position in the binary array
	      

	        // Loop to convert decimal to binary
	        while (decimal != 0) {
	            // Store the remainder when the decimal number is divided by 2 in the binary array
	            binary[i] = decimal % 2;
	            
	            if(binary[i]==1)count++;
	            
	            
	            //System.out.println(" %2 gives " + binary[i]);
	            // Update the decimal number by dividing it by 2 (integer division)
	            decimal = decimal / 2;
	            // Move to the next position in the binary array
	            i++;
	        }
	        
	        return count;
	
	
	

}
}
