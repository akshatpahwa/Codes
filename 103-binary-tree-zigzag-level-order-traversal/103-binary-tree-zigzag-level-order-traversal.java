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
        List<Integer> values = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        boolean left_bol = true;
        if(root == null)
            return list;
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();                
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right); 
                
                if(left_bol == true)
                    values.add(node.val);
                else
                    values.add(0, node.val);
            }
            left_bol = !left_bol;
            list.add(values);
            values = new ArrayList<>();
        }
        return list;
    }
}