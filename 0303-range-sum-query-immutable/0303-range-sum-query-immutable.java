class NumArray {
    Node root;
    public NumArray(int[] nums) {
      root= populated(nums,0,nums.length-1);
    }

    private Node populated(int[] nums, int s, int e) {
        if(s==e){
            Node node=new Node(s,e);
            node.val=nums[s];
            return node;
        }
        Node node=new Node(s,e);
        int mid=s+(e-s)/2;
        node.left=populated(nums,s,mid);
        node.right=populated(nums,mid+1,e);
        node.val=node.left.val+node.right.val;
        return node;
    }

    public int sumRange(int left, int right) {
        return sumRange(root,left, right);
    }

    private int sumRange(Node root, int left, int right) {
        if(root==null){
            return 0;
        }
        if(root.s>right||root.e<left){
            return 0;
        }
        if(root.s>=left&&root.e<=right){
            return root.val;
        }
        return sumRange(root.left,left, right)+sumRange(root.right,left, right);
    }

    public static void main(String[] args) {
        NumArray n=new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(n.sumRange(0,2));
    }
    class Node{
        int val;
         int s;
         int e;
        Node left;
        Node right;

         public Node(int val) {
             this.val = val;
         }

         public Node(int s, int e) {
             this.s = s;
             this.e = e;
         }
     }
}