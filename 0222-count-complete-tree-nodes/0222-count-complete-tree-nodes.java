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
    public int countNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.right == null && root.left == null)  {
            return 1;
        }
        TreeNode temp = root;
        int l = 0, r = 0;
        while(temp != null) {
            l++;
            temp = temp.left;
        }
        temp = root;
        while(temp != null) {
            r++;
            temp = temp.right;
        }
        int pow = 0;
        if(l == r) {
            pow = (int)Math.pow(2,l)-1;
            return pow;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}