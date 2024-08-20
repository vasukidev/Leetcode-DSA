package com.ct.BinarySearch;

public class SquareRoot {
	
	public static void main(String[] args) {
		
		
		int x = 8;
		
		System.out.println(mySqrt(x));
		
	}
	public static int mySqrt(int x) {

        int low = 0;
        int high = x;
        long ans = 1;

        while(low<=high){

            long mid = low +(high-low)/2;

            
            // less than so that rounded to down floor 
            // greater than symbol rounded to up ceil
            if(mid*mid<=x){

                ans= mid;
                
            }

            if(mid*mid>x){

                high = (int)(mid-1);


            }
            else{

                low = (int)(mid+1);
            }
        }

        return (int)ans;
        
    }
	}


