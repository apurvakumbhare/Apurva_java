class Solution {
     public long maxKelements(int[] nums, int k) {
        long score=0;
       PriorityQueue<Integer> que=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            que.add(nums[i]);
        }
        int removed=0;
        for (int i = 0; i < k; i++) {
            removed= que.poll();
            score+=removed;
            que.add((removed+2)/3);
        }
        return score;
    }
}