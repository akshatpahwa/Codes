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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        boolean zig = true;
        if(root == null)
            return list;
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            l1 = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode temp = queue.poll();
                if(zig)
                    l1.add(temp.val);
                else
                    l1.add(0, temp.val);
                if(temp.left != null)
                    queue.add(temp.left);
                if(temp.right != null)
                    queue.add(temp.right);
            }
            zig = !zig;  
            list.add(l1);
        }
        return list;
    }
}