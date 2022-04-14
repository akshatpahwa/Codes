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
    int start = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MAX_VALUE);
    }
    public TreeNode helper(int[] preorder, int bound){
        if(start == preorder.length || preorder[start] > bound)
            return null;
        TreeNode node = new TreeNode(preorder[start++]);
        node.left = helper(preorder, node.val);
        node.right = helper(preorder, bound);
        return node;  
    }
}