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
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int count = helper(root, 1);
        return count;
    }
    public int helper(TreeNode root, int count){
        if(root == null)
            return count;
        System.out.println(count);
        helper(root.left, count+1);
        helper(root.right, count+1);
        max = Math.max(max, count);
        return max;
    }
}