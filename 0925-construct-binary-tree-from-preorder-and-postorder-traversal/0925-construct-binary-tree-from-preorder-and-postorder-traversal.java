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
   public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
    if(preorder.length!=postorder.length){
        return null;
    }
    return constructFromPrePost(preorder ,0,preorder.length-1,postorder,0,postorder.length-1);
    }

    private TreeNode constructFromPrePost(int[] preorder, int prestart, int preend, int[] postorder, int poststart, int postend) {
    if(prestart>preend||poststart>postend){
        return null;
    }TreeNode root=new TreeNode(preorder[prestart]);
    if(prestart==preend){
        return root;
    }
    int leftval=preorder[prestart+1];
    int idx=0;
    while(postorder[idx]!=leftval){
        idx++;
    }
    int left= idx - poststart + 1;

    root.left=constructFromPrePost(preorder,prestart+1,prestart+left,postorder,poststart,idx);
        root.right=constructFromPrePost(preorder,prestart+left+1,preend,postorder,idx+1,postend-1);
    return root;
    }
}