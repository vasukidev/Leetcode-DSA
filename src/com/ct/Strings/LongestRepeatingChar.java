package com.ct.Strings;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingChar {
	
	public static void main(String[] args) {
		
	}
	
	 public int characterReplacement(String s, int k) {
	        int n=s.length();
	        int maxlen=0,maxf=0;
	        int left=0,right=0;
	        
	        // use hash map to put the char as key and it's frequency as value
	        Map<Character,Integer>map=new HashMap<>();
	      
	     // use right pointer for traversing
	        while(right<n){
	            char ch=s.charAt(right);
	            map.put(ch,map.getOrDefault(ch,0)+1);
	            maxf=Math.max(maxf,map.get(ch));

	            
	            // if replacements are more than k 
	            // changes = (right-left+1) - maxf
	            while((right-left+1)-maxf>k){
	                char ch2=s.charAt(left);
	                // decrement the frequency of the char
	                map.put(ch2,map.get(ch2)-1); //decrement the frequency
	                left++;

	            }
	            // if((j-i+1)+maxf<=k){
	                maxlen=Math.max(maxlen,right-left+1);
	            // }

	            right++;
	        }
	        return maxlen;

	    }

}
