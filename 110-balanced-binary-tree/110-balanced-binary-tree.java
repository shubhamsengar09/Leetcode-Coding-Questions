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
    public boolean isBalanced(TreeNode root) {
        return check(root) != -1;
    }
    int check(TreeNode root){
        if(root == null) return 0;
        int lefth = check(root.left);
        if(lefth==-1) return -1;
        int righth = check(root.right);
        if(righth==-1) return -1;
        
        if(Math.abs(lefth - righth)>1) return -1;
        return Math.max(lefth, righth)+1;
    } 
}