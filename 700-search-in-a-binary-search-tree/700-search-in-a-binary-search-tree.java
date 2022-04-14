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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return root;
        TreeNode cur = root;
        while(cur != null){
            if(cur.val == val)
                return cur;
            else if(cur.left == null && cur.right == null)
                break;
            else if(cur.val > val){
                if(cur.left != null)
                    cur = cur.left;
                else 
                    break;
            }
            else if(cur.val < val){
               if(cur.right != null)
                    cur = cur.right;
                else break;
            }
            else
                break;
        }
        return null;
    }
}