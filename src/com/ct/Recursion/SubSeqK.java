package com.ct.Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSeqK {
	
	// return the first sub sequence as soon as it's sum ==k
	
	public static void main(String[] args) {
		
		int arr [] = {1,2,1};
		int k = 2;
		int sum = 0;
		subSequence(0, new ArrayList<>(), sum, k);
			
	}
	
	public static boolean subSequence(int index, List<Integer> list , int sum, int k) {
		int arr [] = {1,2,1};
		
		if(index==arr.length) {
			
			if(sum==k) {
			
			System.out.println(" The list is " + list);
			return true;
			}
			
			else {
				
				return false;
			}
			
			
		}

		
		list.add(arr[index]);	
		sum+=arr[index];
		// if we get a subseq whose sum is == k return true and avoid further executions/ func calls
		if(subSequence(index+1, list, sum, k)) return true;
		
		list.remove(list.size()-1);
		sum-=arr[index];
		// if we get a subseq whose sum is == k return true and avoid further executions/ func calls
		if(subSequence(index+1, list, sum, k)) return true;
		
		
		// if no sub seq whose sum == k then return false
		return false;
	}

}
