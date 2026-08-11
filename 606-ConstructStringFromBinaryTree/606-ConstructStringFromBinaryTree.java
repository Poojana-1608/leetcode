// Last updated: 8/11/2026, 11:32:31 AM
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
    public String tree2str(TreeNode root) {
        if (root == null) return "";

        // Start with the root's value
        String result = Integer.toString(root.val);

        // If left child exists, process it
        if (root.left != null) {
            result += "(" + tree2str(root.left) + ")";
        }
        // If left is null but right exists, we need to add ()
        else if (root.right != null) {
            result += "()";
        }

        // If right child exists, process it
        if (root.right != null) {
            result += "(" + tree2str(root.right) + ")";
        }

        return result;
    }
}
