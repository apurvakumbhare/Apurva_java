class Solution {
          public static int[] leftRightDifference(int[] nums) {
        int[] answer=new int[nums.length];
        int[] leftSum=new int[nums.length];
        int[] rightSum=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            leftSum[i]=((i!=0)?leftSum[i-1]:0)+nums[i];
            rightSum[nums.length-1-i]=((i!=0)?rightSum[nums.length - i]:0)+nums[nums.length-1-i];
           
        }
        for (int i = 0; i < nums.length; i++) {
            answer[i]=Math.abs(leftSum[i]- rightSum[i]);
          
        }

        return answer;
    }

}