/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> ans=new ArrayList<>();
            if(root==null){
                return  ans;
            }
            Queue<Node> queue=new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                int level=queue.size();
                List<Integer> subAns=new ArrayList<>();
                for (int i = 0; i < level; i++) {
                   Node current=queue.remove();
                   subAns.add(current.val );
                   for(Node child:current.children){
                       queue.add(child);
                   }
                }
                ans.add(subAns);
            }
            return ans;
        }
}