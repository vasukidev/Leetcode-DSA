package com.ct.Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Pair{
	
	// Anuj's approach
	int hd;
	TreeNode node;
	
	Pair(int hd,TreeNode node){
		this.hd=hd;
		this.node=node;
	}
}

public class VerticalOrderTraversal {
	
	
	
	public static void main(String[] args) {
		
		List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		//ArrayList ans = verticalOrder(root);
		
		//result.add(ans);
		
	}
	
	public List<List<Integer>> verticalOrder(TreeNode node) {
		
		
     List<List<Integer>> result = new ArrayList<List<Integer>>();
	

    // edge case
    if(node==null){

        return result;
    }
    
    // // Queue for BFS, holding pairs of TreeNode and horizontal distance
    // We use a queue in vertical order traversal because we are performing a Breadth-First Search (BFS)
	Queue<Pair> q = new  ArrayDeque<>();
	
	// taking a tree map so that keys are sorted
	// in hash map keys are not sorted 
	Map<Integer,ArrayList<Integer>> map = new TreeMap<>();
	
	
	
	// first add the root node to the queue
	q.add(new Pair(0, node));
	
	while(!q.isEmpty()) {
		
		// keep removing from the queue
		// q.poll() is also for removing
		Pair cur = q.remove();
		
		if(map.containsKey(cur.hd)) {
			
	    // if already contains then get the key which has the same HD
			// add the node
			map.get(cur.hd).add(cur.node.val);
		}
		
		else {
			// create a temp list
			// add the cur node val to the list
			// put the hd as key and list as val
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(cur.node.val);
			map.put(cur.hd, temp);
		}
		
		
		// check for left node
		if(cur.node.left!=null) {
			
			q.add(new Pair(cur.hd-1,cur.node.left));
		}
		// check for right node 
		if(cur.node.right!=null) {
			
			q.add(new Pair(cur.hd+1, cur.node.right));
		}
	}
	
	
	// get entry set from the map 
	for(Map.Entry<Integer,ArrayList<Integer>> entry: map.entrySet()) {
		
		// map.entrySet() gives us an array list
		// add each value of the array list to the result list
		// addAll means only values
		result.add(entry.getValue());
		
		
	}
	
	// returns list of list
	return result;

 
    
}


}
