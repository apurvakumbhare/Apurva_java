import java.util.Arrays;

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums); 
        int n = nums.length;
        int max = 0;

        for (int i = n - 1; i >= 2; i--) {
            int a = nums[i - 2], b = nums[i - 1], c = nums[i]; 
            if (a + b > c ) {
                max = Math.max(max, a + b + c);
            }
        }
        return max;
    }
}
