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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i =0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        TreeNode root = build(preorder, 0 , preorder.length-1, inorder, 0 , inorder.length-1, mp);
        return root;
    }
    public TreeNode build(int[] preorder, int prestart, int preend, int[]inorder, int instart, int inend,HashMap<Integer,Integer> mp ){
        if(prestart>preend || instart>inend) return null;
        TreeNode root = new TreeNode(preorder[prestart]);
        int inroot = mp.get(root.val);
        int numleft = inroot-instart;
        root.left = build(preorder, prestart+1, prestart+numleft , inorder, instart, inroot-1,mp);
        root.right = build(preorder, prestart+1+numleft, preend, inorder, inroot+1, inend,mp);
        return root;
        
        
    }
}