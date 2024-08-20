package com.ct.sortsearch;

import java.util.Arrays;

public class MergeArrayRec {
	
	
	public static void main(String[] args) {
		
		int [] arr = {6,5,4,8,9,2};
		
		int left = 0;
		int right = arr.length-1;
		
		mergeSort(arr, left, right);
		
	}
	
	
	
	static void merge(int arr [], int left , int mid , int right) { 
		
		// creating 2 arrays by putting left and right elements
		int leftArr [] = new int[mid-left+1];
		
		int rightArr[] = new int[right-mid];
		
		int i =0,j=0,k=left;
		// taking from left and putting in main array
		for(int x =left;x<=mid;x++){
		leftArr[i++]=arr[x];
		}
		// taking from right and putting in main array
		for(int x=mid+1;x<=right;x++) {
			rightArr[j++]=arr[x];
		}
		
		i=0;j=0;
		
		while(i<leftArr.length && j<rightArr.length) {
			
			if(leftArr[i]<=rightArr[j]) {
				// store in the main array
				arr[k++] = leftArr[i++];
				
			}
			else {
				// store in the main array
			arr[k++] = rightArr[j++];
			}
			
		}
		
		
		// handling exhausted elements by storing in the main array
		while(i<leftArr.length) {
			
			arr[k++] = leftArr[i++];
		}
		
             while(j<rightArr.length) {
			
	        arr[k++] =  rightArr[j++];
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	
	static void mergeSort(int [] arr,int left , int right) {
		
		
		if(left<right) {
			
			
			int mid = left + (right-left)/2;
			
			
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			
			merge(arr,left,mid,right);
		}
		 System.out.println(Arrays.toString(arr));
		
	}

}
