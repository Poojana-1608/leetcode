// Last updated: 8/11/2026, 11:35:18 AM
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
     List<Integer> m=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null) return m;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
         m.add(root.val);
        return m;
        
    }
}