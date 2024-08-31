package com.ct.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermComb {
	
	public static void main(String[] args) {
		
	}
	
	public static List<List<Integer>> combinations(int index,int arr[],List<List<Integer>> list){
		
		List result = new ArrayList<>();
		
		if(index==arr.length) {
			
			list.add(result);
			
			return result;
				
		}
		
		for(int i=index;i<arr.length;i++) {
			
			int temp = arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
			
			combinations(index+1, arr, list);
			
			int temp1 = arr[i];
			arr[i]=arr[index];
			arr[index]=temp1;
		}
		
		
		return null;
		
	}

}
