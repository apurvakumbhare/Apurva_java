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
    public List<List<Integer>> levelOrderBottom(TreeNode node) {
     
        List<List<Integer>> result=new ArrayList<>();
        if(node==null){
            return result;
        }
        Queue<TreeNode> q=new LinkedList<>();
       

        q.add(node);
      
        while (!q.isEmpty()){
            int level=q.size();
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < level; i++) {
                TreeNode CurrentNode=q.remove();
              
                    list.addLast(CurrentNode.val);
                
                if(CurrentNode.left!=null){
                    q.add(CurrentNode.left);
                }
                if(CurrentNode.right!=null){
                    q.add(CurrentNode.right);
                }
            }

            result.add(0,list);
           
        }
        return result;
    
    }
}