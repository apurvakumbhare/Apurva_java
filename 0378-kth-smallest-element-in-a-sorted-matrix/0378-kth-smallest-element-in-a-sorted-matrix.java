class Solution {
   public int kthSmallest(int[][] nums, int k) {
    PriorityQueue<Integer>  maxheap=new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                maxheap.add(nums[i][j]);
                if(maxheap.size()>k){
                    maxheap.poll();
                }
            }
        }
        return maxheap.peek();
    }
}