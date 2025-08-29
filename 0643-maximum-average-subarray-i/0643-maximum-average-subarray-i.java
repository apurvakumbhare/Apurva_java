class Solution {
   public double findMaxAverage(int[] nums, int k) {
     double max = Double.NEGATIVE_INFINITY;
        double sum=0;
        double avg=0;
        int i=0;
        int j =0;
        while(j< nums.length){
            sum+=nums[j];
            if((j-i)+1<k){
                j++;
            }
           else if((j-i)+1==k){
              avg=sum/k;
                max=Math.max(avg,max);
                sum-=nums[i];
                i++;
                j++;
            }
        }
        return max;
    }
}