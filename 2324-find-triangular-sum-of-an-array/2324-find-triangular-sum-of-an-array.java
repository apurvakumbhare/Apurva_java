class Solution {
   public int triangularSum(int[] nums) {
    if(nums.length==1)return nums[0];
    int[] currentnums=new int[nums.length-1];
        for (int i = 0; i < currentnums.length; i++) {
            currentnums[i]=(nums[i]+nums[i+1])%10;
        }
        return triangularSum(currentnums);
    }   
}