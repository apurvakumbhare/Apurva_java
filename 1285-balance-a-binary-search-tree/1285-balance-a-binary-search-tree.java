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
    public TreeNode balanceBST(TreeNode root) {
      List<TreeNode> inorderList = new ArrayList<>();
        inorderTraversal(root, inorderList);
        return buildBalancedBST(inorderList, 0, inorderList.size() - 1);
    }

    private void inorderTraversal(TreeNode root, List<TreeNode> list) {
        if (root == null) return;
        inorderTraversal(root.left, list);
        list.add(root);
        inorderTraversal(root.right, list);
    }

    private TreeNode buildBalancedBST(List<TreeNode> list, int low, int high) {
        if (low > high) return null;
        int mid = (low + high) / 2;
        TreeNode root = list.get(mid);
        root.left = buildBalancedBST(list, low, mid - 1);
        root.right = buildBalancedBST(list, mid + 1, high);
        return root;
    }
    }
