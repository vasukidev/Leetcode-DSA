package com.ct.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CountSubSeq {
	
	// count sub sequences in functional way
	
	// in normal paramterized way we take count variable and increment and return count
	
	public static void main(String[] args) {
		
		int arr [] = {1,2,1};
		
		int k = 2;
		int sum = 0;
		
		
		System.out.println(countSub(0, new ArrayList<>(), k, sum));
		
		
	}
	
	
	public static int countSub(int index,List list,int k,int sum) {
		
		int arr [] = {1,2,1};
		
		if(index==arr.length) {
			
			if(sum==k) {
				
				System.out.println(" print " + list);
				
				return 1;
			}
			
			else {
				
				return 0;
			}
		}
		
		list.add(arr[index]);
		sum+=arr[index];
		int inclusive = countSub(index+1, list, k, sum);
		
		list.remove(list.size()-1);
		sum-=arr[index];
		int exclusive = countSub(index+1, list, k, sum);
		
		return inclusive+exclusive;
	}

}
