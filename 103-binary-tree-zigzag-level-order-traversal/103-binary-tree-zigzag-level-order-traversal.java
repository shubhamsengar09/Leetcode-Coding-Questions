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
        List<List<Integer>> res = new ArrayList<>();
        zigzag(root,0,res);
        return res;
    }
    public void zigzag(TreeNode root, int lev, List<List<Integer>>list){
        if(root == null) return;
        if(list.size()<=lev) list.add(new ArrayList<>());
        if(lev %2==0) list.get(lev).add(root.val);
        else list.get(lev).add(0,root.val); 
        zigzag(root.left , lev +1, list);
        zigzag(root.right, lev+1, list);
    }
}