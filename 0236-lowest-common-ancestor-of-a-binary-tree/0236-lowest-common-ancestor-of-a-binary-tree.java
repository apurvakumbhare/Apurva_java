/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) {
                return null;
            }
            if (root == p || root == q) {
                return root;
            }
            TreeNode first = lowestCommonAncestor(root.left, p, q);
            TreeNode second = lowestCommonAncestor(root.right, p, q);
            if (first != null && second != null) {
                return root;
            }
            if (first != null) {
                return first;
            } else {
                return second;
            }
        }
}