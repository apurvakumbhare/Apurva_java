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
 import java.util.ArrayList;
class Solution {
     public void flatten(TreeNode node){
        ArrayList<Integer> a=preorderTraversal(node);
        if(a.isEmpty()){
            return;
        }
        node.val=a.remove(0);
        node.left=null;
        TreeNode current=node;
        while (!a.isEmpty()){
           current.right=new TreeNode(a.remove(0));
           current=current.right;
           current.left=null;
        }
     
    }
     static ArrayList<Integer> a=new ArrayList<>();
    private  ArrayList<Integer> preorderTraversal(TreeNode node) {
       
        if(node==null){
            return  a;
        }
        a.add(node.val);
        preorderTraversal(node.left);
        preorderTraversal(node.right);

        return  a;
    }
}