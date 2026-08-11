// Last updated: 8/11/2026, 11:31:12 AM
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
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return true;
        return check(root, root.val);
    }

    private boolean check(TreeNode node, int value) {
        if (node == null) return true;

        // If current node value is not equal to root value
        if (node.val != value) return false;

        // Recursively check left and right
        return check(node.left, value) && check(node.right, value);
    }
}