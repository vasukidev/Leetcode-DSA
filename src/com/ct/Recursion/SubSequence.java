package com.ct.Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
	
	// return all the sub sequences 
	
	public static void main(String[] args) {
		
		subSequence(0,new ArrayList<>());
		
	}

	
	public static void subSequence(int index,List<Integer> list){
		
		int arr [] = {3,1,2};
		if(index>=arr.length) {
			
			
					
					System.out.println(" print list " + list);
					return;
				}	
			
		
		list.add(arr[index]);
		subSequence(index+1, list); // include
		list.remove(list.size()-1); // to remove last index in the list 
		subSequence(index+1, list); // exclude 
			
	}
}
