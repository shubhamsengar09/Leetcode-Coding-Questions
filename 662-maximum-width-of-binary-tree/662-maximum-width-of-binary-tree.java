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
    HashMap<Integer, Integer>mp = new HashMap<>();
    int width = 0;
    public int widthOfBinaryTree(TreeNode root) {
        max(root,0,0);
        return width;
    }
    public void max(TreeNode root, int depth, int pos){
        if(root==null) return;
        if(!mp.containsKey(depth)) mp.put(depth, pos);
        width = Math.max(width, pos-mp.get(depth)+1);
        max(root.left, depth+1, pos*2);
        max(root.right,depth+1,pos*2+1);
    }
}