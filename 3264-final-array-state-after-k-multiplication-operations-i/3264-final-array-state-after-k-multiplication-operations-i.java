class Solution {
    public static  int[] getFinalState(int[] nums, int k, int multiplier) {

        PriorityQueue<Integer> queue=new PriorityQueue<>((a, b)->{
            if(nums[a]==nums[b]){
                return a-b;
            }
            return nums[a]-nums[b];
        });
        for (int i = 0; i < nums.length; i++) {
            queue.add(i);
        }
        for (int i = 0; i < k; i++) {
            int index=queue.poll();
            nums[index]=multiplier*nums[index];
            System.out.println(index);
            System.out.println(Arrays.toString(nums));
            queue.add(index);
        }
        return nums;
    }
}