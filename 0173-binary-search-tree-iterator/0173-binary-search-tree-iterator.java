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
class BSTIterator {
Stack<TreeNode> result;
    public BSTIterator(TreeNode root) {
        result=new Stack<>();
        iterate(result,root);
    }
    public void iterate(Stack<TreeNode> result,TreeNode root){
        if(root!=null){
            result.push(root);
            iterate(result,root.left);
        }
    }
    public int next() {
       TreeNode node =result.pop();
       if (node.right != null) {
            iterate(result,node.right); 
        }
       return node.val ;
    }
    
    public boolean hasNext() {
     return !result.isEmpty();

    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */