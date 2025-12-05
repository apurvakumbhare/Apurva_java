class Solution {
public int countPartitions(int[] nums) {
        int[] leftSum=new int[nums.length];
        int[] rightSum=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            leftSum[i]=((i!=0)?leftSum[i-1]:0)+nums[i];
            rightSum[nums.length-1-i]=((i!=0)?rightSum[nums.length - i]:0)+nums[nums.length-1-i];

        }
        int count =0;
        for (int i = 0; i < nums.length-1; i++) {
           if(Math.abs(leftSum[i]-rightSum[i+1] )%2==0)count++;
        }

        return count;
    }
}