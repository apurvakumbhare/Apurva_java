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
    public int sumNumbers(TreeNode node) {
       int sum = Sum(node, 0, 0);
        return sum;
    }

    public  int Sum(TreeNode node, int num, int sum) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            num = num * 10 + node.val;
            sum = sum + num;
            num -= node.val;
            return sum;
        }
        sum += Sum(node.left, num * 10 + node.val, sum) + Sum(node.right, num * 10 + node.val, sum);

        return sum;
    } 
    }
