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
        List<List<Integer>> ans = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        if(root == null) {
            return ans;
        }
        while(!s1.isEmpty() || !s2.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            while(!s1.isEmpty()) {
                TreeNode temp = s1.pop();
                level.add(temp.val);
                if(temp.left != null) {
                    s2.push(temp.left);
                }
                if(temp.right != null) {
                    s2.push(temp.right);
                }
            }
            if(!level.isEmpty()) {
                ans.add(level);
            }
            level = new ArrayList<>();
            while(!s2.isEmpty()) {
                TreeNode curr = s2.pop();
                level.add(curr.val);
                if(curr.right != null) {
                    s1.push(curr.right);
                }
                if(curr.left != null) {
                    s1.push(curr.left);
                }
            }
            if(!level.isEmpty()) {
                ans.add(level);
            }
        }
        return ans;
    }
}