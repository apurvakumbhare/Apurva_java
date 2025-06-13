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
  public int[] findMode(TreeNode root) {
    if(root.left==null &&root.right==null ){
            return new int[]{root.val};
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        iterated(root, map);
         int maxFreq = 0;
        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for (Map.Entry<Integer, Integer> en : map.entrySet() ){
            if(en.getValue() == maxFreq){
                ans.add(en.getKey());
            }
        }
       
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    private void iterated(TreeNode root, HashMap<Integer, Integer> map) {
        if(root==null){
            return;
        }
        if (!map.containsKey(root.val)){
            map.put(root.val, 1);
    }
    else{
        int old=map.get(root.val);
        map.replace(root.val,old,old+1);
    }
    iterated(root.left,map);
        iterated(root.right,map);
}
}