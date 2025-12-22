class Solution {
   public int lastStoneWeight(int[] nums) {

        PriorityQueue<Integer> que=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            que.add(nums[i]);
        }
        int x=0,y=0;
        int num=0;
        while (que.size()>1) {
            x= que.poll();
            y= que.poll();
            if(x==y){
                continue;
            }else{
                que.add(Math.abs(y-x));
            }
        }
        return que.isEmpty() ? 0 : que.poll();
    }
}