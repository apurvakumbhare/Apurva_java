class Solution {
     public int minStoneSum(int[] nums, int k) {

        int totalStones=0;
        PriorityQueue<Integer> que=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            que.add(nums[i]);
            totalStones+=nums[i];
        }
        int removed=0;
        for (int i = 0; i < k; i++) {
            removed= que.poll();
            totalStones-=removed/2;
            que.add(removed -(removed/2));
        }
        return  totalStones;
    }
}