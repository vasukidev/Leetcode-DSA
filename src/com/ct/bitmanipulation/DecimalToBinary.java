package com.ct.bitmanipulation;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		
		    int binary[] = new int[100]; // Array to store binary digits, assuming a maximum size of 100
		    
		    int count = 0;

	        int i = 0; // Index to track the position in the binary array
	        Scanner sc = new Scanner(System.in); // Scanner object to take input from the user
	        System.out.println("Enter decimal: "); // Prompt the user to enter a decimal number

	        int decimal = sc.nextInt(); // Read the decimal number entered by the user

	        // Loop to convert decimal to binary
	        while (decimal != 0) {
	            // Store the remainder when the decimal number is divided by 2 in the binary array
	            binary[i] = decimal % 2;
	            System.out.println(" %2 gives " + binary[i]);
	            // Update the decimal number by dividing it by 2 (integer division)
	            decimal = decimal / 2;
	            // Move to the next position in the binary array
	            i++;
	        }
	        
	        
	     

	        // Loop to print the binary digits in reverse order (most significant bit first)
	        for (int j = i - 1; j >= 0; j--) {
	            // Print each binary digit without a newline, to form the binary number
	        	
	        	
	            System.out.print("" + binary[j]);
	            
	            
	        }

	       
	        System.out.println();
		
	}

}
