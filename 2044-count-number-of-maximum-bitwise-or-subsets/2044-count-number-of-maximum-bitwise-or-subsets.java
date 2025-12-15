class Solution {
    int maxOr = 0;
    int count = 0;

    public int countMaxOrSubsets(int[] nums) {
        for (int n : nums) maxOr |= n;   // compute max OR
        dfs(nums, 0, 0);
        return count;
    }

    private void dfs(int[] nums, int idx, int currOr) {
        if (idx == nums.length) {
            if (currOr == maxOr) count++;
            return;
        }

        dfs(nums, idx + 1, currOr | nums[idx]);

        dfs(nums, idx + 1, currOr);
    }
}
