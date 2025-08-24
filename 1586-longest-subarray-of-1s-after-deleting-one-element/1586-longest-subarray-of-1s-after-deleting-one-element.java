// class Solution {
    //bruteforce
    // public int longestSubarray(int[] nums) {
    //      if(nums.length==0)return 0;
    //      int max=0;
    //      for(int i=0;i<nums.length;i++){
    //        max=Math.max(max ,check(nums,i));
    //      }
    //      return max;
    // }
    // int check(int[] nums,int j){
    //        if(nums.length==0)return 0;
    // int finall= Integer.MIN_VALUE;
    // int max=0;
    //     for (int i = 0; i < nums.length ; i++) {
    //         if(i==j)continue;
    //        if( nums[i]==1){
    //         max+=1;
    //         finall=Math.max(max,finall) ; 
    //        }else max=0;
    //     }
    //     if(finall== nums.length)return finall-1;
    //     else return finall;
    // }
    //optimised
    class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, zeroCount = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeroCount++;

            while (zeroCount > 1) {
                if (nums[left] == 0) zeroCount--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }
}
// }