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
    int max = 0;
    boolean result = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        helper(root);
        return result;
    }
    public int helper(TreeNode root){
        if(root == null)
            return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        if(Math.abs(left - right) > 1)
            result = false;
        return 1 + Math.max(left, right);
    }
}