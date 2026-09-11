class Solution {
    public int findDuplicate(int[] nums) {
         int i = 0;

    while (i < nums.length) {
          int correctindex=nums[i]-1;
            if(nums[correctindex]!=nums[i]){
                int temp=nums[i];
                nums[i]=nums[correctindex];
                nums[correctindex]=temp;
            }else i++;
        }
        return nums[nums.length-1];
    }
}