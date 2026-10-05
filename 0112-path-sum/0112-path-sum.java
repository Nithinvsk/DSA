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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        if(root == null) {
            return false;
        }
        Stack<TreeNode> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(root);
        s2.push(root.val);
        while(!s1.isEmpty()) {
            TreeNode temp = s1.pop();
            int tempsum =s2.pop();
            if(temp.left == null && temp.right == null) {
                if(tempsum == targetSum) {
                    return true;
                }
            }
            if(temp.left != null) {
                s1.push(temp.left);
                s2.push(tempsum+temp.left.val);
            }
            if(temp.right != null) {
                s1.push(temp.right);
                s2.push(tempsum+temp.right.val);
            }
        }
        return false;
    }
}