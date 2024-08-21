package com.ct.bitmanipulation;

public class ReverseBits {
	
	// LC 190. Reverse Bits
	
	
	public static void main(String[] args) {
		
		//int n = 00000010100101000001111010011100;
		
		// above input is the input in LC
		
	}
	
	public static int reverseBits(int n) {
		
		
	    int ans = 0;
        int mask = 1;

        for(int i=0;i<32;i++){
// to calculate the if the bit has sets 1 or off set 0
            if((mask&n)!=0){

                ans+=1<<31-i;
            }

            mask<<=1;
        }

        return ans;


		
		
	}

}
