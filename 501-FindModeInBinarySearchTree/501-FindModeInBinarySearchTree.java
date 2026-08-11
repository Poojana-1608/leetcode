// Last updated: 8/11/2026, 11:32:47 AM
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
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    private Integer prev = null;
    private int count = 0;
    private int maxCount = 0;
    private int modeCount = 0;
    private int[] modes;
    private int index = 0;

    public int[] findMode(TreeNode root) {
        // First pass: find maxCount (most times any value appears)
        inorder(root, false);

        // Create array of correct size to hold modes
        modes = new int[modeCount];

        // Reset variables to use again
        prev = null;
        count = 0;
        index = 0;

        // Second pass: actually collect the modes
        inorder(root, true);

        return modes;
    }

    private void inorder(TreeNode node, boolean collect) {
        if (node == null) return;

        // Traverse left subtree
        inorder(node.left, collect);

        // Visit current node
        if (prev != null && node.val == prev) {
            count++;
        } else {
            count = 1;
        }

        if (!collect) {
            if (count > maxCount) {
                maxCount = count;
                modeCount = 1;
            } else if (count == maxCount) {
                modeCount++;
            }
        } else {
            if (count == maxCount) {
                modes[index] = node.val;
                index++;
            }
        }

        prev = node.val;

        // Traverse right subtree
        inorder(node.right, collect);
    }
}
