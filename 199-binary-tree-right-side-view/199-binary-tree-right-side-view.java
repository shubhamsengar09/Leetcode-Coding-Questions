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
    int pl;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list= new ArrayList();
        pl= -1;
        right(root,list,1);
        return list;
        
    }
    public void right(TreeNode root, List<Integer>l , int level){
        if(root == null) return ;
        if(level>pl){
            l.add(root.val);
            pl = level;
        }
        right(root.right, l,level+1);
        right(root.left, l, level+1);
    }
}