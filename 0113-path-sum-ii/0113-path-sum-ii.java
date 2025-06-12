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
    public List<List<Integer>> pathSum(TreeNode node, int sum) {
        List<List<Integer>> ans=new ArrayList<>();
        if (node == null) {
        return ans;
    }
        helper(node,sum,ans,new ArrayList<>());
       return ans;    }

    private void helper(TreeNode node, int sum, List<List<Integer>> ans, List<Integer> subAns) {
        if (node == null) {
            return ;
        }
        subAns.add(node.val);
        if (node.left == null && node.right == null && sum == node.val) {
            ans.add(new ArrayList<>(subAns));
        }
        else{
        helper(node.left, sum - node.val,ans,subAns);
        helper(node.right, sum - node.val,ans,subAns);}
        subAns.remove(subAns.size() - 1);
    }
}