class Solution {
   public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        long sum=0;
        int i=0;
        HashSet<Integer> set=new HashSet<>();
        for (int j = 0; j < nums.length; j++) {
            while (set.contains(nums[j])){
                set.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
            set.add(nums[j]);
            sum+=nums[j];
              if ((j - i + 1) > k) {
                set.remove(nums[i]);   // \U0001f525 missing line
                sum -= nums[i];
                i++;
            }
            if((j-i+1)==k){
                max=Math.max(sum,max);
            }
        }
          return max; 
        }
}