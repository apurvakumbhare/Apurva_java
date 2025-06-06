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
   public static boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        
        Queue<TreeNode> queue=new LinkedList<>();
        
        queue.add(root.left);
        queue.add(root.right);
        while(!queue.isEmpty()){
           TreeNode first=queue.remove();
           TreeNode second=queue.remove();
            if(first==null && second==null){
                continue;
            }
            if(first==null || second==null||first.val!= second.val){
                return false;
            }
            
            
                queue.add(first.left);
                queue.add(second.right);
            
                queue.add(first.right);
                queue.add(second.left);
            
        }
        return true;
    }
}