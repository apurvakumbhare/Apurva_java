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
  public TreeNode increasingBST(TreeNode root) {
        if(root==null){
            return root;
        }
        ArrayList<Integer> inord=new ArrayList<>();
                inorder(root,inord);
        TreeNode node=        helper(inord,0);
        return node;
    }

    private TreeNode helper(ArrayList<Integer> inord, int i) {
        if(i==inord.size()){return null;}
        TreeNode node=new TreeNode(inord.get(i));
        node.right=helper(inord,i+1);
        
        return node;
    }

    private void inorder(TreeNode root,ArrayList<Integer> ans) {

        if(root==null){
            return ;
        }
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
        return;
    }
}