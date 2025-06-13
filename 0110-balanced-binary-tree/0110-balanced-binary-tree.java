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
    public boolean isBalanced(TreeNode node) {
        if(node==null || (node.left==null&&node.right==null)){
            return true;
        }
      
        return maxdepth(node.left)-maxdepth(node.right )<=1&& maxdepth(node.left)-maxdepth(node.right )>=-1 && isBalanced(node.right) &&isBalanced(node.left);
    }
    public int maxdepth(TreeNode node) {
      if(node==null){
            return 0;
        }
        return Math.max(maxdepth(node.left) ,maxdepth(node.right))+1;  
    }
}