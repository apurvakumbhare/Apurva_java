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
  public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        helper1(list, root,"");
        return list;
    }

    private void helper1(List<String> list, TreeNode root,String s) {
        if(root==null) {
        return;
        }

        if(root.left==null && root.right==null){
            s=s+root.val;
            list.add(s);
            return;
        }
        else{
            s=s+root.val+"->";
        }
        helper1(list,root.left,s);
        helper1(list,root.right,s);
    }
}