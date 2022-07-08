/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans, target;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target = target;
        inorder(original, cloned);
        return ans;
    }
    public void inorder(TreeNode original, TreeNode cloned){
        if(original != null){
            inorder(original.left, cloned.left);
            if(original == target)
                ans = cloned;
            inorder(original.right, cloned.right);
        }
    }
}