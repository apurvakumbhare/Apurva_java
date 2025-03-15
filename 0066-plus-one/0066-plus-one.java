class Solution {
    public int[] plusOne(int[] nums) {
      
        int n = nums.length;
        for (int i = n - 1; i >=0 ; i--) {
            if (nums[i] < 9) {
                nums[i]++; // Simple case: just increment and return
                return nums;
            }
            nums[i] = 0; // If it's 9, turn it to 0 and continue
        }

        // If all digits were 9, create a new array
        int[] newNums = new int[n + 1];
        newNums[0] = 1; // First digit is 1, rest are 0 by default
        return newNums;
    }
}