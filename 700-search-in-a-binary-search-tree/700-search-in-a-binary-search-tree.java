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
    TreeNode ans;
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return root;
        iteration(root, val);
        return ans;
    }
    public void iteration(TreeNode root, int val){
        if(root == null)
            return;
        if(val == root.val){
            ans = root;
            return;
        }
        if(root.val > val)
            searchBST(root.left, val);
        if(root.val < val)
            searchBST(root.right, val);
    }
}