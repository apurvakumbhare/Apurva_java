class Solution {
 public double minimumAverage(int[] nums) {
    Arrays.sort(nums);
        double min=Double.MAX_VALUE;
    int i=0,j=nums.length-1;
    while(i<j){
        min=Math.min(min,(nums[i]+nums[j])/2.0);
        i++;
        j--;
    }
    return min;
    }
}