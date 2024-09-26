package com.ct.Trees;

import java.util.ArrayList;
import java.util.List;

//Definition for a binary tree node.
/*class TreeNode {
 int val;
 TreeNode left;
 TreeNode right;
 
 TreeNode(int x) {
     val = x;
 }
}*/

// LC 257. Binary Tree Paths

public class RootLeafString {
	
	public static void main(String[] args) {
		
	}
	
	  // Function to find all root-to-leaf paths in a binary tree.
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            // Start DFS from the root node with an empty path string.
            dfs(root, "", paths);
        }
        return paths;
    }

    // Helper function to perform DFS and track paths.
    private void dfs(TreeNode node, String path, List<String> paths) {
        // Add current node's value to the path.
        path += node.val;
        
        // If it's a leaf node (no children), add the path to the list.
        if (node.left == null && node.right == null) {
            paths.add(path);
        } else {
            // If not a leaf, continue the path with "->" and explore both children.
            if (node.left != null) {
                dfs(node.left, path + "->", paths);
            }
            if (node.right != null) {
                dfs(node.right, path + "->", paths);
            }
        }
    }

}
