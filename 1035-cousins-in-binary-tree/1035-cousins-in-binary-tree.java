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
    static boolean isCousins(TreeNode node, int a, int b) {
            return !siblings(node, a,b) && level(node, a, 0) == level(node, b, 0);
        }


        private static boolean siblings(TreeNode node, int a, int b) {
            if (node == null) {
                return false;
            }
             if (node.left != null && node.right != null) {
            if ((node.left.val == a && node.right.val == b) ||
                (node.left.val == b && node.right.val == a)) {
                return true;
            }
        }
            return siblings(node.left, a, b) || siblings(node.right, a, b);
        }

        private static int level(TreeNode root, int a, int lev) {
            int levell;
            if (root == null) {
                return -1;
            }
            if (a == root.val) {
                return lev;
            }
            levell = level(root.left, a, lev + 1);
            if (levell == -1) {
                levell = level(root.right, a, lev + 1);
            }
            return levell;
        }

}