class Solution {
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return helper(root, 0);
    }

    private int helper(TreeNode root, int number) {
        if (root == null) {
            return 0;
        }

      
        number = number * 2 + root.val;

        if (root.left == null && root.right == null) {
            return number;
        }

        return helper(root.left, number) + helper(root.right, number);
    }
}
