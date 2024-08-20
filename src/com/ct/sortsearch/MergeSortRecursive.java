package com.ct.sortsearch;

import java.util.Arrays;

// Tc - O(nlogn) in all the cases
// Sc - O(n)
// Divide and conquer
public class MergeSortRecursive {
	
	public static void main(String[] args) {
		
		int arr[] = {3,1,5,2,9,7};
		
		int left = 0;
		int right = arr.length-1;
		
		mergeSort(arr, left, right);
		
	}
	
	
	static void merge(int arr[],int left,int mid,int right) {
		
		
		// create two arrays to place the elements
		int [] leftArr = new int[mid-left+1];
		int [] rightArr = new int[right-mid];
		
		
		int i =0,j=0,k=left;
		// loop elements to left
		for(int x = left;x<=mid;x++) {			
			leftArr[i++] = arr[x];			
		}
		
		// loop elements to right
		for(int x=mid+1;x<=right;x++) {			
			rightArr[j++] = arr[x];		
		}
		
		
		// intialise i and j t 0 again
		i=0;j=0;
		
		
		// sort left and right array
		while(i<leftArr.length && j<rightArr.length) {
			
			if(leftArr[i]<=rightArr[j]) {
				arr[k++] = leftArr[i++];
				
			}
			else {
				
				arr[k++]=rightArr[j++];
			}
			
		}
		
		// handle exhausted elements
		while(i<leftArr.length) {
			arr[k++]=leftArr[i++];
		}
		
		
		while(j<rightArr.length) {
			arr[k++]= rightArr[j++];
		}
		
		
		
		System.out.println("final array");
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	
	static void mergeSort(int arr[],int left,int right) {
		
		if(left<right) {
			
			int mid = left + (right-left)/2;
			
			mergeSort(arr, left, mid);
			System.out.println("after left sort");
			mergeSort(arr, mid+1, right);
			
			merge(arr,left,mid,right);
			System.out.println("after right sort");
		}
		
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	

}
