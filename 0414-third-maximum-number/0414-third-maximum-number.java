class Solution {
     public static  int thirdMax(int[] nums) {
        TreeSet<Integer> pq=new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <2 ; i++) {
            if (!pq.isEmpty()) {
               max=Math.max(max, pq.pollFirst());
            }
        }        return (!pq.isEmpty())? pq.pollFirst():max;
    }
}