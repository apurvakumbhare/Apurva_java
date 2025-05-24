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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> result =new ArrayList<>();
      if(root==null){
        return result;
      }

        Queue<TreeNode> q=new LinkedList<>(); 
        q.add(root);
        Boolean LefttoRight=true;
        while(!q.isEmpty()){
            int level=q.size();
          List<Integer> currentList=new ArrayList<>();
          
            for (int i = 0; i <level ; i++) {
                TreeNode current=q.remove();
                if(LefttoRight){
                    currentList.addLast(current.val);
                }
                else{
                    currentList.addFirst(current.val);
                }
               
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
                   
            }
           
          result.add(currentList);
          LefttoRight=!LefttoRight;
        }
       
     return result;
}
}