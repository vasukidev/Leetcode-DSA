package com.ct.Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceK {
	// return all the subsets whose sum is == k 
	// TC = O(2n) it's 2 to the power of n (worst case scenario)
	// SC = O(n) num of elements in the array (stack space)
	
	public static void main(String[] args) {
		
		
		subSequence(0, new ArrayList<>(), 0);
		
	}
	
    public static void subSequence(int index,List<Integer> list,int sum){
		
		int arr [] = {3,2,1};
		
		int k = 2;
		
//		int sum = 0;
		
		if(index>=arr.length) {
		
				
				if(sum==k) {
					
					System.out.println("print list " + list);
					
					
					}
				
				return;
		}
		list.add(arr[index]); // to add elements in the list 
		sum+=arr[index]; // sum the elements 
		subSequence(index+1, list,sum); // include
		list.remove(list.size()-1); // to remove last index in the list 
		sum-=arr[index]; // remove from sum
		subSequence(index+1, list,sum); // exclude 
			
	}

}
