// Last updated: 8/11/2026, 11:29:41 AM
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
    public boolean evaluateTree(TreeNode root) {
         if (root.left == null && root.right == null) {
            return root.val == 1;
        }

        boolean leftVal = evaluateTree(root.left);
        boolean rightVal = evaluateTree(root.right);

        if (root.val == 2) { // OR
            return leftVal || rightVal;
        } else if (root.val == 3) { // AND
            return leftVal && rightVal;
        }

        return false; // should never reach here for valid input
    }
    
}