import java.util.*;

class Solution {
    private Map<String, Integer> memo = new HashMap<>();

    public int waysToReachStair(int k) {
        return waysToReachStair(k, 0, 1, false);
    }

    private int waysToReachStair(int k, int jump, int i, boolean down) {
        if (i > k + 1) return 0;

        String key = i + "," + jump + "," + down;
        if (memo.containsKey(key)) return memo.get(key);

        int ans = (i == k) ? 1 : 0;

        if (i != 0 && !down) {
            ans += waysToReachStair(k, jump, i - 1, true);
        }

        ans += waysToReachStair(k, jump + 1, i + (1 << jump), false);

        memo.put(key, ans);
        return ans;
    }
}
