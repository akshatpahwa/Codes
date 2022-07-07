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
    int sum = 0;
    public boolean checkTree(TreeNode root) {
        if(root == null)
            return true;
        int left = Check_sum(root.left);
        int right = Check_sum(root.right);
        if(root.val == (left + right))
            return true;
        return false;
    }
    public int Check_sum(TreeNode root){
        if(root == null)
            return sum;
        sum += Check_sum(root.left);
        sum += Check_sum(root.right);
        return root.val;
    }
}