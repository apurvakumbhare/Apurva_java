class Solution {
   public int splitArray(int[] nums, int k) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        if (k == 1) return sum;
        if (k == nums.length) return max;
        while (max < sum) {

            int mid = (sum + max) / 2;
        int pieces = 1,currentSum=0;
        for (int i = 0; i < nums.length; i++) {
            if (currentSum + nums[i] > mid) {
                currentSum = nums[i];
                pieces++;
            } else {
                currentSum += nums[i];
            }
        }
        if (pieces > k) max = mid + 1;
        else sum= mid;
    }
return  max;
    }
}





















