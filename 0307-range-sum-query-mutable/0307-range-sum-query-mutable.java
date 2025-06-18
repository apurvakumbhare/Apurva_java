class NumArray {
 Node node;
    public NumArray(int[] nums) {
    node= buildBinaryTree(nums,0,nums.length-1);
    }

    private Node buildBinaryTree(int[] nums,int start, int end) {  if (start > end) return null;
        if(start==end){
            Node node=new Node(start,end);
            node.value=nums[start];
            return node;
        }

        Node node=new Node(start,end);
        int mid = start + (end - start) / 2;
        node.left=buildBinaryTree( nums, start, mid);
        node.right=buildBinaryTree( nums,mid+1, end);
        node.value=node.left.value+node.right.value;
        return node;
    }
   public void update(int index , int value){
       node.value=update(node,index,value);
    }
    private int update(Node node,int index , int value) {

            if(node.start==index && node.end==index){
              
                node.value=value;
                return node.value;
            }
            int mid=node.start+(node.end-node.start)/2;
        if(index<=mid){
            update(node.left,index,value);
        }
        else{
            update(node.right,index,value);
        }
        node.value=node.left.value+node.right.value;
        return node.value;
    }
    public int sumRange(int left, int right) {
        return sumRange(node,left,right);
    }

    private int sumRange(Node node, int left, int right) {
        if(right<node.start || left>node.end){
            return 0;
        }
        if (left <= node.start && right >= node.end){
            return node.value;
        }
        return sumRange(node.left,left,right)+sumRange(node.right,left,right);
    }


    public class  Node {
        int value;
        int start;
        int end;
        Node left;
        Node right;
        public Node (int value) {
            this.value = value;
        }

        public Node(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}