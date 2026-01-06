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
   public int maxLevelSum(TreeNode node) {

        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        int levelwithMaxSum=1;
        int max=Integer.MIN_VALUE;
        int currentLevel = 0;
        while (!q.isEmpty()) {
            int level = q.size();
            int levelSum =0;
            currentLevel++;
            for (int i = 0; i < level; i++) {
                TreeNode CurrentNode = q.remove();
                levelSum+=CurrentNode.val;
                if (CurrentNode.left != null) {
                    q.add(CurrentNode.left);
                }
                if (CurrentNode.right != null) {
                    q.add(CurrentNode.right);
                }
            }
            if(levelSum>max){
                max=levelSum;
                levelwithMaxSum=currentLevel;
            }
        }
        return levelwithMaxSum;
    }
}