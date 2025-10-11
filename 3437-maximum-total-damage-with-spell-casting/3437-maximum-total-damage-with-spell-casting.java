import java.util.*;

class Solution {
    public long maximumTotalDamage(int[] power) {
        Arrays.sort(power);
        long[] dp = new long[power.length];
        Arrays.fill(dp, -1);
        return helper(power, 0, dp);
    }

    private long helper(int[] power, int i, long[] dp) {
        if (i >= power.length) return 0;
        if (dp[i] != -1) return dp[i];

        int curr = power[i];
        long take = 0;
        int j = i;

  
        while (j < power.length && power[j] == curr) {
            take += power[j];
            j++;
        }

        int next = j;
        while (next < power.length && power[next] <= curr + 2) {
            next++;
        }

        long res = Math.max(take + helper(power, next, dp), helper(power, j, dp));
        dp[i] = res;
        return res;
    }
}
