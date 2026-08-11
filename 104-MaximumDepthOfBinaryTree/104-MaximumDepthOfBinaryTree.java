// Last updated: 8/11/2026, 11:35:46 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Solution {
    int height,count= 0;  
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        dfs(root);
        return height;
    }
    public void dfs(TreeNode node) {
        if (node == null) return;
        count++; 
        if (count > height) {
            height = count; 
        }
        dfs(node.left);
        dfs(node.right);
        count--; 
    }
}