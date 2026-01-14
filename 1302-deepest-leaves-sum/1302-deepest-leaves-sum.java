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
    int maxDepth=0;
    int sum=0;
     public int deepestLeavesSum(TreeNode root){
        deepestLeavesSum(root,0) ;
        return sum;
     }
   public void deepestLeavesSum(TreeNode root,int depth) {
    if(root==null)return ;
    if(root.left==null && root.right==null){
        if(depth>maxDepth){
            maxDepth=depth;
            sum=root.val;
        }else if(depth==maxDepth){
            sum+=root.val;
        }
    }
        deepestLeavesSum(root.left,depth+1);
        deepestLeavesSum(root.right,depth+1);
       
    }
}