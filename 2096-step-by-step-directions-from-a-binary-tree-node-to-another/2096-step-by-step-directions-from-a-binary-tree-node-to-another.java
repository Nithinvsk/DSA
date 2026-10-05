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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        String ans1 = "";
        StringBuilder sb = new StringBuilder();
        path(root,sb,startValue);
        ans1 = sb.toString();

        String ans2 = "";
        sb = new StringBuilder();
        path(root,sb,destValue);
        ans2 = sb.toString();

        StringBuilder ans = new StringBuilder();
        int i=0,j=0;
        while(i<ans1.length() && j<ans2.length()) {
            if(ans1.charAt(i) == ans2.charAt(j)) {
                i++;
                j++;
            }
            else {
                break;
            }
        }
        while(i<ans1.length()) {
            ans.append("U");
            i++;
        }
        while(j<ans2.length()) {
            ans.append(ans2.charAt(j));
            j++;
        }
        return ans.toString();
    }
    boolean path(TreeNode root,StringBuilder sb,int x) {
        if(root == null) {
            return false;
        }
        if(root.val == x) {
            return true;
        }
        if(root.left != null) {
            sb.append("L");
            boolean leftAns = path(root.left,sb,x);
            if(leftAns) {
                return true;
            }
            sb.setLength(sb.length()-1);
        }
        if(root.right != null) {
            sb.append("R");
            boolean rightAns = path(root.right,sb,x);
            if(rightAns) {
                return true;
            }
            sb.setLength(sb.length()-1);
        }
        return false;
    }
}