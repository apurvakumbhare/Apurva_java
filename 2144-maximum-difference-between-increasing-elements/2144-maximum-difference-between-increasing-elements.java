
  class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1;
        int minVal = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > minVal) {
                ans = Math.max(ans, nums[i] - minVal);
            }
            minVal = Math.min(minVal, nums[i]);
        }
        
        return ans;
    }
}

