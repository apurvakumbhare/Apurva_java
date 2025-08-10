class Solution {
   public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        int zeroCount = 0;
        for (int num : nums) {
            sum += num;
            if (num == 0) zeroCount++;
        }

        if (Math.abs(target) > sum || (sum + target) % 2 != 0) return 0;

        int s = (sum + target) / 2;

        return subsetSumWithZeros(nums, s, zeroCount);
    }

    private int subsetSumWithZeros(int[] nums, int target, int zeroCount) {
        int n = nums.length;
        int[][] dp = new int[n + 1][target + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            int curr = nums[i - 1];
            for (int j = 0; j <= target; j++) {
                if (curr == 0) {
                   
                    dp[i][j] = dp[i - 1][j] * 2;
                } else if (curr <= j) {
                    dp[i][j] = dp[i - 1][j - curr] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][target];
    }
}