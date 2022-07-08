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
    List<Integer> list = new ArrayList<>();
    public List<Integer> getLonelyNodes(TreeNode root) {
        if(root == null)
            return list;
        if(root.left == null && root.right != null)
            list.add(root.right.val);
        if(root.left != null && root.right == null)
            list.add(root.left.val);
        getLonelyNodes(root.left);
        getLonelyNodes(root.right);
        return list;
    }
}