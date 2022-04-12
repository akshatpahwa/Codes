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
        List<String> list = new ArrayList<>();
        looping(list, "", root);
        return list;
    }
    public void looping(List<String> list, String path, TreeNode root){
        // if(root == null)
        //     return;
        if(root.left == null && root.right == null)
            list.add(path + root.val);
        if(root.left != null)
            looping(list, path + root.val + "->", root.left);
        if(root.right != null)
            looping(list, path + root.val + "->", root.right);
    }
}