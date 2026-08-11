// Last updated: 8/11/2026, 11:34:08 AM
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>paths=new ArrayList<>();
        if(root==null)
        return paths;
        if(root.left==null && root.right==null){
            paths.add(String.valueOf(root.val));
            return paths;
        }
        List<String> leftpaths=binaryTreePaths(root.left);
        List<String> rightpaths=binaryTreePaths(root.right);
        for(String path:leftpaths){
            paths.add(root.val+"->"+path);
        }
        for (String path:rightpaths) {
            paths.add(root.val+"->"+path);
        }
        return paths;
    }
}        
        
        
    